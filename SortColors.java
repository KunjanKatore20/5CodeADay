import java.util.Arrays;

public class SortColors {
    public static void sortColors(int[] nums) {
        int low = 0, mid = 0, high = nums.length - 1;

        while (mid <= high) {
            switch (nums[mid]) {
                case 0:
                    int temp1 = nums[low];
                    nums[low] = nums[mid];
                    nums[mid] = temp1;
                    low++;
                    mid++;
                    break;
                case 1:
                    mid++;
                    break;
                case 2:
                    int temp2 = nums[mid];
                    nums[mid] = nums[high];
                    nums[high] = temp2;
                    high--;
                    break;
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = { 0, 1, 2, 0, 1, 2 };
        sortColors(arr);
        System.out.println("Sorted Array: " + Arrays.toString(arr));
    }
}
