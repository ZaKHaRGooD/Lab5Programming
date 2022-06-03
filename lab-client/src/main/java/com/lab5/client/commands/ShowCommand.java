package com.lab5.client.commands;

import com.lab5.client.controllers.CommandManager;

/**
 * Класс для вывода всех элементов коллекции
 */
public class ShowCommand extends AbstractCommand {
    public ShowCommand() {
        super("show", "вывод всех элементов коллекции", 0);
    }

    @Override
    public boolean execute(String[] args) {
        CommandManager.getCollectionManager().show();
        return true;
    }
}
