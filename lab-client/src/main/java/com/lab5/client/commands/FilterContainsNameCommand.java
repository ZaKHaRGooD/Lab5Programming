package com.lab5.client.commands;

import com.lab5.client.controllers.CommandManager;

/**
 * Класс для вывода элементов с заданной подстрокой
 */
public class FilterContainsNameCommand extends AbstractCommand {
    public FilterContainsNameCommand() {
        super("filter_contains_name", "вывод элементов, значение поля name которых содержит заданную подстроку", 1);
    }

    @Override
    public boolean execute(String[] args) {
        CommandManager.getCollectionManager().filterContainsName(args[0]);
        return true;
    }
}
