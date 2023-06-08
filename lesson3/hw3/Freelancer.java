package lesson3.hw3;

public class Freelancer extends Employee {

    public Freelancer(String name, String surname, double salary, int workingHours) {
        super(name, surname, salary);
        this.workingHours = workingHours;
    }

    @Override
    public double calculateSalary() {
        return salary * workingHours;
    }

    @Override
    public String toString() {
        return String.format(
                "%s %s; Фрилансер; Заработная плата (%d рабочих часов в месяц): %.2f (руб.)",
                surname, name, workingHours, calculateSalary());
    }

}
