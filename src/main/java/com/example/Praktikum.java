package com.example;

public class Praktikum {

    public static final String name = "Тимоти Ш";

    public static void main(String[] args) {
        /*
             В этом методе заложи логику работы с классом Account.
             Нужно создать экземпляр класса Account: в качестве аргумента передать тестируемое имя
             и вызвать метод, который проверяет, можно ли использовать фамилию и имя для печати на банковской карте.
         */
        Account account = new Account(name);

        System.out.println(account.checkNameToEmboss());
    }
}
