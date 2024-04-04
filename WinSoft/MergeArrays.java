public class MergeArrays {
    public static void mergeArrays(int[] X, int[] Y) {
        int m = X.length;
        int n = Y.length;

        // Move all non-zero elements of X to the beginning
        int k = m - 1;
        for (int i = m - 1; i >= 0; i--) {
            if (X[i] != 0) {
                X[k] = X[i];
                k--;
            }
        }

        // Merge X and Y
        int i = k + 1;
        int j = 0;
        int p = 0;
        while (i < m && j < n) {
            if (X[i] < Y[j]) {
                X[p] = X[i];
                i++;
            } else {
                X[p] = Y[j];
                j++;
            }
            p++;
        }

        // If elements in Y[] are remaining, move them to X[]
        while (j < n) {
            X[p] = Y[j];
            j++;
            p++;
        }
    }

    public static void main(String[] args) {
        int[] X = { 0, 2, 0, 3, 0, 5, 6, 0, 0 };
        int[] Y = { 1, 8, 9, 10, 15 };

        mergeArrays(X, Y);

        // Print the merged array
        for (int num : X) {
            System.out.print(num + " ");
        }
    }
}