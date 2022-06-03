package com.lab5.client.commands;

import com.lab5.client.controllers.CommandManager;

/**
 * Класс для вывода первого элемента коллекции
 */
public class HeadCommand extends AbstractCommand {
    public HeadCommand() {
        super("head", "вывод первого элемента коллекции", 0);
    }

    @Override
    public boolean execute(String[] args) {
        if (CommandManager.getCollectionManager().getProducts().isEmpty()) {
            System.out.println("Коллекция пуста");
        } else {
            System.out.println("Первый элемент коллекции\n" + CommandManager.getCollectionManager().getProducts().peek());
        }
        return true;
    }
}
