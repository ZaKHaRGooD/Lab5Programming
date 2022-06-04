package com.lab5.client.commands;


import com.lab5.client.controllers.CommandManager;

/**
 * Класс для вывода элементов коллекции в порядке возрастания
 */
public class PrintAscendingCommand extends AbstractCommand {
    public PrintAscendingCommand() {
        super("print_ascending", "вывод элементов коллекции в порядке возрастания", 0);
    }

    @Override
    public boolean execute(String[] args) {
        CommandManager.getCollectionManager().printAscending();
        return true;
    }
}
