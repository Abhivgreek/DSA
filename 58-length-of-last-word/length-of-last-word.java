class Solution {
    public int lengthOfLastWord(String s) {
        int last = s.length()-1; int count = 0;
        while(last>=0){
            if(s.charAt(last)==' ' && count!=0) break;
            else if(s.charAt(last)!=' ') count++;
            last--;
        }
        return count;

        // String []parts = s.split("\\s+");
        // return parts[parts.length-1].length();
    }
}


// EASY METHOD -

// class Solution {
//     public int lengthOfLastWord(String s) {
//         int i = s.length() - 1;
//         int length = 0;

//         while (i >= 0 && s.charAt(i) == ' ') {
//             i--;
//         }
//         while (i >= 0 && s.charAt(i) != ' ') {
//             length++;
//             i--;
//         }
//         return length;
//     }
// }