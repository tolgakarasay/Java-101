import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("N sayısı : ");
        int n = scanner.nextInt();
        scanner.close();

        System.out.print("Çıktısı : ");
        pattern(n, n, true);
    }

    public static void pattern(int current, int original, boolean decrease) {
        System.out.print(current + " ");
        if (current > 0 && decrease) {
            pattern(current - 5, original, true);
        } else if (current < original) {
            pattern(current + 5, original, false);
        }
    }
}
