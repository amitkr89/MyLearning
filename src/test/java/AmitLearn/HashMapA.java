package AmitLearn;
import java.util.*;

public class HashMapA {

	public static void main(String[] args) {
		HashMap<Integer , String> hm = new HashMap<Integer, String>();
		hm.put(1, "Amit");
		hm.put(2, "Kumar");
		hm.put(3, "Chaurasia");
		System.out.println(hm);
		//{1=Amit, 2=Kumar, 3=Chaurasia}
		for (String value : hm.values()){
			System.out.println(value+" "); 
		}//Amit Kumar Chaurasia
		for (Integer i :hm.keySet()){
			System.out.println(i+" "); 
		} // 1 2 3
		for (Integer i :hm.keySet()){
			System.out.println("Key - "+ i +" Value - "+hm.get(i));
		}
		hm.put(4, "India");
		System.out.println(hm.get(4));//india
		System.out.println(hm.size());//4
		hm.remove(4);
		System.out.println(hm);//remove India
		hm.clear();
		System.out.println(hm.size());//0
	}
}
