import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int armut, elma, domates, muz, patlican;
        double armutTL = 2.14, elmaTL = 3.67, domatesTL = 1.11,
                muzTL = 0.95, patlicanTL = 5, toplam;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Armut Kaç Kilo ?: ");
        armut = scanner.nextInt();
        System.out.print("Elma Kaç Kilo ?: ");
        elma = scanner.nextInt();
        System.out.print("Domates Kaç Kilo ?: ");
        domates = scanner.nextInt();
        System.out.print("Muz Kaç Kilo ?: ");
        muz = scanner.nextInt();
        System.out.print("Patlıcan Kaç Kilo ?: ");
        patlican = scanner.nextInt();
        scanner.close();

        toplam = armut * armutTL + elma * elmaTL + domates * domatesTL +
                muz * muzTL + patlican * patlicanTL;

        System.out.println("Toplam Tutar: " + toplam + " TL");
    }
}
