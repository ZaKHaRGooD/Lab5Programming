package com.lab5.client.commands;

import com.lab5.client.controllers.CommandManager;


/**
 * Класс для удаления всех элементов коллекции
 */
public class ClearCommand extends AbstractCommand {
    public ClearCommand() {
        super("clear", "очистить коллекцию", 0);
    }

    @Override
    public boolean execute(String[] args) {
        CommandManager.getCollectionManager().clear();
        return true;
    }
}
