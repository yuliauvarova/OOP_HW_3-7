package ru.geekbrains.lesson6.srp2;

public class Program {

    /**
     * TODO: Переработать структуру приложения Order, приложение должно
     * соответствовать
     * принципу SRP.
     * 
     * @param args
     */
    public static void main(String[] args) {

        Order order = new Order();
        OrderInput orderInput = new OrderInput();
        orderInput.inputFromConsole(order);

        OrderSaver orderSaver = new OrderSaver();
        orderSaver.saveToFile(order);

    }

}
