package poly;
class Par
{
	void A()
	{
		System.out.println("parent");
	}
}
public class Override extends Par{
	
	void A()
	{
		super.A();
		System.out.println("child");
	}	
	public static void main(String[] args) {
		
		Override obj  = new Override();
		obj.A();
	}
}
