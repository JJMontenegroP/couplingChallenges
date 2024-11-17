package editor;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;
import java.util.Set;

public class Editor {

    private final SpellChecker spellChecker;

    public Editor(SpellChecker spellChecker) {
        this.spellChecker = spellChecker;
    }

    public void run() {
        System.out.println("Running editor...");
        System.out.println("Enter text:");
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            String text = br.readLine();
            checkSpelling(text);
        } catch (IOException e) {
            System.err.println("Error reading input: " + e.getMessage());
        }
    }

    private void checkSpelling(String text) {
        if (text == null || text.trim().isEmpty()) {
            System.out.println("No input provided.");
            return;
        }

        List<String> errors = spellChecker.check(text);
        if (errors.isEmpty()) {
            System.out.println("No errors found!");
        } else {
            displayErrors(errors);
        }
    }

    private void displayErrors(List<String> errors) {
        System.out.println("Spelling errors found:");
        for (String error : errors) {
            System.out.println("ERROR: " + error);
        }
    }

    public static void main(String[] args) {
        // Create a spell checker with predefined words
        Set<String> validWords = Set.of("foo", "bar", "baz");
        SpellChecker spellChecker = new SpellChecker(validWords);

        // Run the editor
        Editor editor = new Editor(spellChecker);
        editor.run();
    }
}
