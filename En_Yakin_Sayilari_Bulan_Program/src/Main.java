import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] arr = {15, 12, 788, 1, -1, -778, 2, 0};
        int number, nearestSmaller = arr[0], nearestLarger = arr[0];

        System.out.print("Dizi : {");
        for (int val : arr) {
            System.out.print(val + ",");
        }
        System.out.print("\b}\n");

        Scanner scanner = new Scanner(System.in);
        System.out.print("Bir sayı giriniz : ");
        number = scanner.nextInt();
        scanner.close();

        for (int val : arr) {
            if (val < number && Math.abs(number - nearestSmaller) > Math.abs(number - val)) {
                nearestSmaller = val;
            }
            if (number < val && Math.abs(nearestLarger - number) > Math.abs(val - number)) {
                nearestLarger = val;
            }
        }

        System.out.println("Girilen sayıdan küçük en yakın sayı : " + nearestSmaller);
        System.out.println("Girilen sayıdan büyük en yakın sayı : " + nearestLarger);
    }
}
