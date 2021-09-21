import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String username, password, newPassword ;
        int option;
        boolean passwordChange;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Kullanıcı adı: ");
        username = scanner.nextLine();
        System.out.print("Şifre: ");
        password = scanner.nextLine();


        if(username.equals("patika") && password.equals("java101")){
            System.out.println("Giriş yaptınız!");
        } else {
            System.out.println("Kullanıcı adı veya şifre hatalı!");
            System.out.print("Şifrenizi sıfırlamak istiyor musunuz? 1-Evet, 2-Hayır ? : ");
            option = scanner.nextInt();
            scanner.nextLine();


            switch (option){
                case 1:
                    passwordChange = true;
                    while(passwordChange) {
                        System.out.print("Yeni şifre : ");
                        newPassword = scanner.nextLine();
                        if (!newPassword.equals(password) && !newPassword.equals("java101")) {
                            password = newPassword;
                            System.out.println("Şifre oluşturuldu!");
                            passwordChange=false;
                        } else {
                            System.out.println("Şifre oluşturulamadı, lütfen başka şifre giriniz.");
                        }

                    }
                    break;
                default :
                    System.out.println("Şifre sıfırlama başarısız!");
            }
        }
        scanner.close();
    }
}
