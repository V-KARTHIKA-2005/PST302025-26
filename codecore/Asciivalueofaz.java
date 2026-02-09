package pst;
public class Asciivalueofaz {
    public static void main(String[] args) {
        System.out.println("Lowercase Alphabets and their ASCII values:");
        for (char ch = 'a'; ch <= 'z'; ch++) {
            int asciiValue = (int) ch; 
            System.out.println(ch + " = " + asciiValue);
        }
    }
}