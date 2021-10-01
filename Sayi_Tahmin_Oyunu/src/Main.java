import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Scanner scanner = new Scanner(System.in);
        boolean continued = true;

        while (continued) {
            System.out.println(">>>>>> YENİ OYUN <<<<<<");
            System.out.println();
            System.out.print("Rasgele bir sayı üretiliyor... ");

            for (int i = 0; i < 4; i++) {
                System.out.print("/");
                Thread.sleep(250);
                System.out.print("\b");
                System.out.print("\\");
                Thread.sleep(250);
                System.out.print("\b");
            }
            for (int i = 0; i < 31; i++) {
                System.out.print("\b");
            }

            int number = (int) (Math.random() * 100);
            int triesLeft = 5;
            boolean hasWon = false;
            boolean mistakeDone = false;

            while (triesLeft > 0 && !hasWon) {
                System.out.println(triesLeft + " tahmin hakkınız kaldı.");
                System.out.print("Tahmininizi giriniz : ");
                int guess = scanner.nextInt();

                if (guess >= 0 && guess <= 99) {
                    if (guess == number) {
                        hasWon = true;
                    } else if (guess > number) {
                        System.out.println("Gizli sayı tahmininizden daha küçük.");
                    } else {
                        System.out.println("Gizli sayı tahmininizden daha büyük.");
                    }
                } else {
                    System.out.println("Hatalı giriş. Girdiğiniz sayı 0 ile 99 arasında olmalı!");
                    if (!mistakeDone) {
                        triesLeft++;
                        System.out.println("Bundan sonraki hatalı girişleriniz haklarınızdan düşülecektir.");
                    }
                    mistakeDone = true;
                }

                triesLeft--;
                System.out.println();

                if (hasWon) {
                    System.out.println("TEBRİKLER! SAYIYI DOĞRU TAHMİN ETTİNİZ.");
                } else if (triesLeft < 1) {
                    System.out.println("KAYBETTİNİZ! GİZLİ SAYI : " + number);
                }

                System.out.println();
            }

            boolean choiceDone = false;

            while (!choiceDone) {
                System.out.println("Lütfen bir seçim yapınız.\n1 - Tekrar oynamak istiyorum.\n2 - Oyunu bitir.");
                System.out.print("Seçiminizi giriniz : ");
                int option = scanner.nextInt();
                System.out.println();
                switch (option) {
                    case 1:
                        continued = true;
                        choiceDone = true;
                        break;
                    case 2:
                        continued = false;
                        choiceDone = true;
                        break;
                    default:
                        System.out.println("Seçiminizi belirtmek için sadece 1 veya 2 rakamını giriniz!");
                }
                if (option == 2) {
                    continued = false;
                }
            }
        }
        scanner.close();
    }
}