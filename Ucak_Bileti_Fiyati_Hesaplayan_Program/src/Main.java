import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int distance, age, typeOfTrip;
        double total;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Km cinsinden mesafeyi giriniz: ");
        distance = scanner.nextInt();

        System.out.print("Yaşınızı giriniz: ");
        age = scanner.nextInt();

        System.out.print("Yolculuk tipini giriniz. Tek Yön(1), Gidiş-Dönüş(2) ? : ");
        typeOfTrip = scanner.nextInt();
        scanner.close();

        if(distance>0 && age>0 && (typeOfTrip == 1 || typeOfTrip == 2)){

            total = distance * 0.10;

            if(age<=12){
                total *= 0.5;
            } else if (age<=24){
                total *= 0.9;
            } else if (age>=65){
                total *= 0.7;
            }
            if(typeOfTrip==2){
                total *= 0.8 * 2;
            }
            System.out.println("Toplam tutar = " + total + " TL");
        } else {
            System.out.println("Hatalı Veri Girdiniz !");
        }
    }
}
