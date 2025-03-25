package dev.martabernardo;

import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;

import org.junit.jupiter.api.DisplayName;

class AppTest {
    @Test
    @DisplayName("Test if the initMessage method is called")
    void testAppRunning() {
        String input = "1.70\n70.50\n";
        ByteArrayInputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);
        App.main(new String[]{});
    }
}
