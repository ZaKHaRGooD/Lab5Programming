package com.lab5.client.commands;

import com.lab5.client.controllers.CommandManager;

/**
 * Класс для показа информации о коллекции
 */
public class InfoCommand extends AbstractCommand {
    public InfoCommand() {
        super("info", "информация о коллекции", 0);
    }

    @Override
    public boolean execute(String[] args) {
        System.out.println("Информация о коллекции:");
        System.out.println(String.join("\n", CommandManager.getCollectionManager().getInfo()));
        return true;
    }
}
