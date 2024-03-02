package org.example;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import java.util.TreeMap;

public class PhoneBook {

    Map<String, String> phoneBook = new HashMap<>();

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

    public void printAllNames() {
        phoneBook = new TreeMap<>();
        phoneBook.put("Yaroslav", "7-999-999-99-99");
        phoneBook.put("Marina", "7-999-999-99-88");
        phoneBook.put("Igor", "7-999-999-99-77");
        for (Map.Entry<String, String> map : phoneBook.entrySet()) {
            System.out.println(map.getKey());
        }
    }
}
