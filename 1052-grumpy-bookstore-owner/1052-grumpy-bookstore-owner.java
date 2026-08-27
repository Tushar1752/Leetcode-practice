class Solution {
    public int maxSatisfied(int[] customers, int[] grumpy, int minutes) {

        int n = customers.length;

        int baseSatisfied = 0;

        // Already satisfied customers
        for (int i = 0; i < n; i++) {
            if (grumpy[i] == 0) {
                baseSatisfied += customers[i];
            }
        }

        // First window: extra customers we can satisfy
        int windowSum = 0;

        for (int i = 0; i < minutes; i++) {
            if (grumpy[i] == 1) {
                windowSum += customers[i];
            }
        }

        int maxExtra = windowSum;

        // Sliding window
        int left = 0;

        for (int right = minutes; right < n; right++) {

            if (grumpy[right] == 1) {
                windowSum += customers[right];
            }

            if (grumpy[left] == 1) {
                windowSum -= customers[left];
            }

            left++;

            maxExtra = Math.max(maxExtra, windowSum);
        }

        return baseSatisfied + maxExtra;
    }
}