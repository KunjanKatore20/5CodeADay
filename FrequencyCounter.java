import java.util.HashMap;

public class FrequencyCounter {
    public static void main(String[] args) {
        int[] nums = { 1, 2, 2, 3, 3, 3 };
        HashMap<Integer, Integer> frequencyMap = new HashMap<>();

        for (int num : nums) {
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
        }

        System.out.println("Frequency of elements: " + frequencyMap);
    }
}
