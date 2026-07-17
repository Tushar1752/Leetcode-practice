class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int m = nums1.length;
        int n = nums2.length;
        int [] arr = new int[m+n];
        System.arraycopy(nums1, 0,arr, 0, m);
        System.arraycopy(nums2,0,arr,m,n);

        java.util.Arrays.sort(arr);
        int o= arr.length;
        if(o%2 == 1){
            return arr[o/2];
        }
        return (arr[o/2] + arr[o/2 - 1] )/ 2.0;
  
    }
}