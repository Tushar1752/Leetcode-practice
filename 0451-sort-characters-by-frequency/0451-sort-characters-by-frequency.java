import java.util.*;

class Solution {
    public String frequencySort(String s) {

        int[] freq = new int[128];

        for (char ch : s.toCharArray()) {
            freq[ch]++;
        }

        List<Character>[] bucket = new ArrayList[s.length() + 1];

        for (int i = 0; i < 128; i++) {
            if (freq[i] > 0) {
                if (bucket[freq[i]] == null) {
                    bucket[freq[i]] = new ArrayList<>();
                }

                bucket[freq[i]].add((char) i);
            }
        }

        StringBuilder result = new StringBuilder();

        for (int count = s.length(); count >= 1; count--) {

            if (bucket[count] == null) {
                continue;
            }

            for (char ch : bucket[count]) {
                for (int j = 0; j < count; j++) {
                    result.append(ch);
                }
            }
        }

        return result.toString();
    }
}