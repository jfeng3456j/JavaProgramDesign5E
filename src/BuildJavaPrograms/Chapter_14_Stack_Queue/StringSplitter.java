package BuildJavaPrograms.Chapter_14_Stack_Queue;

import java.util.LinkedList;
import java.util.NoSuchElementException;
import java.util.Queue;

public class StringSplitter {

    private Queue<Character> characters;
    private String token;
    public static final String SPECIAL_CHAR = "()+-*/^";

    public StringSplitter(String line) {
        characters = new LinkedList<>();
        for (int i = 0; i < line.length(); i++) {
            characters.add(line.charAt(i));
        }
        findNextToken();
    }

    public boolean hasNext() {
        return token != null;
    }

    public String next() {
        checkToken();
        String result = token;
        findNextToken();
        return result;
    }

    public String peek() {
        checkToken();
        return token;
    }

    private void findNextToken() {

        boolean isDone = false;
        while(!characters.isEmpty() && Character.isWhitespace(characters.peek())) {
             characters.remove();
        }

        if (characters.isEmpty()) {
            token = null;
        } else {
            token = ""+ characters.remove();
            if (!SPECIAL_CHAR.contains(token)) {
                while(!characters.isEmpty() && !isDone) {
                    char ch = characters.peek();
                    if (Character.isWhitespace(ch) || SPECIAL_CHAR.indexOf(ch) >=0) {
                        isDone = true;
                    } else {
                        token = ""+ characters.remove();
                    }
                }
            }
        }
    }

    private void checkToken() {
        if (!hasNext()) {
            throw new NoSuchElementException("illegal ");
        }
    }

}
