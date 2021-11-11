package coreLibraryApplication;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BookRegisterTest {
    static BookRegister bookRegister;

    @BeforeAll
    static void createBookRegister(){
        bookRegister = new BookRegister();
        bookRegister.addDummyData();
    }


    @Test
    void searchForBookTitle() {
        System.out.println("Testing searchForBookTitle");
        assertEquals("Morten Nymo", bookRegister.searchForBookTitle("Fysikk 2").getAuthor());
    }

    @Test
    void searchForEanCode () {
        System.out.println("Testing searchForEanCode");
        assertEquals("Fysikk 2", bookRegister.searchForEanCode("9778634557874"));
    }
}