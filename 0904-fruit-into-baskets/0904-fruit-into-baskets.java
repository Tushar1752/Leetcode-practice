class Solution {
    public int totalFruit(int[] fruits) {

        int left = 0;
        int answer = 0;

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int right = 0; right < fruits.length; right++) {

            // Add current fruit
            map.put(fruits[right], map.getOrDefault(fruits[right], 0) + 1);

            // More than 2 fruit types
            while (map.size() > 2) {

                int leftFruit = fruits[left];

                map.put(leftFruit, map.get(leftFruit) - 1);

                if (map.get(leftFruit) == 0) {
                    map.remove(leftFruit);
                }

                left++;
            }

            // Current valid window
            int windowLength = right - left + 1;

            answer = Math.max(answer, windowLength);
        }

        return answer;
    }
}