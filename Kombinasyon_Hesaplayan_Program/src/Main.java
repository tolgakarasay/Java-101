import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int n,r, factorialN = 1, factorialR = 1, factorialDiff=1;

        Scanner scanner = new Scanner(System.in);
        System.out.print("C(n,r) kombinasyonunu hesaplamak için n değerini giriniz: ");
        n = scanner.nextInt();
        System.out.print("C(n,r) kombinasyonunu hesaplamak için r değerini giriniz: ");
        r = scanner.nextInt();
        scanner.close();

        for (int i=1; i<=n; i++){
            factorialN *= i;

            if(i<=r){
                factorialR *= i;
            } else {
                factorialDiff *= i-r;
            }
        }

        int combination = factorialN / (factorialR * factorialDiff);
        System.out.println("C("+n+","+r+") = " + combination);
    }
}