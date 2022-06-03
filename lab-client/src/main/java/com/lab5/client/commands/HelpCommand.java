package com.lab5.client.commands;

import com.lab5.client.controllers.CommandManager;

import java.util.Map;

/**
 * Класс для показания справки по доступным командам
 */
public class HelpCommand extends AbstractCommand {
    public HelpCommand() {
        super("help", "вывод справки по доступным командам", 0);
    }

    @Override
    public boolean execute(String[] args) {
        for (Map.Entry<String, AbstractCommand> command : CommandManager.getCommands().entrySet()) {
            System.out.println(command.getValue().getName() + " - " + command.getValue().getDescription() + ", подразумевается " + command.getValue().getInlineArgumentsCount() + " аргумент(ов, а)");
        }
        return true;
    }
}
