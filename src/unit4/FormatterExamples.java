package unit4;

public class FormatterExamples {
    public static void main(String[] args) {
        int chosen = 10;
        String name = "Dickson";
        // Python would do the same thing with this format string.
        System.out.format("%s guessed the right number %x!", name, chosen);
    }   
}
