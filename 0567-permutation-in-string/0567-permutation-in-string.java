class Solution {
    public boolean checkInclusion(String s1, String s2) {

        if (s1.length() > s2.length()) {
            return false;
        }

        char[] a = s1.toCharArray();
        Arrays.sort(a);

        String target = new String(a);

        int k = s1.length();

        for (int i = 0; i <= s2.length() - k; i++) {

            String window = s2.substring(i, i + k);

            char[] b = window.toCharArray();
            Arrays.sort(b);

            if (new String(b).equals(target)) {
                return true;
            }
        }

        return false;
    }
}