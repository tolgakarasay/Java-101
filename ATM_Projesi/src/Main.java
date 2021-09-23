import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String username, password;
        int right = 3, balance = 1500, select, price;

        Scanner scanner = new Scanner(System.in);

        while (right > 0) {
            System.out.print("Kullanıcı Adınız : ");
            username = scanner.nextLine();
            System.out.print("Parolanız : ");
            password = scanner.nextLine();
            right--;

            if (username.equals("patika") && password.equals("dev123")) {
                right = 0;
                System.out.println("Merhaba, Kodluyoruz Bankasına Hoşgeldiniz!");

                do {
                    System.out.println("1-Para yatırma\n" +
                            "2-Para Çekme\n" +
                            "3-Bakiye Sorgula\n" +
                            "4-Çıkış Yap");
                    System.out.print("Lütfen yapmak istediğiniz işlemi seçiniz : ");
                    select = scanner.nextInt();

                    switch (select) {
                        case 1:
                            System.out.print("Para miktarı : ");
                            price = scanner.nextInt();
                            balance += price;
                            break;
                        case 2:
                            System.out.print("Para miktarı : ");
                            price = scanner.nextInt();
                            if (price > balance) {
                                System.out.println("Bakiye yetersiz.");
                            } else {
                                balance -= price;
                            }
                            break;
                        case 3:
                            System.out.println("Bakiyeniz : " + balance);
                            break;
                    }
                } while (select != 4);
                System.out.println("Tekrar görüşmek üzere!");

            } else if (right == 0) {
                System.out.println("Hesabınız bloke olmuştur lütfen banka ile iletişime geçiniz.");
            } else {
                System.out.print("Hatalı kullanıcı adı veya şifre. Tekrar deneyiniz. ");
                System.out.println("Kalan Hakkınız : " + right);
            }
        }
    }
}
