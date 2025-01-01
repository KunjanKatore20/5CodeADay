import java.util.Arrays;

public class MergeSortedArrays {
    public static int[] mergeSortedArrays(int[] arr1, int[] arr2) {
        // Result array size will be the sum of both arrays' sizes
        int[] result = new int[arr1.length + arr2.length];

        int i = 0, j = 0, k = 0;

        // Traverse both arrays and merge them into the result array
        while (i < arr1.length && j < arr2.length) {
            if (arr1[i] < arr2[j]) {
                result[k++] = arr1[i++];
            } else {
                result[k++] = arr2[j++];
            }
        }

        // If there are remaining elements in arr1
        while (i < arr1.length) {
            result[k++] = arr1[i++];
        }

        // If there are remaining elements in arr2
        while (j < arr2.length) {
            result[k++] = arr2[j++];
        }

        return result;
    }

    public static void main(String[] args) {
        int[] arr1 = { 1, 3, 5 };
        int[] arr2 = { 2, 4, 6 };

        int[] mergedArray = mergeSortedArrays(arr1, arr2);

        System.out.println("Merged Array: " + Arrays.toString(mergedArray));
    }
}
