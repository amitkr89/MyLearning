package AmitLearn;

public class PolindromNumStr {
	
	public static void polindroneNum(int num){
		int revNum = 0, rem, orgNum = num;
		while(num !=0 ){
			rem = num%10;
			revNum = revNum*10 +rem;
			num = num/10;
			}
		if(orgNum == revNum){
			System.out.println(orgNum+" is Polindrone");}
		else{
			System.out.println(orgNum+" is not Polindrone");
		}
	}

	public static void polindroneStr(String str){
		String revStr = "", orgStr = str;
		for(int i = 0; i< str.length(); i++){
			revStr = orgStr.charAt(i)+ revStr;}
		if(revStr.toLowerCase().equals(orgStr.toLowerCase())){
			System.out.println(orgStr+" is Polindrone");}
		else{
			System.out.println(orgStr+" is not Polindrone");}
		}

	public static void main(String[] args) {
		polindroneNum(12345);
		polindroneNum(12321);
		polindroneStr("abcde");
		polindroneStr("abcba");
	}
}