package second;

import first.Logic;

public class Calling {

	public static void main(String[] args) {
		int a=10 , b=20;
		String name = null;
		Logic obj = new Logic();
		obj.Add(a, b , name);
		//obj.Sub(a,b);
	}
}
