package lesson3.hw3;

public class Worker extends Employee {

    // private int workingHours;

    // {
    // workingHours = 180;
    // System.out.printf("РАБОЧЕЕ ВРЕМЯ РАБОЧЕГО %d\n", this.workingHours);
    // }

    public Worker(String name, String surname, double salary) {
        super(name, surname, salary);
    }

    // public Worker(String name, String surname, double salary) {
    // super(name, surname, salary);
    // //this.workingHours = 180;
    // }

    @Override
    public double calculateSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return String.format(
                "%s %s; Рабочий; Среднемесячная заработная плата (фиксированная месячная оплата): %.2f (руб.)",
                surname, name, calculateSalary());
    }
}
