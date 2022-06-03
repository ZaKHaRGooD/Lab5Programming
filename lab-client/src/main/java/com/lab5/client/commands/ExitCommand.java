package com.lab5.client.commands;

import com.lab5.client.controllers.CommandListener;

/**
 * Класс для завершения исполнения программы
 */
public class ExitCommand extends AbstractCommand {
    public ExitCommand() {
        super("exit", "завершить программу", 0);
    }

    @Override
    public boolean execute(String[] args) {
        CommandListener.switchPerformanceStatus();
        return true;
    }
}
