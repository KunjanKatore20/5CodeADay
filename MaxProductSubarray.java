public class MaxProductSubarray {
    public static void main(String[] args) {
        int[] nums = { 2, 3, -2, 4 };
        System.out.println("Maximum Product: " + maxProduct(nums));
    }

    public static int maxProduct(int[] nums) {
        int maxProduct = nums[0], minProduct = nums[0], result = nums[0];

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] < 0) {
                int temp = maxProduct;
                maxProduct = minProduct;
                minProduct = temp;
            }

            maxProduct = Math.max(nums[i], maxProduct * nums[i]);
            minProduct = Math.min(nums[i], minProduct * nums[i]);
            result = Math.max(result, maxProduct);
        }

        return result;
    }
}
