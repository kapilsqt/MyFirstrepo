package inherit;
class Parent
{
	int a = 19, b=90;
}
class C1 extends Parent
{
	void Test1() {
		if(a<b)
		{
			System.out.println("true");
		}
		else
		{
			System.out.println("false");
		}
		
	}
}
class C2 extends Parent
{
	void Test2() {
		if(a>b)
		{
			System.out.println("true");
		}
		else
		{
			System.out.println("false");
		}		
	}	
}
public class HIR  {
	public static void main(String[] args) {
		C1 obj = new C1();
		obj.Test1();
	}
}
