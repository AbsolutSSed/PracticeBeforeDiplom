package org.example;

public class Praktikum {

        public void main(String[] args) {
            // Пример строки с именем и фамилией
            String testName = "Тимоти Шаламе";

            // Создание экземпляра класса Account
            Account account = new Account(testName);

            // Вызов метода проверки и вывод результата
            boolean isValid = account.checkNameToEmboss();
            System.out.println("Можно ли напечатать на карте: " + isValid);
        }
    }
}
