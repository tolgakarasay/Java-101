import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int n, powerOf4=4, powerOf5=5;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Bir sayı giriniz: ");
        n = scanner.nextInt();
        scanner.close();

        System.out.println(1);

        while (powerOf4<=n){
            System.out.println(powerOf4);
            powerOf4 *= 4;
            if(powerOf5<=n) {
                System.out.println(powerOf5);
                powerOf5 *= 5;
            }
        }
    }
}
