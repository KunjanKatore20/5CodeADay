package Jan5;

public class Factors {
    public static void main(String[] args) {
        int num = 12;
        System.out.print("Factors of " + num + ": ");
        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                System.out.print(i + " ");
            }
        }
    }
}
