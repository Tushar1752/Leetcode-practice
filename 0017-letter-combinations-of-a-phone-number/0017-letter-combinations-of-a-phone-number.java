class Solution {

        List<String>ans = new ArrayList<>();
        String[] map={
            "","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"
        };
        public List<String> letterCombinations(String digits) {
            if(digits.length()==0){
                return ans;
            }
            solve(digits,0,"");
            return ans;
        }
    

    public void solve(String digits, int index, String temp) {

        if (index == digits.length()) {

            ans.add(temp);

            return;

        }

        String letters = map[digits.charAt(index) - '0'];

        for (int i = 0; i < letters.length(); i++) {

            solve(digits, index + 1, temp + letters.charAt(i));
        }
        
    }
}