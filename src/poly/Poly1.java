package poly;
import java.util.Scanner;
//same method name but diff argument 
public class Poly1 {		
	void A()
	{
		System.out.println("Def");
	}	
	void A(int a)
	{
		System.out.println(a);
	}	
	
	void A(int a , int b)
	{
		System.out.println(a+b);
	}	
	public static void main(String[] args) {			
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a value");
		int a = sc.nextInt();
		int b = sc.nextInt();				
		Poly1 obj = new Poly1();
		obj.A();
		obj.A(a);
		obj.A(a, b);
	}
}
