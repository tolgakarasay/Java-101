import javax.swing.plaf.basic.BasicSplitPaneUI;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int mat, fizik, turkce, kimya, muzik, numberOfCourses=5;


        Scanner scanner = new Scanner(System.in);

        System.out.print("Matematik notunuz : ");
        mat = scanner.nextInt();
        if (mat>100 || mat<0){
            mat = 0;
            numberOfCourses--;
        }

        System.out.print("Fizik notunuz : ");
        fizik = scanner.nextInt();
        if (fizik>100 || fizik<0){
            fizik = 0;
            numberOfCourses--;
        }

        System.out.print("Türkçe notunuz : ");
        turkce = scanner.nextInt();
        if (turkce>100 || turkce<0){
            turkce = 0;
            numberOfCourses--;
        }

        System.out.print("Kimya notunuz : ");
        kimya = scanner.nextInt();
        if (kimya>100 || kimya<0){
            kimya = 0;
            numberOfCourses--;
        }

        System.out.print("Müzik notunuz : ");
        muzik= scanner.nextInt();
        if (muzik>100 || muzik<0){
            muzik = 0;
            numberOfCourses--;
        }
        scanner.close();

        numberOfCourses = numberOfCourses==0 ? 1 : numberOfCourses;
        double average = (mat + fizik + turkce + kimya + muzik + 0.0) / numberOfCourses;

        System.out.println("Ortalamanız : " + average);

        if (average<55){
            System.out.println("Sınıfta kaldınız!");
        } else {
            System.out.println("Tebrikler! Sınıfı geçtiniz!");
        }
    }
}
