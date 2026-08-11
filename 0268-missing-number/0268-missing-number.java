class Solution {
    public static int missingNumber(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for(int num : nums){
            set.add(num);
        }
        for(int i =0;i<=nums.length;i++){
            if(!set.contains(i)){
                return i;
            }
        }
        return -1;

    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] nums= new int[n];
        for(int i =0;i<n;i++){
            nums[i]= sc.nextInt();
        }
        System.out.println(missingNumber(nums));

    }

}