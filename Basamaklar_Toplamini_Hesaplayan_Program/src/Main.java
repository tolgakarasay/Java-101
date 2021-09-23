import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int number, total=0;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Bir sayı giriniz: ");
        number = scanner.nextInt();
        scanner.close();

        while (number%10>=1){
            total += number%10;
            number /= 10;
        }
        System.out.println("Basamaklar toplamı: " + total);
    }
}
