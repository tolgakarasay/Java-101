import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int year;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Doğum yılınızı giriniz: ");
        year = scanner.nextInt();
        scanner.close();
        System.out.print("Çin Zodyağı Burcunuz : ");

        switch (year % 12) {
            case 0 -> System.out.print("Maymun");
            case 1 -> System.out.print("Horoz");
            case 2 -> System.out.print("Köpek");
            case 3 -> System.out.print("Domuz");
            case 4 -> System.out.print("Fare");
            case 5 -> System.out.print("Öküz");
            case 6 -> System.out.print("Kaplan");
            case 7 -> System.out.print("Tavşan");
            case 8 -> System.out.print("Ejderha");
            case 9 -> System.out.print("Yılan");
            case 10 -> System.out.print("At");
            case 11 -> System.out.print("Koyun");
        }
    }
}
