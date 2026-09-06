class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int left = 0;
        int right = 0;

        // Minimum capacity = heaviest package
        // Maximum capacity = total weight
        for (int weight : weights) {
            left = Math.max(left, weight);
            right += weight;
        }

        while (left < right) {
            int mid = left + (right - left) / 2;

            int requiredDays = 1;
            int currentWeight = 0;

            // Check how many days are needed with capacity = mid
            for (int weight : weights) {
                if (currentWeight + weight <= mid) {
                    currentWeight += weight;
                } else {
                    requiredDays++;
                    currentWeight = weight;
                }
            }

            // Capacity is sufficient
            if (requiredDays <= days) {
                right = mid;
            } 
            // Capacity is insufficient
            else {
                left = mid + 1;
            }
        }

        return left;
    }
}