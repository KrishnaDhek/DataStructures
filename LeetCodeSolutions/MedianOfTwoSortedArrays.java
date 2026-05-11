import java.util.*;

public class MedianOfTwoSortedArrays {

    public int solve(int[] A, int[] B) {

        // Ensure A is the smaller array
        if (A.length > B.length) {
            return solve(B, A);
        }

        int m = A.length;
        int n = B.length;

        int low = 0;
        int high = m;

        while (low <= high) {

            int cut1 = (low + high) / 2;
            int cut2 = (m + n + 1) / 2 - cut1;

            int left1 = (cut1 == 0) ? Integer.MIN_VALUE : A[cut1 - 1];
            int right1 = (cut1 == m) ? Integer.MAX_VALUE : A[cut1];

            int left2 = (cut2 == 0) ? Integer.MIN_VALUE : B[cut2 - 1];
            int right2 = (cut2 == n) ? Integer.MAX_VALUE : B[cut2];

            // Correct partition found
            if (left1 <= right2 && left2 <= right1) {

                // Odd total length
                if ((m + n) % 2 == 1) {
                    return Math.max(left1, left2);
                }

                // Even total length
                return (Math.max(left1, left2) + Math.min(right1, right2)) / 2;
            }

            // Move towards left in A
            else if (left1 > right2) {
                high = cut1 - 1;
            }

            // Move towards right in A
            else {
                low = cut1 + 1;
            }
        }

        return 0;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Input size of first array
        System.out.print("Enter size of first array: ");
        int m = sc.nextInt();

        int[] A = new int[m];

        System.out.println("Enter elements of first sorted array:");
        for (int i = 0; i < m; i++) {
            A[i] = sc.nextInt();
        }

        // Input size of second array
        System.out.print("Enter size of second array: ");
        int n = sc.nextInt();

        int[] B = new int[n];

        System.out.println("Enter elements of second sorted array:");
        for (int i = 0; i < n; i++) {
            B[i] = sc.nextInt();
        }

MedianOfTwoSortedArrays sol = new MedianOfTwoSortedArrays();
        int median = sol.solve(A, B);

        System.out.println("Median is: " + median);

        sc.close();
    }
}