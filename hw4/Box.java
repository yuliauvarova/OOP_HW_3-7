package hw4;

import java.util.ArrayList;

public class Box<T extends Fruit> {

    private ArrayList<T> fruits;

    private int idBox;

    private static int identifier;

    public static int getIdentifier() {
        return identifier;
    }

    public int getIdBox() {
        return idBox;
    }

    {
        idBox = ++identifier;
    }

    public Box() {
        fruits = new ArrayList<>();
    }

    public void putInBox(T fruit) {
        if (fruits.isEmpty()) {
            this.fruits.add(fruit);
        } else if (((fruit instanceof Apple) && (fruits.get(0) instanceof Apple))
                || ((fruit instanceof Orange) && (fruits.get(0) instanceof Orange))) {
            this.fruits.add(fruit);
        } else {
            System.out.println("В эту корзину нельзя положить фрукты данного вида.");
        }
    }

    @Override
    public String toString() {
        if (fruits.isEmpty()) {
            return String.format("Корзина %d пуста.", this.getIdBox());
        } else if (fruits.get(0) instanceof Apple) {
            return String.format("В корзине %d лежит %d яблок. ", this.getIdBox(), this.fruits.size());
        } else {
            return String.format("В корзине %d лежит %d апельсинов. ", this.getIdBox(), this.fruits.size());
        }

    }

    public float getWeight() {
        return this.fruits.get(0).getWeight() * this.fruits.size();
    }

    public boolean compareTo(Box<T> o) {
        return getWeight() == o.getWeight();
    }

    public void emptyBox(Box<Fruit> box) {
        // if (fruits.get(0) instanceof Apple) {
        for (int i = 0; i < this.fruits.size(); i++) {
            box.putInBox(fruits.get(i));
        }
        // }
        this.fruits.clear();
    }
}
