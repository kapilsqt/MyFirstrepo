package collection;

import java.util.HashMap;

public class Mapwork {
	
	public static void main(String[] args) {
		
		HashMap<String , Integer> obj = new HashMap<String, Integer>();
		obj.put("address", 21);
		obj.put("contact" , 909090);
		
		System.out.println(obj);
		
		System.out.println(obj.get("address"));
		System.out.println(obj.size());
		System.out.println(obj.containsKey("contact"));
		System.out.println(obj.isEmpty());
		obj.remove("address", 21);
		System.out.println(obj);
		
		
	}

}
