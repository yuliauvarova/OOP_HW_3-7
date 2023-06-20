package ru.geekbrains.lesson7.observer;

public class Program {

    /**
     * TODO: 1.Доработать приложение, поработать с шаблоном проектирования Observer
     * добавить новый тип соискателя.
     * **.2 Добавить новую сущность "Вакансия", компания должна рассылать вакансии.
     * **.3 Предусмотреть тип вакансии (enum)
     * 
     * @param args
     */
    public static void main(String[] args) {

        JobAgency jobAgency = new JobAgency();

        // Student student1 = new Student("A");
        // Object student2 = new Student("B");
        // Observer student3 = new Student("C");

        Company geekBrains = new Company("GeekBrains", 80000, jobAgency);
        Company google = new Company("Google", 150000, jobAgency);
        Company yandex = new Company("Yandex", 200000, jobAgency);

        Senior ivanov = new Senior("Ivanov");
        Senior petrov = new Senior("Petrov");
        Student sidorov = new Student("Sidorov");
        Middle kupenko = new Middle("Kupenko");
        Junior potapova = new Junior("Potapova");

        jobAgency.registerObserver(ivanov);
        jobAgency.registerObserver(petrov);
        jobAgency.registerObserver(sidorov);
        jobAgency.registerObserver(kupenko);
        jobAgency.registerObserver(potapova);

        for (int i = 0; i < 5; i++) {
            geekBrains.needEmployee();
            google.needEmployee();
            yandex.needEmployee();
        }

    }

}
