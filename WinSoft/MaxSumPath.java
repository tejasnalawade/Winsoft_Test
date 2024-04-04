public class MaxSumPath {
    public static int maxSum(int[] X, int[] Y) {
        int sumX = 0, sumY = 0, maxSum = 0;
        int i = 0, j = 0;
        int m = X.length, n = Y.length;

        while (i < m && j < n) {
            if (X[i] < Y[j]) {
                sumX += X[i++];
            } else if (X[i] > Y[j]) {
                sumY += Y[j++];
            } else { // Common element found
                maxSum += Math.max(sumX, sumY) + X[i];
                sumX = 0;
                sumY = 0;
                i++;
                j++;
            }
        }

        // Add remaining elements from X, if any
        while (i < m) {
            sumX += X[i++];
        }

        // Add remaining elements from Y, if any
        while (j < n) {
            sumY += Y[j++];
        }

        // Add the maximum of the remaining sums to maxSum
        maxSum += Math.max(sumX, sumY);

        return maxSum;
    }

    public static void main(String[] args) {
        int[] X = {3, 6, 7, 8, 10, 12, 15, 18, 100};
        int[] Y = {1, 2, 3, 5, 7, 9, 10, 11, 15, 16, 18, 25, 50};

        System.out.println("Maximum sum path: " + maxSum(X, Y));
    }
}