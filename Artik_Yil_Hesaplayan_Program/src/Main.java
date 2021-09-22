import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int year;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Yılı giriniz: ");
        year = scanner.nextInt();
        scanner.close();

        if(year%400==0){
            System.out.println(year + " bir artık yıldır!");
        } else if (year%4==0 && year%100!=0){
            System.out.println(year + " bir artık yıldır!");
        } else {
            System.out.println(year + " bir artık yıl değildir!");
        }
    }
}
