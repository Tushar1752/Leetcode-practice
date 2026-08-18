class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {

        int[] count = new int[26];
        int[] count1 = new int[26];
        for(char c : magazine.toCharArray()){
            count[c - 'a']++;
        }
        for(char c : ransomNote.toCharArray()){
            count1[c - 'a']++;
        }

        for(int i =0; i<26;i++){
            if(count1[i] > count[i]){
                return false;
            }
        }
        return true;


 





        






    }
}