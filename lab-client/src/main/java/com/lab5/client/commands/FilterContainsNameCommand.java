package com.lab5.client.commands;

/**
 * Класс для вывода элементов с заданной подстрокой
 */
public class FilterContainsNameCommand extends AbstractCommand {
    public FilterContainsNameCommand() {
        super("filter_contains_name", "вывод элементов, значение поля name которых содержит заданную подстроку", 0);
    }

    @Override
    public boolean execute(String[] args) {

        return true;
    }
}
