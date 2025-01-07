import java.util.Arrays;

public class MoveZerosToEnd {
    public static void main(String[] args) {
        int[] nums = { 0, 1, 0, 3, 12 };
        moveZeros(nums);
        System.out.println("Array after moving zeros: " + Arrays.toString(nums));
    }

    public static void moveZeros(int[] nums) {
        int index = 0; // Points to the next position for a non-zero element
        for (int num : nums) {
            if (num != 0) {
                nums[index++] = num;
            }
        }
        while (index < nums.length) {
            nums[index++] = 0;
        }
    }
}
