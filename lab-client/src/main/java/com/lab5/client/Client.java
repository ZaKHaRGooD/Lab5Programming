package com.lab5.client;

import com.lab5.client.controllers.CommandListener;
import com.lab5.client.controllers.CommandManager;
import com.lab5.client.configuration.Configurator;
import com.lab5.client.controllers.CollectionManager;

/**
 * Класс точка входа в програму
 */
public final class Client {
    private Client() {
        throw new UnsupportedOperationException("This is an utility class and can not be instantiated");
    }

    public static void greet() {
        System.out.println("Приложение работает, добро пожаловать!\n"
                + "Вызовите \"help\", чтобы увидеть список команд.");
    }

    public static void main(String[] args) {
        if (Configurator.configure()) {
            try {
                CollectionManager collectionManager = CollectionManager.readFromFile(Configurator.COLLECTION_FILE_READER, Configurator.getInputFile());
                greet();
                CommandManager.setCollectionManager(collectionManager);
                CommandListener listener = new CommandListener();
                listener.run();
            } catch (Exception e) {
                System.out.print("Client: ");
                System.out.println(e.getMessage());
            }
        }
    }
}
