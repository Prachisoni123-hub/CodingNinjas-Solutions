// CodingNinjas Problem: Check if Array is Sorted (Non-decreasing)
// Time Complexity: O(n)
// Space Complexity: O(1)

public class Solution {
    public static int isSorted(int n, int[] a) {
        for (int i = 0; i < n - 1; i++) {
            if (a[i] > a[i + 1]) {
                return 0;
            }
        }
        return 1;
    }
}
