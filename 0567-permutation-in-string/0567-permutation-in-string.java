class Solution {
    public boolean checkInclusion(String s1, String s2) {

        int[] count = new int[26];

        // s1 ke characters count karo
        for (char ch : s1.toCharArray()) {
            count[ch - 'a']++;
        }

        int left = 0;

        for (int right = 0; right < s2.length(); right++) {

            count[s2.charAt(right) - 'a']--;

            // Window size s1 se badi ho gayi
            if (right - left + 1 > s1.length()) {
                count[s2.charAt(left) - 'a']++;
                left++;
            }

            // Same frequency => permutation found
            if (right - left + 1 == s1.length() && allZero(count)) {
                return true;
            }
        }

        return false;
    }

    private boolean allZero(int[] count) {

        for (int x : count) {
            if (x != 0) {
                return false;
            }
        }

        return true;
    }
}