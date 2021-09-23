import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int n, total=0;

        Scanner scanner = new Scanner(System.in);

        do {
            System.out.print("Bir sayı giriniz: ");
            n = scanner.nextInt();
            if(n%4==0){
                total += n;
            }
        } while (n%2==0);

        scanner.close();
        System.out.println("Girilen sayılardan çift ve 4'ün katı olan sayıların toplamı = " + total);
    }
}
