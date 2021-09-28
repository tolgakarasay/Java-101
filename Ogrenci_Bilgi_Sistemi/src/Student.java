public class Student {
    String name, stuNo;
    int classes;
    Course mat;
    Course fizik;
    Course kimya;
    double avarage;
    boolean hasPassed;


    Student(String name, int classes, String stuNo, Course mat, Course fizik, Course kimya) {
        this.name = name;
        this.classes = classes;
        this.stuNo = stuNo;
        this.mat = mat;
        this.fizik = fizik;
        this.kimya = kimya;
        calcAvarage();
        this.hasPassed = false;
    }


    public void addBulkExamGrades(int mat, int fizik, int kimya, int matOral, int fizikOral, int kimyaOral) {

        if (mat >= 0 && mat <= 100) {
            this.mat.grade = mat;
        }

        if (fizik >= 0 && fizik <= 100) {
            this.fizik.grade = fizik;
        }

        if (kimya >= 0 && kimya <= 100) {
            this.kimya.grade = kimya;
        }

        if (matOral >= 0 && matOral <= 100) {
            this.mat.oralExamGrade = matOral;
        }

        if (fizikOral >= 0 && fizikOral <= 100) {
            this.fizik.oralExamGrade = fizikOral;
        }

        if (kimyaOral >= 0 && kimyaOral <= 100) {
            this.kimya.oralExamGrade = kimyaOral;
        }
    }

    public void hasPassed() {
        if (this.mat.grade == 0 || this.fizik.grade == 0 || this.kimya.grade == 0) {
            System.out.println("Notlar tam olarak girilmemiş");
        } else {
            this.hasPassed = isCheckPass();
            printNote();
            System.out.println("Ortalama : " + this.avarage);
            if (this.hasPassed) {
                System.out.println("Sınıfı Geçti. ");
            } else {
                System.out.println("Sınıfta Kaldı.");
            }
        }
    }

    public void calcAvarage() {
        this.fizik.calcFinalGrade();
        this.kimya.calcFinalGrade();
        this.mat.calcFinalGrade();
        this.avarage = (this.fizik.finalGrade + this.kimya.finalGrade + this.mat.finalGrade) / 3.0;
    }

    public boolean isCheckPass() {
        calcAvarage();
        return this.avarage > 55;
    }

    public void printNote() {
        System.out.println("=========================");
        System.out.println("Öğrenci : " + this.name);
        System.out.println("Matematik Notu : " + this.mat.finalGrade);
        System.out.println("Fizik Notu : " + this.fizik.finalGrade);
        System.out.println("Kimya Notu : " + this.kimya.finalGrade);
    }

}