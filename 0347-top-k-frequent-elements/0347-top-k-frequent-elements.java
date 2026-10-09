import java.util.*;

class Solution {
    public int[] topKFrequent(int[] nums, int k) {

        int offset = 10000;

        // Frequency array
        int[] freq = new int[20001];

        for (int num : nums) {
            freq[num + offset]++;
        }

        // Bucket: index = frequency
        List<Integer>[] bucket = new List[nums.length + 1];

        for (int value = -10000; value <= 10000; value++) {

            int count = freq[value + offset];

            if (count > 0) {
                if (bucket[count] == null) {
                    bucket[count] = new ArrayList<>();
                }

                bucket[count].add(value);
            }
        }

        // Get top k frequent elements
        int[] result = new int[k];
        int index = 0;

        for (int count = nums.length; count >= 1 && index < k; count--) {

            if (bucket[count] == null) {
                continue;
            }

            for (int value : bucket[count]) {
                result[index++] = value;

                if (index == k) {
                    break;
                }
            }
        }

        return result;
    }
}