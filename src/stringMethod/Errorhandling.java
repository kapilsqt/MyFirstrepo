package stringMethod;

public class Errorhandling {
	
	public static void main(String[] args) {		
		
		int a = 10 , b=0;
		String name = null;
		try
		{
			System.out.println(name.length());
		}
		catch (Exception e) {
			
			System.out.println(e);
		}		
	}
}
