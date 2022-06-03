package com.lab5.client.commands;

import com.lab5.client.controllers.CommandManager;

/**
 * Класс для вывода первого элемента коллекции и его последующие удаление
 */
public class RemoveHeadCommand extends AbstractCommand {
    public RemoveHeadCommand() {
        super("remove_head", "вывод первого элемента коллекции и удаление его", 0);
    }

    @Override
    public boolean execute(String[] args) {
        try {
            System.out.println("Элемент коллекции, находящийся на первом метсе:\n"
                    + CommandManager.getCollectionManager().removeHead() + "\nбыл удачно удален");
        } catch (NullPointerException e) {
            System.out.println("Коллекция пуста");
        }
        return true;
    }
}
