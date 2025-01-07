import java.util.HashSet;

public class CountVowels {
    public static void main(String[] args) {
        String input = "hello world";
        System.out.println("Number of vowels: " + countVowels(input));
    }

    public static int countVowels(String str) {
        HashSet<Character> vowels = new HashSet<>();
        vowels.add('a');
        vowels.add('e');
        vowels.add('i');
        vowels.add('o');
        vowels.add('u');
        str = str.toLowerCase();
        int count = 0;

        for (char c : str.toCharArray()) {
            if (vowels.contains(c)) {
                count++;
            }
        }

        return count;
    }
}
