package com.lab5.client.commands;

import com.lab5.client.controllers.CommandManager;
import com.lab5.client.entities.Product;
import com.lab5.client.entities.ProductLoader;

import java.io.IOException;

/**
 * Класс для удаления элементов меньше, чем заданный
 */
public class RemoveLowerCommand extends AbstractCommand {
    public RemoveLowerCommand() {
        super("remove_lower", "удаление всех элементов меньше, чем данный", 0);
    }

    @Override
    public boolean execute(String[] args) {
        try {
            Product comparedProduct = ProductLoader.loadProduct(getReader());
            CommandManager.getCollectionManager().getProducts().removeIf(product -> product.compareTo(comparedProduct) < 0);
            return true;
        } catch (IOException e) {
            System.out.println("Ошибка входного потока.");
        }
        return false;
    }
}
