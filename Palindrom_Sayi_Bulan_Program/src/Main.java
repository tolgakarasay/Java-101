import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Bir sayı giriniz: ");
        int number = scanner.nextInt();
        scanner.close();

        if (reverse(number) == number) {
            System.out.println("Palindrom Sayı!");
        } else {
            System.out.println("Palindrom Sayı Değil!");
        }
    }

    public static int reverse(int number) {
        int last, i = 1;
        while (number >= 10 * i) {
            i *= 10;
        }
        if (number >= 1) {
            last = number % 10;
            number /= 10;
            return last * i + reverse(number);
        } else {
            return 0;
        }
    }
}