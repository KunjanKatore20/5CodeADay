package Jan5;

import java.util.HashSet;

public class UniqueSubstrings {
    public static void main(String[] args) {
        String s = "abc";
        int count = 0;

        for (int i = 0; i < s.length(); i++) {
            HashSet<Character> set = new HashSet<>();
            for (int j = i; j < s.length(); j++) {
                if (set.contains(s.charAt(j))) {
                    break;
                }
                set.add(s.charAt(j));
                count++;
            }
        }
        System.out.println("Total substrings without repeating characters: " + count);
    }
}
