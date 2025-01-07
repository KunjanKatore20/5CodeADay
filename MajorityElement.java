import java.util.HashMap;

public class MajorityElement {
    public static void main(String[] args) {
        int[] nums = { 3, 2, 3 };
        System.out.println("Majority element: " + findMajorityElement(nums));
    }

    public static int findMajorityElement(int[] nums) {
        HashMap<Integer, Integer> countMap = new HashMap<>();
        for (int num : nums) {
            countMap.put(num, countMap.getOrDefault(num, 0) + 1);
            if (countMap.get(num) > nums.length / 2) {
                return num;
            }
        }
        return -1; // Shouldn't happen as per the problem statement
    }
}
