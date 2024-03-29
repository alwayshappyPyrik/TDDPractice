package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class PhoneBookTest {

    private PhoneBook phoneBook = new PhoneBook();

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

    @Test
    public void printAllNames() {
        PrintStream oldOut = System.out;
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        System.setOut(new PrintStream(baos));

        phoneBook.printAllNames();

        Assertions.assertEquals("Igor\r\n" + "Marina\r\n" + "Yaroslav\r\n", baos.toString());
        System.setOut(oldOut);
    }
}