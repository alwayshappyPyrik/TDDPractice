package org.example;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class PhoneBook {

    static Map<String, String> phoneBook = new HashMap<>();

    public int add(String name, String numberPhone) {
        phoneBook.put(name, numberPhone);
        return phoneBook.size();
    }

    public String findByNumber(String numberPhone) {
        Optional<String> keyByValue = phoneBook.entrySet()
                .stream()
                .filter(entry -> numberPhone.equals(entry.getValue()))
                .map(Map.Entry::getKey)
                .findFirst();

        return keyByValue.orElse("По такому номеру контакта нету");
    }

    public String findByName(String nameContact) {
        if (phoneBook.containsKey(nameContact)) {
            return phoneBook.get(nameContact);
        }
        return "По такому имени номера нету";
    }
}
