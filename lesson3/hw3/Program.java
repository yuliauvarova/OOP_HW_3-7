package lesson3.hw3;

import java.util.Arrays;
import java.util.Random;

public class Program {

    static Random random = new Random();

    static Employee generateEmployee() {
        String[] names = new String[] { "Анатолий", "Глеб", "Клим", "Мартин", "Лазарь", "Владлен", "Клим", "Панкратий",
                "Рубен", "Герман" };
        String[] surnames = new String[] { "Григорьев", "Фокин", "Шестаков", "Хохлов", "Шубин", "Бирюков", "Копылов",
                "Горбунов", "Лыткин", "Соколов" };
        int workerTypeRandom = random.nextInt(0, 2);
        if (workerTypeRandom == 0) {
            int salary = random.nextInt(20000, 80000);
            return new Worker(names[random.nextInt(names.length)], surnames[random.nextInt(3)], salary);
        } else {
            int salary = random.nextInt(300, 1500);
            int workingHours = random.nextInt(20, 160);
            return new Freelancer(names[random.nextInt(names.length)], surnames[random.nextInt(3)], salary,
                    workingHours);
        }
    }

    public static void main(String[] args) {

        Employee[] employees = new Employee[10];
        for (int i = 0; i < employees.length; i++) {
            employees[i] = generateEmployee();
        }

        Arrays.sort(employees); // new WorkingTimeComparator() + new SalaryComporator

        for (Employee employee : employees) {
            System.out.println(employee);
        }

    }

}
