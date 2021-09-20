import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double distance, perKm = 2.2 , startPrice, total;

        Scanner scanner = new Scanner(System.in);
        System.out.print("KM cinsinden mesafeyi giriniz: ");
        distance = scanner.nextDouble();
        scanner.close();

        total = distance*perKm +10;
        total = total < 20 ? 20 : total;
        System.out.print("Toplam ücret: " + total);
    }
}
