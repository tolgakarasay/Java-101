import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int n, sumOfDivisors=0;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Bir sayı giriniz: ");
        n = scanner.nextInt();
        scanner.close();

        for (int i = 1; i < n; i++) {
            if(n%i == 0){
                sumOfDivisors += i;
            }
        }

        if (n==sumOfDivisors && n!=0){
            System.out.println(n+" mükemmel sayıdır.");
        } else {
            System.out.println(n+" mükemmel sayı değildir.");
        }
    }
}
