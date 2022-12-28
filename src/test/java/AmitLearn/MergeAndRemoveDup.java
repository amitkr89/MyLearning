package AmitLearn;
import java.util.*;

class MergeAndRemoveDup{

	public static void main(String[] args) {
		String [] a= {"aa","bb", "cc", "kk"}, b= {"dd","AA","mm", "KK"};
		String [] c= new String[a.length+b.length];
		
		for(int i = 0; i<a.length; i++){
			c[i]=a[i];  
		}
		
		for(int i = 0; i<b.length; i++){
			c[a.length + i]=b[i]; 
		}
		System.out.println(Arrays.toString(c));
		
		// convert to lowercase
		for (int i = 0; i < c.length; i++) {
			c[i] = c[i].toLowerCase();  
		}
		System.out.println(Arrays.toString(c));
		
		//remove duplicate string from array
		HashSet<String> hs = new HashSet<>();
		
		for (int i = 0; i<c.length; i++){
			hs.add(c[i]);
		}
		System.out.println(hs);
		
		int[] aa= {2,3, 4,6,3 ,9};
		int[] bb= {91,8,4,4,3,5};
		int[] cc= new int[aa.length+bb.length];
		
		for(int i = 0; i<aa.length; i++){
			cc[i]=aa[i];
		}
		
		for(int i = 0; i<bb.length; i++){
			cc[aa.length + i]=bb[i];
		}
		
		System.out.println(Arrays.toString(cc));
		//remove duplicate element from array
		HashSet<Integer> hsi = new HashSet<>();
		
		for (int i = 0; i<cc.length; i++){
			hsi.add(cc[i]);
		}
		System.out.println(hsi);
	}
}