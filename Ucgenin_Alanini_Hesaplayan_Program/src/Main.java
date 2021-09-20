import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double a,b,c,u,area;

        Scanner scanner = new Scanner(System.in);
        System.out.print("İlk kenarın uzunluğunu giriniz: ");
        a = scanner.nextInt();
        System.out.print("İkinci kenarın uzunluğunu giriniz: ");
        b = scanner.nextInt();
        System.out.print("Üçüncü kenarın uzunluğunu giriniz: ");
        c = scanner.nextInt();
        scanner.close();

        u = (a + b + c) / 2;
        area = Math.sqrt(u * (u-a) * (u-b) * (u-c));

        System.out.print("Üçgenin alanı: " + area);
    }
}
