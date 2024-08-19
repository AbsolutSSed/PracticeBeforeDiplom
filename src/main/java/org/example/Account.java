package org.example;

public class Account {

    private final String name;

    // Конструктор принимает строку с именем и фамилией
    public Account(String name) {
        this.name = name;
    }

    // Метод для проверки, соответствует ли строка требованиям
    public boolean checkNameToEmboss() {
        // Проверка длины строки
        if (name.length() < 3 || name.length() > 19) {
            return false;
        }

        // Проверка, что пробел присутствует и не находится в начале или конце строки
        int spaceIndex = name.indexOf(" ");
        if (spaceIndex == -1 || spaceIndex == 0 || spaceIndex == name.length() - 1) {
            return false;
        }

        // Проверка, что пробел только один
        if (name.indexOf(" ", spaceIndex + 1) != -1) {
            return false;
        }

        // Если все условия выполнены, возвращаем true
        return true;
    }
}