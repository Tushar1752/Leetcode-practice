class Solution {
    static void sortColors(int[] nums) {

        int left =0;
        int right= nums.length-1;
        int mid=0;
        while(left<=right){
            if(nums[left]==0){
                int temp = nums[left];
                nums[left] = nums[mid];
                nums[mid] = temp;

                mid++;
                left++;
            }
            else if(nums[left] == 2){
                int temp = nums[left];
                nums[left] = nums[right];
                nums[right]= temp;
                right--;
            }
            else{
                left++;
            }
        }




    }
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int n = sc.nextInt();
        int [] nums= new int[n];

        for(int i=0;i<n;i++){
            nums[i]= sc.nextInt();}
            sortColors(nums);
        System.out.println(nums);
    }


}