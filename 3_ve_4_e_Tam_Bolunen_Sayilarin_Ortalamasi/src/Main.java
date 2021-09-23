import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int k, n=0, total=0, average;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Sayı giriniz: ");
        k = scanner.nextInt();
        scanner.close();

        for (int i=1; i<=k; i++){
            if(i%3 == 0 && i%4 == 0){
                n++;
                total += i;
            }
        }

        average = total==0 ? 0 : total / n;
        System.out.println(k +" 'e kadar olan sayılardan 3 ve 4'e tam bölünenlerin ortalaması: " + average);
    }
}
