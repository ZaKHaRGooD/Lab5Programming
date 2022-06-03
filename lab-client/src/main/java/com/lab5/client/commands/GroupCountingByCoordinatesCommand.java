package com.lab5.client.commands;

import com.lab5.client.controllers.CommandManager;

/**
 * Класс для группировки элементов по координатам
 */
public class GroupCountingByCoordinatesCommand extends AbstractCommand {
    public GroupCountingByCoordinatesCommand() {
        super("group_counting_by_coordinates",
                "вывод количества элементов в каждой группе, созданной на основе координат", 0);
    }

    @Override
    public boolean execute(String[] args) {
        CommandManager.getCollectionManager().makeGroupsByCoordinates();
        CommandManager.getCollectionManager().outputGroupsByCoordinates();
        return true;
    }
}
