public class MissingNumber {
    public static int findMissingNumber(int[] arr) {
        int n = arr.length + 1; // Since the array contains n-1 elements
        int expectedSum = n * (n + 1) / 2; // Sum of first n numbers
        int actualSum = 0;

        // Calculate the sum of the given array
        for (int num : arr) {
            actualSum += num;
        }

        // The missing number is the difference between the expected sum and actual sum
        return expectedSum - actualSum;
    }

    public static void main(String[] args) {
        int[] arr = { 3, 7, 1, 2, 8, 4, 5 };
        System.out.println("The missing number is: " + findMissingNumber(arr));
    }
}
