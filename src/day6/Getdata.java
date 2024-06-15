package day6;
public class Getdata {	
	void Swap(int a , int b , int c)
	{
		System.out.println("Before exce");
		System.out.println(" a = " + a);
		System.out.println(" b = " + b);
		System.out.println(" c = " + c);		
		c = a;
		a = b;
		b = c;		
		System.out.println("After exce");
		System.out.println(" a = " +a);
		System.out.println(" b = " +b);		
	}
	
	int Add(int a , int b)
	{
		int x = a+b;
		return x;
	}
}
