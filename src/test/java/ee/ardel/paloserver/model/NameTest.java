package ee.ardel.paloserver.model;

import org.junit.Test;

import static org.junit.Assert.*;

public class NameTest {

    @Test
    public void shouldGetFullName() {
        String firstName = "John";
        String lastName = "Doe";

        Name testName = Name.newBuilder().firstName(firstName).lastName(lastName).build();

        String expectedFullName = firstName + " " + lastName;

        assertEquals(expectedFullName, testName.getFullName());
    }
}