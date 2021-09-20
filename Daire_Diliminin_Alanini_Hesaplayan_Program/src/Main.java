import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int r,a;
        double pi = 3.14, area;

        System.out.print("Yarıçapı giriniz: ");
        Scanner scanner = new Scanner(System.in);
        r = scanner.nextInt();
        System.out.print("Merkez açısının ölçüsünü giriniz: ");
        a = scanner.nextInt();

        area = pi * r * r * a / 360;
        System.out.println("Daire diliminin alanı: "+ area);
    }
}
