package com.example;

public class Account {

    private final String name;

    public Account(String name) {
        this.name = name;
    }

    public boolean checkNameToEmboss() {
        if(name == null || name.length() == 0) {
            return false;
        } else {
            int length = name.length();
            String trimString = name.trim();
            int lengthTrim = trimString.length();
            int spaceCount = name.split(" ").length - 1;

            if(length >= 3 && length <= 19) {
                if(length == lengthTrim && spaceCount == 1)
                    return true;
            }
            return false;
        }
    }
}
