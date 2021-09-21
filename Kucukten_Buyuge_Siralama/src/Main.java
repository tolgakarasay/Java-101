import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int a,b,c;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Birinci sayıyı giriniz. a = ");
        a = scanner.nextInt();

        System.out.print("İkinci sayıyı giriniz. b = ");
        b = scanner.nextInt();

        System.out.print("Üçüncü sayıyı giriniz. c = ");
        c = scanner.nextInt();
        scanner.close();

        if (a>b){
            if (b>c){
                System.out.println("c < b < a");
            }
            else if (c>a){
                System.out.println("b < a < c");
            } else {
                System.out.println("b < c < a");
            }
        } else {
            if (a>c){
                System.out.println("c < a < b");
            }
            else if (c>b){
                System.out.println("a < b < c");
            } else {
                System.out.println("a < c < b");
            }
        }
    }
}
