import java.util.HashMap;
import java.util.ArrayList;
import java.util.List;

public class PairSum {
    public static void main(String[] args) {
        int[] nums = { 2, 4, 3, 5, 7, 8, 1 };
        int target = 9;
        List<int[]> pairs = findPairs(nums, target);

        System.out.print("Pairs: ");
        for (int[] pair : pairs) {
            System.out.print("[" + pair[0] + ", " + pair[1] + "] ");
        }
    }

    public static List<int[]> findPairs(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        List<int[]> result = new ArrayList<>();

        for (int num : nums) {
            int complement = target - num;
            if (map.containsKey(complement)) {
                result.add(new int[] { complement, num });
            }
            map.put(num, 1);
        }

        return result;
    }
}
