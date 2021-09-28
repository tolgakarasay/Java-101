public class Main {
    public static void main(String[] args) {

        Course mat = new Course("Matematik", "MAT101", "MAT", 0.20);
        Course fizik = new Course("Fizik", "FZK101", "FZK", 0.10);
        Course kimya = new Course("Kimya", "KMY101", "KMY", 0.30);

        Teacher t1 = new Teacher("Mahmut Hoca", "90550000000", "MAT");
        Teacher t2 = new Teacher("Fatma Ayşe", "90550000001", "FZK");
        Teacher t3 = new Teacher("Ali Veli", "90550000002", "KMY");

        mat.addTeacher(t1);
        fizik.addTeacher(t2);
        kimya.addTeacher(t3);

        Student s1 = new Student("İnek Şaban", 4, "140144015", mat, fizik, kimya);
        s1.addBulkExamGrades(1, 1, 1, 100, 100, 100);
        s1.hasPassed();

        Student s2 = new Student("Güdük Necmi", 4, "2211133", mat, fizik, kimya);
        s2.addBulkExamGrades(100, 100, 100, 1, 1, 1);
        s2.hasPassed();

        Student s3 = new Student("Hayta İsmail", 4, "221121312", mat, fizik, kimya);
        s3.addBulkExamGrades(50, 50, 50, 1, 1, 1);
        s3.hasPassed();
    }
}
