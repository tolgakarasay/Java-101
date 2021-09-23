import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int n1, n2, min, ebob=1, ekok;

        Scanner scanner = new Scanner(System.in);
        System.out.print("İlk sayıyı giriniz: ");
        n1 = scanner.nextInt();

        System.out.print("İkinci sayıyı giriniz: ");
        n2 = scanner.nextInt();
        scanner.close();

        if(n1<=n2){
            min = n1;
        } else {
            min = n2;
        }

        int i = 1;
        while(i<=min){
            if(n1%i==0 && n2%i==0){
                ebob = i;
            }
            i++;
        }

        ekok = n1*n2/ebob;

        System.out.println("EBOB : "+ebob);
        System.out.println("EKOK : "+ekok);
    }
}
