package testa;

public class A {	
	public static void main(String[] args) {		
		String name = "Kapil" , next_str="";
		char ch;
		
		for(int i=0;i<name.length();i++)
		{
			ch= name.charAt(i);
			next_str = ch + next_str;
		}
		System.out.println(next_str);
		
	}

}
