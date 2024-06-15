package collection;
import java.util.ArrayList;
import java.util.List;
public class AList {
		public static void main(String[] args) {		
		List obj = new ArrayList();		
		obj.add(10);
		obj.add(100);
		obj.add(1000);
		obj.add(10000);		
		List obj2 = new ArrayList();		
		obj2.add(10);
		obj2.add(100);
		obj2.add(1000);
		obj2.add(10000);		
		System.out.println(obj);
		System.out.println(obj.get(2));
		System.out.println(obj.contains(10));
		System.out.println(obj.isEmpty());
		//obj.remove(0);
		//System.out.println(obj);
		System.out.println(obj.size());
		System.out.println(obj.equals(obj2));
		
	}

}
