package com.example;

public class Account {

    private final String name;

    public Account(String name) {
        this.name = name;
    }

    public boolean checkNameToEmboss() {
        /*
             Этот метод должен проверять, что сохранённая через конструктор строка соответствует требованиям.
             Если строка удовлетворяет условиям, метод возвращает true, иначе — false.
         */
        int length = this.name.length();
        String trimString = this.name.trim();
        int lengthTrim = trimString.length();
        int spaceCount = this.name.split(" ").length - 1;

        if(length >= 3 && length <= 19) {
            if(length == lengthTrim && spaceCount == 1)
                return true;
            else return false;
        }
        else return false;
    }
}
