import java.util.*;

public class Permutations {
    public static void findPermutations(String str, String result) {
        if (str.isEmpty()) {
            System.out.println(result);
            return;
        }

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            String rest = str.substring(0, i) + str.substring(i + 1);
            findPermutations(rest, result + ch);
        }
    }

    public static void main(String[] args) {
        String input = "ABC";
        System.out.println("Permutations of " + input + ":");
        findPermutations(input, "");
    }
}
