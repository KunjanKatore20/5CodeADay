public class FindMaxElement {
    public static void main(String[] args) {
        int[] numbers = { 10, 25, 5, 40, 30 };
        int max = findMax(numbers);
        System.out.println("Maximum Element: " + max);
    }

    public static int findMax(int[] array) {
        int max = array[0];
        for (int num : array) {
            if (num > max) {
                max = num;
            }
        }
        return max;
    }
}
