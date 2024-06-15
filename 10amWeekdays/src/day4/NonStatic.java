package day4;

public class NonStatic {
	
	public static void main(String[] args) {		
		//classname objname = new classname();
		//classname objname = new constname();   		
		NonStatic obj = new NonStatic();
		obj.Disp_name();
		obj.Swap();
	}
	void Disp_name()
	{
		System.out.println("Hello");
	}	
	void Swap()
	{
		int a = 10 , b = 20 , c=0;		
		c = a;
		a = b;
		b = c;		
		System.out.println(a);
		System.out.println(b);		
	}
}
