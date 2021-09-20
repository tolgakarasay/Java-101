import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double tutar, kdv, kdvliTutar, kdvOrani;
        System.out.println("Tutarı giriniz:");
        Scanner scanner = new Scanner(System.in);
        tutar = scanner.nextDouble();
        scanner.close();

        kdvOrani = tutar <= 1000 ? 0.18 : 0.08;
        kdv = kdvOrani * tutar;
        kdvliTutar = tutar + kdv;

        System.out.println("KDV oranı: " + kdvOrani);
        System.out.println("KDV tutarı: "+ kdv);
        System.out.println("KDV'li tutar: " + kdvliTutar);
    }
}
