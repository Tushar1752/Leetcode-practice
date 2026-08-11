class Solution {
    static boolean isPalindrome(int x) {


        String s= String.valueOf(x);
                int left=0;
        int right= s.length()-1;
        if(x<0){
            return false;
        }
        while(left<=right){
            if(s.charAt(left) == s.charAt(right)){
                left++;
                right--;
            }
            else{
                return false;
            }
        }
        return true;


  
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        System.out.println(isPalindrome(x));


    }
}