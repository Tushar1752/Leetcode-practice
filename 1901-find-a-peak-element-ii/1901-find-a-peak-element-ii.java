class Solution {
    public int[] findPeakGrid(int[][] mat) {
        int rows = mat.length;
        int cols = mat[0].length;

        int left = 0;
        int right = cols - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            // Find maximum element in the middle column
            int maxRow = 0;

            for (int row = 1; row < rows; row++) {
                if (mat[row][mid] > mat[maxRow][mid]) {
                    maxRow = row;
                }
            }

            int current = mat[maxRow][mid];

            int leftValue = -1;
            int rightValue = -1;

            if (mid > 0) {
                leftValue = mat[maxRow][mid - 1];
            }

            if (mid < cols - 1) {
                rightValue = mat[maxRow][mid + 1];
            }

            // Current element is greater than left and right
            if (current > leftValue && current > rightValue) {
                return new int[]{maxRow, mid};
            }

            // Right side has a bigger element
            if (rightValue > current) {
                left = mid + 1;
            }
            // Left side has a bigger element
            else {
                right = mid - 1;
            }
        }

        return new int[]{-1, -1};
    }
}