import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int n, k, result = 1;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Üssü alınacak sayı : ");
        n = scanner.nextInt();
        System.out.print("Üs değeri : ");
        k = scanner.nextInt();
        scanner.close();

        for(int i=1; i<=k; i++){
           result *= n;
        }

        System.out.println(n+" üzeri "+k+" = "+result);

    }
}
