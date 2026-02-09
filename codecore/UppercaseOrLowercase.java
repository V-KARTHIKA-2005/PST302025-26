package pst;
public class UppercaseOrLowercase {
	    public static String checkCase(char character) {
	        if (character >= 'A' && character <= 'Z') {
	            return "Uppercase";
	        } else if(character >= 'a' && character <= 'z') {
	            return "Lowercase";
	        }
	        else {
	           return "Not a letter";
	        }
	    }
	    public static void main(String[] args) {
	        char char1 = 'j'; 
	        char char2 = '8';
	        char char3 = 'G';
	        System.out.println(char1 + " is " + checkCase(char1));
	        System.out.println(char2 + " is " + checkCase(char2));
	        System.out.println(char3 + " is " + checkCase(char3));
	    }
	}
