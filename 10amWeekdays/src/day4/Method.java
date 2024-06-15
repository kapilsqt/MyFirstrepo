package day4;
public class Method {
	//pre define method 
	public static void main(String[] args) {			
		Dummy();
		Swap();
	}		
	static void Dummy()
	{
		double pie = 3.14;
		int r =5;		
		double output  = (pie * r * r);
		System.out.println(output);
	}	
	static void Swap()
	{
		int a = 10 , b = 20 , c=0;		
		c = a;
		a = b;
		b = c;		
		System.out.println(a);
		System.out.println(b);		
	}
}

