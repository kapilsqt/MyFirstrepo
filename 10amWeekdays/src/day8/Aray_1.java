package day8;

import java.util.Scanner;

public class Aray_1 {

	public static void main(String[] args) {		
		//int a[] = {1,2,3,4,5,6,7,8,1,2,3,4,5,6,7,8,1,2,3,4,5,6,7,8};		
		int a[] = new int[5];
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter value");
		for(int i=0;i<a.length;i++)
		{
			a[i] = sc.nextInt();
		}
		
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}
	}

}
