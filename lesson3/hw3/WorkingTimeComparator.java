package lesson3.hw3;

import java.util.Comparator;

public class WorkingTimeComparator implements Comparator<Employee> {
    @Override
    public int compare(Employee o1, Employee o2) {
        return Integer.compare(o2.workingHours, o1.workingHours);
    }
}
