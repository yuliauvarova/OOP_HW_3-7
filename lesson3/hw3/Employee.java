package lesson3.hw3;

public abstract class Employee implements Comparable<Employee> {

    protected String name;
    protected String surname;
    protected double salary; // Ставка заработной платы
    protected int workingHours; // Рабочие часы

    public int getWorkingHours() {
        return workingHours;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public double getSalary() {
        return salary;
    }

    {
        workingHours = 180;
    }

    public Employee(String name, String surname, double salary) {
        this.name = name;
        this.surname = surname;
        this.salary = salary;

    }

    public Employee(String name, String surname, double salary, int workingHours) {
        this.name = name;
        this.surname = surname;
        this.salary = salary;
        this.workingHours = workingHours;
    }

    /**
     * Расчет среднемесячной заработной платы
     * 
     * @return
     */
    public abstract double calculateSalary();

    // @Override
    // public int compareTo(Employee o) {
    // int res = surname.compareTo(o.surname);
    // if (res == 0)
    // return Double.compare(calculateSalary(), o.calculateSalary());
    // else
    // return res;
    // }

    @Override
    public int compareTo(Employee o) {
        int res = surname.compareTo(o.surname);
        if (res == 0) {
            // System.out.printf("!!!!!!!!! %d %d", workingHours, o.workingHours);
            int res1 = Integer.compare(workingHours, o.workingHours);
            if (res1 == 0) {
                return Double.compare(calculateSalary(), o.calculateSalary());
            } else {
                return res1;
            }
        } else {
            return res;
        }
    }
}
