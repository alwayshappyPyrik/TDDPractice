package org.example;

import java.util.HashMap;
import java.util.Map;

public class PhoneBook {

    Map<String, String> phoneBook = new HashMap();

    public int add(String name, String numberPhone) {
        phoneBook.put(name, numberPhone);
        return phoneBook.size();
    }
}
