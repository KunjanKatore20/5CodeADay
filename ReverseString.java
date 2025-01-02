public class ReverseString {
    public static String reverse(String input) {
        // Convert the string to a character array
        char[] charArray = input.toCharArray();
        int start = 0;
        int end = charArray.length - 1;

        // Swap characters from start to end
        while (start < end) {
            char temp = charArray[start];
            charArray[start] = charArray[end];
            charArray[end] = temp;

            start++;
            end--;
        }

        // Convert the character array back to a string
        return new String(charArray);
    }

    public static void main(String[] args) {
        String input = "hello";
        String reversed = reverse(input);
        System.out.println("Reversed String: " + reversed);
    }
}
