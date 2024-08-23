package dev.dlee.appliboard.config;

import org.springframework.boot.CommandLineRunner;

// Class used for loading default data into database
// CURRENTLY NOT BEING USED
public class DataLoader implements CommandLineRunner {

    // EFFECTS: Prints "Hello" to console
    @Override
    public void run(String... args) throws Exception {
        System.out.println("Hello");
    }
}
