package ru.geekbrains.lesson6.srp2;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class OrderSaver {

    private Scanner scanner = new Scanner(System.in);

    private String chooseTypeToSave() {
        System.out.printf("В файле какого формата (json/txt/csv) Вы хотите сохранить заказ? ");
        String type = scanner.nextLine();
        scanner.close();
        type = type.trim();
        type = type.toLowerCase();
        return type;
    }

    public void saveToFile(Order order) {
        String type = chooseTypeToSave();
        if ((type.equals("json")) || (type.equals("txt")) || (type.equals("csv"))) {
            String fileName = String.format("order.%s", type);
            try (FileWriter writer = new FileWriter(fileName, false)) {
                writer.write("{\n");
                writer.write("\"clientName\":\"" + order.getClientName() + "\",\n");
                writer.write("\"product\":\"" + order.getProduct() + "\",\n");
                writer.write("\"qnt\":" + order.getQnt() + ",\n");
                writer.write("\"price\":" + order.getPrice() + "\n");
                writer.write("}\n");
                writer.flush();
                System.out.printf("Ваш заказ сохранен в файл .%s\n", type);
            } catch (IOException ex) {
                System.out.println(ex.getMessage());
            }
        } else {
            System.out.println("Файл такого типа создать нельзя");
        }
    }
}
