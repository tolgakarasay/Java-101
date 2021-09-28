public class Employee {

    String name;
    double salary;
    int workHours;
    int hireYear;

    public Employee(String name, double salary, int workHours, int hireYear) {
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
    }

    public double tax() {
        double tax;
        if (this.salary <= 1000) {
            tax = 0;
        } else {
            tax = this.salary * 0.03;
        }
        return tax;
    }

    public double bonus() {
        int bonus;
        if (this.workHours <= 40) {
            bonus = 0;
        } else {
            bonus = (this.workHours - 40) * 30;
        }
        return bonus;
    }

    public double raiseSalary() {
        int experience = 2021 - this.hireYear;
        double raise;
        if (experience <= 9) {
            raise = 0.05 * this.salary;
        } else if (experience > 9 && experience <= 19) {
            raise = 0.10 * this.salary;
        } else {
            raise = 0.15 * this.salary;
        }
        return raise;
    }

    @Override
    public String toString() {
        return  "Adı : " + this.name + "\n" +
                "Maaşı : " + this.salary + "\n" +
                "Çalışma Saati : " + this.workHours + "\n" +
                "Başlangıç Yılı : " + this.hireYear + "\n" +
                "Vergi : " + tax() + "\n" +
                "Bonus : " + bonus() + "\n" +
                "Maaş Artışı : " + raiseSalary() + "\n" +
                "Vergi ve Bonuslar ile birlikte maaş : " + (this.salary - tax() + bonus()) + "\n" +
                "Toplam Maaş : " + (this.salary - tax() + bonus() + raiseSalary());
    }
}
