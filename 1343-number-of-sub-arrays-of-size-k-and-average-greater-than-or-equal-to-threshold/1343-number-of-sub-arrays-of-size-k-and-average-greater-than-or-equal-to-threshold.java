class Solution {
    public int numOfSubarrays(int[] arr, int k, int threshold) {

        int target = k * threshold;
        int count =0;
        int windowSum =0;

        int sum =0;

        for(int i =0;i<k;i++ ){
            windowSum += arr[i];
        }
            if(windowSum >= target){
                count++;

            
        }
        int left=0;
        for(int right = k; right<arr.length;right++){
            windowSum -= arr[left];
            windowSum += arr[right];
            left++;

            if(windowSum >= target){
                count++;
            }



  
        }
        return count;



        
    }
}