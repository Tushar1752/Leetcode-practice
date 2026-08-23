class Solution {
    public int compareVersion(String v1, String v2) {

        String[] a = v1.split("\\.");
        String[] b = v2.split("\\.");

        int i = 0;

        while (i < a.length || i < b.length) {

            int x = i < a.length ? Integer.parseInt(a[i]) : 0;
            int y = i < b.length ? Integer.parseInt(b[i]) : 0;

            if (x != y)
                return x < y ? -1 : 1;

            i++;
        }

        return 0;
    }
}