import java.util.Scanner;

public class Main {

    static void plus() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Birinci sayıyı giriniz: ");
        int a = scan.nextInt();
        System.out.println("İkinci sayıyı giriniz: ");
        int b = scan.nextInt();
        int result = a + b;
        System.out.println("Sonuç : " + result);
    }

    static void minus() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Birinci sayıyı giriniz: ");
        int a = scan.nextInt();
        System.out.println("İkinci sayıyı giriniz: ");
        int b = scan.nextInt();
        int result = a - b;
        System.out.println("Sonuç : " + result);
    }

    static void times() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Birinci sayıyı giriniz: ");
        int a = scan.nextInt();
        System.out.println("İkinci sayıyı giriniz: ");
        int b = scan.nextInt();
        int result = a * b;
        System.out.println("Sonuç : " + result);
    }

    static void divided() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Birinci sayıyı giriniz: ");
        int a = scan.nextInt();
        System.out.println("İkinci sayıyı giriniz: ");
        int b = scan.nextInt();
        System.out.println("Sonuç : " + ((b != 0) ? a / b : "Tanımsız"));
    }

    static void power() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Taban değeri giriniz :");
        int base = scan.nextInt();
        System.out.print("Üs değeri giriniz :");
        int exponent = scan.nextInt();
        int result = 1;

        for (int i = 1; i <= exponent; i++) {
            result *= base;
        }

        System.out.println("Sonuç : " + result);
    }

    static void factorial() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Sayı giriniz :");
        int n = scan.nextInt();
        int result = 1;

        for (int i = 1; i <= n; i++) {
            result *= i;
        }

        System.out.println("Sonuç : " + result);
    }

    static void modulo() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Modu alınacak sayıyı giriniz :");
        int n = scan.nextInt();
        System.out.print("Mod değerini giriniz :");
        int k = scan.nextInt();

        int result = n % k;

        System.out.println("Sonuç : " + result);
    }

    static void rectAreaAndPerimeter() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Yatay kenar uzunluğu: ");
        int a = scan.nextInt();
        System.out.print("Dikey kenar uzunluğu :");
        int b = scan.nextInt();

        int area = a * b;
        int perimeter = 2 * (a + b);
        System.out.println("Alan : " + area);
        System.out.println("Çevre : " + perimeter);

    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int select;
        String menu = "1- Toplama İşlemi\n"
                + "2- Çıkarma İşlemi\n"
                + "3- Çarpma İşlemi\n"
                + "4- Bölme işlemi\n"
                + "5- Üslü Sayı Hesaplama\n"
                + "6- Faktoriyel Hesaplama\n"
                + "7- Mod Alma\n"
                + "8- Dikdörtgen Alan ve Çevre Hesabı\n"
                + "0- Çıkış Yap";

        do {
            System.out.println(menu);
            System.out.print("Lütfen bir işlem seçiniz :");
            select = scan.nextInt();
            switch (select) {
                case 1:
                    plus();
                    break;
                case 2:
                    minus();
                    break;
                case 3:
                    times();
                    break;
                case 4:
                    divided();
                    break;
                case 5:
                    power();
                    break;
                case 6:
                    factorial();
                    break;
                case 7:
                    modulo();
                    break;
                case 8:
                    rectAreaAndPerimeter();
                    break;
                case 0:
                    break;
                default:
                    System.out.println("Yanlış bir değer girdiniz, tekrar deneyiniz.");
            }
        } while (select != 0);
    }
}