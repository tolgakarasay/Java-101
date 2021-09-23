import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int n;

        Scanner scanner = new Scanner(System.in);
        System.out.print("n sayısını giriniz : ");
        n = scanner.nextInt();
        scanner.close();

        for (int i = 0; i < n; i++) {

            for (int j = 0; j < Math.abs((n / 2) - i); j++) {
                System.out.print(" ");
            }

            if(i<n/2) {
                for (int k = 0; k < 2 * i + 1; k++) {
                    System.out.print("*");
                }
            } else {
                for (int k = 0; k < 2*(n-i)-1; k++) {
                    System.out.print("*");
                }
            }

            System.out.println("");
        }
    }
}
