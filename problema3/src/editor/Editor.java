package editor;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class Editor {

    public void checkSpelling(String text) {
        if (text == null || text.isEmpty()) {
            System.out.println("No input provided.");
            return;
        }

        ArrayList<String> errors = this.check(text);
        if (errors.isEmpty()) {
            this.displaySuccessMessage();
        } else {
            this.displayErrors(errors);
        }
    }

    public void displayErrors(ArrayList<String> errors) {
        for (String error : errors) {
            System.out.println("ERROR: " + error);
        }
    }

    public void displaySuccessMessage() {
        System.out.println("No errors found!");
    }

    public ArrayList<String> check(String text) {
        String[] words = text.split("\\s+"); // Divide el texto en palabras usando espacios como delimitadores
        Set<String> realWords = new HashSet<>();
        realWords.add("foo");
        realWords.add("bar");

        ArrayList<String> errors = new ArrayList<>();
        for (String word : words) {
            if (!realWords.contains(word.toLowerCase())) {
                errors.add(word);
            }
        }
        return errors;
    }

    public void runEditor() {
        System.out.println("Running editor...");
        System.out.println("Enter text:");
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            String text = br.readLine();
            this.checkSpelling(text);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        Editor editor = new Editor();
        editor.runEditor();
    }
}
