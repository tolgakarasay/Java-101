import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int n;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Dizinin boyutu n : ");
        n = scanner.nextInt();

        int[] arr = new int[n];

        System.out.println("Dizinin elemanlarını giriniz.");
        for (int i = 0; i < n; i++) {
            System.out.print((i + 1) + ". Elemanı : ");
            arr[i] = scanner.nextInt();
        }
        scanner.close();

        Arrays.sort(arr);
        System.out.print("Sıralama : ");
        for (int val : arr) {
            System.out.print(val + " ");
        }
    }
}
