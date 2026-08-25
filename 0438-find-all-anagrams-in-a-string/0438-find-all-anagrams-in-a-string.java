class Solution {
    public List<Integer> findAnagrams(String s, String p) {

        List<Integer> ans = new ArrayList<>();

        int[] pFreq = new int[26];
        int[] windowFreq = new int[26];

        // Frequency of p
        for (char ch : p.toCharArray()) {
            pFreq[ch - 'a']++;
        }

        int left = 0;

        for (int right = 0; right < s.length(); right++) {

            windowFreq[s.charAt(right) - 'a']++;

            if (right - left + 1 > p.length()) {
                windowFreq[s.charAt(left) - 'a']--;
                left++;
            }

            if (right - left + 1 == p.length()) {

                if (Arrays.equals(pFreq, windowFreq)) {
                    ans.add(left);
                }
            }
        }

        return ans;
    }
}