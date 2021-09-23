import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int n, fib1=0, fib2=1, fibNext;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Fibonacci dizisinin ilk kaç elemanı yazdırılsın? : ");
        n = scanner.nextInt();
        scanner.close();

        System.out.print(fib1+" "+fib2+" ");

        for (int i = 1; i <=n-2; i++) {
            fibNext = fib1+fib2;
            System.out.print(fibNext+" ");
            fib1 = fib2;
            fib2 = fibNext;
        }
    }
}
