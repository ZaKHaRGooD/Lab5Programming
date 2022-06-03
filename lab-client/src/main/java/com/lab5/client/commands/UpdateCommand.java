package com.lab5.client.commands;

import com.lab5.client.controllers.CommandManager;
import com.lab5.client.entities.ProductLoader;
import com.lab5.client.entities.Product;

import java.io.IOException;

/**
 * Класс для обновления значений продукта
 */
public class UpdateCommand extends AbstractCommand {
    public UpdateCommand() {
        super("update", "обновление значений продукта", 1);
    }

    @Override
    public boolean execute(String[] args) {
        try {
            Product product = CommandManager.getCollectionManager().findById(Long.parseLong(args[0]));
            product.setName(ProductLoader.loadName(getReader(), product.getName()));
            product.setCoordinates(ProductLoader.loadCoordinates(getReader(), product.getCoordinates().toString()));
            product.setPrice(ProductLoader.loadPrice(getReader(), Long.toString(product.getPrice())));
            product.setUnitOfMeasure(ProductLoader.loadUnitOfMeasure(getReader(), product.getUnitOfMeasure().name()));
            product.setOwner(ProductLoader.loadPerson(getReader(), product.getOwner().toString()));
            System.out.println("Продукт успешно обновлен!");
            return true;
        } catch (IOException e) {
            System.out.println("Ошибка ввода.");
        } catch (NumberFormatException e) {
            System.out.println("Некорректный формат id.");
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
        return false;
    }
}
