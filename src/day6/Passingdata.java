package day6;

import java.util.Scanner;

public class Passingdata {
	
	public static void main(String[] args) {		
		//user input
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter  a value");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		String name = sc.next();
		
		Getdata obj = new Getdata();
		obj.Swap(a,b,c);
		
		int x = obj.Add(a, b);
		System.out.println(x);
		
	}
}
