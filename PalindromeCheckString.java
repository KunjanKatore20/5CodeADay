public class PalindromeCheckString {
    public static void main(String[] args) {
        String str = "madam";
        int n = str.length();
        int i = 0;
        int j = n - 1;
        while (i < j) {
            if (str.charAt(i) != str.charAt(j)) {
                System.out.println("Not a palindrome");
                return;
            }
            i++;
            j--;
        }
        System.out.println("Palindrome");
    }
}
