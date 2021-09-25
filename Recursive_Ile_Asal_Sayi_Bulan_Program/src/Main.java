import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Bir sayı giriniz: ");
        int number = scanner.nextInt();
        scanner.close();
        prime(number, number);
    }

    public static void prime(int num, int divisor) {
        divisor--;
        if (num < 2) {
            System.out.println(num + " sayısı ASAL değildir. En küçük asal sayı 2'dir.");
        } else if (divisor > 1) {
            if (num % divisor == 0) {
                System.out.println(num + " sayısı ASAL değildir !");
            } else {
                prime(num, divisor);
            }
        } else {
            System.out.println(num + " sayısı ASALDIR !");
        }
    }
}
