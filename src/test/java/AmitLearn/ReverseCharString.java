package AmitLearn;

public class ReverseCharString {

	public static void main(String[] args) {
	    String string = "amitkumar";
	    String reversedString = "";
	    for(int i = string.length()-1; i>=0; i--){
	      reversedString = reversedString + string.charAt(i);
	    }
	    System.out.print("The reversed string of the '"+string+"' is: " +reversedString );
	  }
	}