package stringMethod;
public class ABC {	
	public static void main(String[] args) {		
		String name = "hello";
		String name2 = "Hello";
		System.out.println(name);		
		//method
		System.out.println(name.length());
		System.out.println(name.charAt(3));
		System.out.println(name.concat(" this is my java class"));
		System.out.println(name.contains("he"));
		//System.out.println(name.isEmpty());
		System.out.println(name.startsWith("h"));
		System.out.println(name.endsWith("o"));
		System.out.println(name.toLowerCase());
		System.out.println(name.toUpperCase());
		System.out.println(name.equals(name2));
		System.out.println(name.replace("h", "A"));		
		System.out.println(name.equalsIgnoreCase(name2));
	}
}
