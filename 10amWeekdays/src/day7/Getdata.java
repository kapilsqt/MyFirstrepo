package day7;

import java.util.Scanner;

public class Getdata {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a value");
		//LOCAL VAR : INSIDE A METHOD BODY
		int a = sc.nextInt();
		double b = sc.nextDouble();
		String name = sc.next();
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(name);
		
		/*
		 * Logicdata obj = new Logicdata(); int output = obj.ABC(a,b);
		 * System.out.println(output);
		 */
	}
}
