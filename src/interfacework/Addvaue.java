package interfacework;

public class Addvaue implements I1 , I2{
	
	public static void main(String[] args) {		
		Addvaue obj = new Addvaue();
		obj.Add();
	}

	@Override
	public void Add() {
		int c= a+b;
		System.out.println(c);
	}

}
