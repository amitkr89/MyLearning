package AmitLearn;

public class ReverseCharWordSentence {

	public static void main(String[] args) {
		String OrgStr = "Hi I am Amit Kumar";
		String RevStr = "";
		String words[] = OrgStr.split(" ");
	    for (int i = 0; i < words.length; i++) {
	      String word = words[i];
	      String reverseWord = "";
	      for (int j = word.length() - 1; j >= 0; j--) {
	        reverseWord = reverseWord + word.charAt(j);
	      }
	      RevStr = RevStr + reverseWord + " ";
	    }
	    System.out.print("Reversed string : " + RevStr);
	  }
	}
