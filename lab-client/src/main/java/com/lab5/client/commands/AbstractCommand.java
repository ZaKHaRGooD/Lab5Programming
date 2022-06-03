package com.lab5.client.commands;

import java.io.InputStreamReader;
import java.io.Reader;

/**
 * Абстрактный класс для создания команд.
 */
public abstract class AbstractCommand {
    private final String name;
    private final String description;
    private final int inlineArgumentsCount;
    private final Reader reader = new InputStreamReader(System.in);

    public AbstractCommand(String name, String description, int inlineArgumentsCount) {
        this.name = name;
        this.description = description;
        this.inlineArgumentsCount = inlineArgumentsCount;
    }

    /**
     * Абстрактный метод исполнения для всех команд.
     *
     * @param args
     * @return true - if при удачном выполнение команды, false - if при неудачном выполнение команды
     */
    public abstract boolean execute(String[] args);

    public Reader getReader() {
        return reader;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public int getInlineArgumentsCount() {
        return inlineArgumentsCount;
    }
}
