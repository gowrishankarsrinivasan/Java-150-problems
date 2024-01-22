import java.util.Scanner;


// Example 1:

// Input: nums1 = [1,2,3,0,0,0], m = 3, nums2 = [2,5,6], n = 3
// Output: [1,2,2,3,5,6]
// Explanation: The arrays we are merging are [1,2,3] and [2,5,6].
// The result of the merge is [1,2,2,3,5,6] with the underlined elements coming from nums1.
// Example 2:

// Input: nums1 = [1], m = 1, nums2 = [], n = 0
// Output: [1]
// Explanation: The arrays we are merging are [1] and [].
// The result of the merge is [1].

class Main {
    public static void merge(int[] arr1, int m, int[] arr2, int n) {
        int i = 0;
        int j = 0;
        int k = 0;
        int[] arr = new int[m + n];

        while (i < m && j < n) {
            if (arr1[i] < arr2[j]) {
                arr[k++] = arr1[i++];
            } else {
                arr[k++] = arr2[j++];
            }
        }
        while (i < m) {
            arr[k++] = arr1[i++];
        }
        while (j < n) {
            arr[k++] = arr2[j++];
        }

        for (int v : arr) {
            System.out.print(v + " ");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int m = sc.nextInt();
        int[] arr1 = new int[m];

        for (int i = 0; i < m; i++) {
            arr1[i] = sc.nextInt();
        }

        int n = sc.nextInt();
        int[] arr2 = new int[n];
        for (int i = 0; i < n; i++) {
            arr2[i] = sc.nextInt();
        }

        merge(arr1, m, arr2, n);
    }
}
