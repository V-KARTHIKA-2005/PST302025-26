package pst;
public class StringToAscii {
    public static void main(String[] args) {
        String inputString = "karthika";

        System.out.println("ASCII values for each character in the string \"" + inputString + "\":");
        for (int i = 0; i < inputString.length(); i++) {
            char character = inputString.charAt(i);
            int asciiValue = (int) character;
            System.out.println("Character: " + character + " | ASCII Value: " + asciiValue);
        }
    }
}
