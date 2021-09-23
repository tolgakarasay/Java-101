import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int n;
        double sum = 1;

        Scanner scanner = new Scanner(System.in);
        System.out.print("n sayısını giriniz: ");
        n = scanner.nextInt();
        scanner.close();

        for (int i=2; i<=n; i++){
            sum += 1.0/i;
        }

        System.out.println(sum);
    }
}
