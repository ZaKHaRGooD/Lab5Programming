package com.lab5.client.commands;

import com.lab5.client.configuration.Configurator;
import com.lab5.client.controllers.CommandManager;

import java.io.IOException;

/**
 * Класс для сохранения коллекции в файл
 */
public class SaveCommand extends AbstractCommand {
    public SaveCommand() {
        super("save", "сохранение коллекции в файл", 0);
    }

    @Override
    public boolean execute(String[] args) {
        try {
            Configurator.COLLECTION_FILE_WRITER.write(Configurator.getOutputFile(), CommandManager.getCollectionManager());
            return true;
        } catch (IOException e) {
            System.out.println("SaveCommand: " + e.getMessage());
        }
        return false;
    }
}
