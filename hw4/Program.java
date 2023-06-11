package hw4;

//import java.util.ArrayList;

public class Program {
    public static void main(String[] args) {
        Fruit apple1 = new Apple();
        Fruit apple2 = new Apple();
        Fruit apple3 = new Apple();
        Fruit apple4 = new Apple();
        Fruit apple5 = new Apple();

        Fruit orange1 = new Orange();
        Fruit orange2 = new Orange();
        Fruit orange3 = new Orange();
        Fruit orange4 = new Orange();

        Box<Fruit> box1 = new Box<Fruit>();
        box1.putInBox(apple1);
        box1.putInBox(apple2);
        box1.putInBox(apple3);
        box1.putInBox(apple4);
        box1.putInBox(apple5);

        Box<Fruit> box2 = new Box<Fruit>();
        box2.putInBox(orange1);
        box2.putInBox(orange2);
        box2.putInBox(orange3);
        box2.putInBox(orange4);

        System.out.println(box1);

        System.out.println(box2);

        System.out.println(box1.compareTo(box2));

        Box<Fruit> box3 = new Box<Fruit>();

        box1.emptyBox(box3);

        System.out.println("-----");

        System.out.println(box1);
        System.out.println(box3);

    }
}
