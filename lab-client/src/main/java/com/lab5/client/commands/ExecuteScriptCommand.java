package com.lab5.client.commands;

import com.lab5.client.controllers.CommandListener;

import java.io.FileReader;
import java.io.IOException;
import java.util.HashSet;
import java.util.Set;

/**
 * Класс для исполнения скрипта
 */
public class ExecuteScriptCommand extends AbstractCommand {
    private static final Set<String> FILE_HISTORY = new HashSet<>();

    public ExecuteScriptCommand() {
        super("execute_script", "считать и исполнить скрипт из указанного файла", 1);
    }

    @Override
    public boolean execute(String[] args) {
        String fileName = args[0];
        if (FILE_HISTORY.contains(fileName)) {
            System.out.println("Ошибка составления скрипта, скрипт не может вызывать сам себя.");
            return false;
        } else {
            try {
                CommandListener listenerFromFile = new CommandListener(new FileReader(fileName));
                FILE_HISTORY.add(fileName);
                listenerFromFile.run();
            } catch (IOException e) {
                System.out.println(e.getMessage());
                return false;
            }
            FILE_HISTORY.remove(fileName);
        }
        return true;
    }
}
