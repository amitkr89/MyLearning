package AmitLearn;

public class PrimeNumber {
	public static void primeN(int num) {
		int n = num, a = 0, m = n/2;
		if (n==0||n==1){
			System.out.println(n+ " not prime number");}
		else{
			for(int i = 2; i<=m; i++){
				if(n%i==0){
					System.out.println(n +" is not prime number");
					a=1;
					break;  }
			}
			if (a==0){
				System.out.println(n + " is prime number");
			}
		}
	}
	public static void main(String[] args) {
		primeN(113);
		primeN(110);
	} 
}
