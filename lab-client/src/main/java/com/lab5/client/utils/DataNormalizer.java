package com.lab5.client.utils;

/**
 * Класс для записи даты и времени под один стиль.
 */
public final class DataNormalizer {
    private DataNormalizer() {

    }

    /**
     * @param data аргументы передаются в одной строке
     * @return String[] массив с аргументами, переданными из строки
     */
    public static String[] normalize(String data) {
        if ("".equals(data) || data == null) {
            return new String[0];
        }
        String[] args = Splitter.smartSplit(data.trim());
        for (String str : args
        ) {
            str = str.trim();
        }
        return args;
    }
}
