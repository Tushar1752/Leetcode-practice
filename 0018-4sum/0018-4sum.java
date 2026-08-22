import java.util.*;

class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {

        Set<List<Integer>> set = new HashSet<>();

        int n = nums.length;

        for (int i = 0; i < n - 3; i++) {

            for (int j = i + 1; j < n - 2; j++) {

                Set<Long> seen = new HashSet<>();

                for (int k = j + 1; k < n; k++) {

                    long required = (long) target
                            - nums[i]
                            - nums[j]
                            - nums[k];

                    if (seen.contains(required)) {

                        List<Integer> quad = Arrays.asList(
                            nums[i],
                            nums[j],
                            (int) required,
                            nums[k]
                        );

                        Collections.sort(quad);

                        set.add(quad);
                    }

                    seen.add((long) nums[k]);
                }
            }
        }

        return new ArrayList<>(set);
    }
}