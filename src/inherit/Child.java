package inherit;

class GP
{
	int a =10;
	int b = 20;	
	void Add()
	{
		int c = a+b;
		System.out.println(c);
	}
}
class P extends GP
{	
	void Sub()
	{
		int c = a-b;
		System.out.println(c);
	}
}
public class Child extends P {	
	void Mul()
	{
		int c = a*b;
		System.out.println(c);
	}	
	public static void main(String[] args) {		
		Child obj = new Child();
		obj.Add();
		obj.Sub();
		obj.Mul();
	}
}
