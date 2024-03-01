package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class PhoneBookTest {

    @Test
    public void add() {
        PhoneBook phoneBook = new PhoneBook();
        int actualSizePhoneBook = phoneBook.add("Yaroslav", "7-999-999-99-99");

        assertEquals(1, actualSizePhoneBook);
    }
}