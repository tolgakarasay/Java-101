import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Basamak sayısını giriniz: ");
        int n = scanner.nextInt();
        scanner.close();

        for (int i = 1; i <= n ; i++) {
            for (int j = 1; j < i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= 2*(n-i)+1; k++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
