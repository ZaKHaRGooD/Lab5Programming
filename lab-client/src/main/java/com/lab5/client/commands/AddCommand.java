package com.lab5.client.commands;

import com.lab5.client.controllers.CommandManager;
import com.lab5.client.entities.Product;
import com.lab5.client.entities.ProductLoader;

import java.io.IOException;

/**
 * Класс для добавления элемента в коллекцию
 */
public class AddCommand extends AbstractCommand {
    public AddCommand() {
        super("add", "добавить новый элемент в коллекцию", 0);
    }

    @Override
    public boolean execute(String[] args) {
        try {
            Product productToAdd = ProductLoader.loadProduct(getReader());
            CommandManager.getCollectionManager().add(productToAdd);
            System.out.println("Новый продукт успешно создан!");
            return true;
        } catch (IOException e) {
            System.out.println("Ошибка ввода.");
        }
        return false;
    }
}
