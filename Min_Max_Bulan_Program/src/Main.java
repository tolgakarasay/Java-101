import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int n, currentNum, min, max;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Kaç tane sayı gireceksiniz : ");
        n = scanner.nextInt();
        System.out.print("1. sayıyı giriniz : ");
        currentNum = scanner.nextInt();
        min = currentNum;
        max = currentNum;

        for (int i = 2; i <= n; i++) {
            System.out.print(i+". sayıyı giriniz : ");
            currentNum = scanner.nextInt();
            if(currentNum>max){
                max = currentNum;
            } else if (currentNum<min){
                min = currentNum;
            }
        }
        scanner.close();

        System.out.println("En büyük sayı : " + max);
        System.out.println("En küçük sayı : " + min);
    }
}
