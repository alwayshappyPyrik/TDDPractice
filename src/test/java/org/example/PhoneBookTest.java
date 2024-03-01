package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class PhoneBookTest {

    PhoneBook phoneBook = new PhoneBook();

    @Test
    public void add() {
        int actualSizePhoneBook = phoneBook.add("Yaroslav", "7-999-999-99-99");

        assertEquals(1, actualSizePhoneBook);
    }

    @Test
    public void findByNumber() {
        phoneBook.add("Yaroslav", "7-999-999-99-99");
        String actualContactName = phoneBook.findByNumber("7-999-999-99-99");

        assertEquals("Yaroslav", actualContactName);
    }

    @Test
    public void findByName() {
        phoneBook.add("Yaroslav", "7-999-999-99-99");
        String actualPhoneNumber = phoneBook.findByName("Yaroslav");

        assertEquals("7-999-999-99-99", actualPhoneNumber);
    }
}