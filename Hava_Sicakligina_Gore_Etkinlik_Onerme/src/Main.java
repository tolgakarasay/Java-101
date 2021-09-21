import java.time.Year;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int heat;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Hava sıcaklığını giriniz : ");
        heat = scanner.nextInt();
        scanner.close();

        System.out.print(heat < 5 ? "Kayak yapabilirsiniz.\n" : "");
        System.out.print(heat >= 5 && heat <= 15 ? "Sinemaya gidebilirsiniz.\n" : "");
        System.out.print(heat >= 10 && heat <= 25 ? "Pikniğe gidebilirsiniz.\n":"");
        System.out.print(heat > 25 ? "Yüzmeye gidebilirsiniz.":"");
    }
}