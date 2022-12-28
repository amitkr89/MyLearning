package AmitLearn;
import java.util.*;

public class RevWordStringSentence {

	public static void main(String[] args) {
		String orgStr = "Welcome Amit Welcome to India Amit";
		System.out.println(orgStr);
		//Reverse word in String
		String[] words = orgStr.split(" ");
		System.out.println(Arrays.toString(words));
		for(int i = words.length-1; i>=0; i--){
			System.out.print(words[i]+ " "); }
		System.out.println();
		//find duplicate word
		for (int i = 0; i<words.length-1; i++){
			for(int j = i+1; j<words.length; j++){
				if(words[i].equals(words[j]))
					System.out.println(words[i]);
			} 
		}
		//Reverse full string
		String revStr = "";
		for(int i = 0; i < orgStr.length(); i++){
			revStr = orgStr.charAt(i) + revStr;
		}
		System.out.println(revStr);
		//Reverse each word of String
		for(String word : orgStr.split(" ")){
			String revWord = "";
			for(int i = 0; i < word.length(); i++){
				revWord = word.charAt(i)+ revWord;
			}
			System.out.print(revWord+ " ");
		}
	}   
}

