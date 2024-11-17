package editor;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class SpellChecker {

    private final Set<String> validWords;

    public SpellChecker(Set<String> validWords) {
        this.validWords = validWords;
    }

    /**
     * Verifica las palabras del texto y devuelve una lista de palabras incorrectas.
     *
     * @param text Texto a verificar.
     * @return Lista de palabras incorrectas.
     */
    public List<String> check(String text) {
        String[] words = text.split("\\s+");
        List<String> errors = new ArrayList<>();

        for (String word : words) {
            if (!validWords.contains(word.toLowerCase())) {
                errors.add(word);
            }
        }

        return errors;
    }
}
