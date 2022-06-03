package com.lab5.client.commands;

import com.lab5.client.controllers.CommandManager;

/**
 * класс для удаления элемента коллекции по id
 */
public class RemoveByIdCommand extends AbstractCommand {
    public RemoveByIdCommand() {
        super("remove_by_id", "удаление элемента из коллекции по id", 1);
    }

    @Override
    public boolean execute(String[] args) {
        try {
            CommandManager.getCollectionManager().getProducts().remove(CommandManager.getCollectionManager().findById(Long.parseLong(args[0])));
            return true;
        } catch (NumberFormatException e) {
            System.out.println("Некорректный id.");
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
        return false;
    }
}
