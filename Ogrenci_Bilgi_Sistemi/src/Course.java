public class Course {
    Teacher courseTeacher;
    String name;
    String code;
    String prefix;
    int grade;
    int oralExamGrade;
    double oralExamPercentage;
    double finalGrade;

    public Course(String name, String code, String prefix, double oralExamPercentage) {
        this.name = name;
        this.code = code;
        this.prefix = prefix;
        this.grade = 0;
        this.oralExamGrade = 0;
        this.oralExamPercentage = oralExamPercentage;
    }

    public void addTeacher(Teacher t) {
        if (this.prefix.equals(t.branch)) {
            this.courseTeacher = t;
            System.out.println("İşlem başarılı");
        } else {
            System.out.println(t.name + " Akademisyeni bu dersi veremez.");
        }
    }

    public void printTeacher() {
        if (courseTeacher != null) {
            System.out.println(this.name + " dersinin Akademisyeni : " + courseTeacher.name);
        } else {
            System.out.println(this.name + " dersine Akademisyen atanmamıştır.");
        }
    }

    public void calcFinalGrade() {
        this.finalGrade = (this.oralExamGrade * this.oralExamPercentage) + this.grade * (1 - oralExamPercentage);
    }
}