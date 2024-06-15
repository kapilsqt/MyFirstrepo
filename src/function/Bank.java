package function;
public class Bank {
	//pre define
	public static void main(String[] args) {
		//classname objname = new classname();
		//objname.methodname()
		//method invoked
		Bank obj = new Bank();
		obj.Add();
		obj.Sub();
	}	
	
	//user define 
	void Add()
	{
		int a = 10 , b=20;
		int c = a + b ;
		System.out.println(c);
	}	
	void Sub()
	{
		int a = 10 , b=20;
		int c = a - b ;
		System.out.println(c);
	}
}
