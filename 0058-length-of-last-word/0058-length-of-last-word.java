class Solution {
    public int lengthOfLastWord(String s) {

        String[] words = s.trim().split(" ");
        int count =0;
        for(String word : words){
            count = word.length();
        }
        return count;


    }
}