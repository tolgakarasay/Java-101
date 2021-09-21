import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int n1, n2, option;

        Scanner scanner = new Scanner(System.in);
        System.out.print("İlk sayıyı giriniz: ");
        n1 = scanner.nextInt();
        System.out.print("İkinci sayıyı giriniz: ");
        n2 = scanner.nextInt();
        System.out.println("Yapmak istediğiniz işlemi seçin.");
        System.out.println("Toplama (1), Çıkarma (2), Çarpma (3), Bölme (4)");
        System.out.print("Seçiminiz: ");
        option = scanner.nextInt();
        scanner.close();

        switch (option){
            case 1:
                System.out.println("n1 + n2 = " + (n1+n2));
                break;
            case 2:
                System.out.println("n1 - n2 = " + (n1-n2));
                break;
            case 3:
                System.out.println("n1 * n2 = " + (n1*n2));
                break;
            case 4:
                System.out.println(n2==0 ? "Sayı bölü sıfır tanımsızdır." : "n1 / n2 = " + (n1/n2));
                break;
            default:
                System.out.println("Yanlış seçim yaptınız.");
        }
    }
}
