package javaprogrm;

import java.util.Scanner;

public class Formulas {

	private static double a3;

	public static void main(String[] args) {
		int r;
		double PI=3.14;
		double a;
		
		System.out.println("enter radius of circle:");
		Scanner scan=new Scanner(System.in);
		r=scan.nextInt();
		a=r*r*3.14;
		System.out.println("Area of circle is::"+a);
		
		
		int l,b,a2;
		System.out.println("enter value of length and breadth:");
		Scanner r1 =new Scanner (System.in);
		l=r1.nextInt();
		b=r1.nextInt();
		a2=l*b;
		System.out.println("area of recatangle is:"+a2);
		
		
		int x,y,z,sp;
		System.out.println("enter values of sides:");
		Scanner r2=new Scanner(System.in);
		x=r2.nextInt();
		y=r2.nextInt();
		z=r2.nextInt();
		sp=(x+y+z)/2;
		a3=Math.sqrt(sp*(sp-x)*(sp-y)*(sp-z));
		System.out.println("area of triangle is:"+a3);
				
				
		
		
		
		
		
		

	}

}
