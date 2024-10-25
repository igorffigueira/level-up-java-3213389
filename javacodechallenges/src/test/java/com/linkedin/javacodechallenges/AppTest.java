package com.linkedin.javacodechallenges;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest {
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue() {
        // Prepare
        // Create a stream to hold the output
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        // Redirect System.out to our stream
        PrintStream originalOut = System.out;
        System.setOut(new PrintStream(outContent));

        var expectedFirstname = "abc";
        var expectedLastName = "def";
        var expectedDefaultAge = 0;
        var expectedPrintedMessage = String.format(
                "Hey I'm %s %s with %d years old.",
                expectedFirstname,
                expectedLastName,
                expectedDefaultAge);

        var person = new Person("abc", "def");
        // Act
        person.SelfIntroduction();

        // Assert
        assertEquals(expectedDefaultAge, person.getAge());
        assertEquals(expectedPrintedMessage, GetLastOutputMessage(outContent));

        // Reset System.out
        System.setOut(originalOut);
    }

    private String GetLastOutputMessage(ByteArrayOutputStream outContent) {

        // Call the method that does the printing
        // System.out.println("Hello, world!");

        // Get the printed content as a string
        return outContent.toString().trim();
    }
}
