import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double weight, height, bmi;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Lütfen boyunuzu (metre cinsinde) giriniz: ");
        height = scanner.nextDouble();
        System.out.print("Lütfen kilonuzu giriniz: ");
        weight = scanner.nextDouble();
        scanner.close();

        bmi = weight / (height * height);
        System.out.println("Vücut Kitle İndeksiniz: " + bmi);
    }
}
