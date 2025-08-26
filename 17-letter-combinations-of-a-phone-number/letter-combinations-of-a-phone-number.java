class Solution {
    private static final String[] KEYPAD = {
        "", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"
    };

    public List<String> letterCombinations(String digits) {
        List<String> result = new ArrayList<>();
        if (digits.isEmpty()) return result;

        StringBuilder current = new StringBuilder();
        backtrack(digits, 0, current, result);
        return result;
    }

    private void backtrack(String digits, int index, StringBuilder current, List<String> result) {
        if (index == digits.length()) {
            result.add(current.toString());
            return;
        }

        String letters = KEYPAD[digits.charAt(index) - '0'];
        for (int i = 0; i < letters.length(); i++) {
            current.append(letters.charAt(i));       // choose
            backtrack(digits, index + 1, current, result); // explore
            current.deleteCharAt(current.length() - 1);    // un-choose
        }
    }
}