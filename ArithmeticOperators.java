package javaprogrm;

public class ArithmeticOperators {

	public static void main(String[] args) {
		System.out.println("arithemetic operators:");
		int a=10;
		int b=20;
		int c=a+b;
		int d=a*b;
		int e=b/a;
		int f=b-a;
		int g=b%a;
		System.out.println("a+b="+c);
		System.out.println("a*b="+d);
		System.out.println("b/a="+e);
		System.out.println("b-a="+f);
		System.out.println("b%a="+g);
		
		
		System.out.println("Relational operators:");
		int x=20;
		int y=10;
		System.out.println(x>y);
		System.out.println(x<y);
		System.out.println(x>=y);
		System.out.println(x<=y);
		System.out.println(x==y);
		System.out.println(x!=y);
		
		
		System.out.println("logical operators");
		int z=x|y;
		int z1=x&y;
		System.out.println(z);
		System.out.println(z1);
		
		
		
	System.out.println("Assignment operators:");
	int x1=30;
	System.out.println(x1);
	int x2=x1+=20;

	System.out.println(x2);
	int x3=x1+=20;
	System.out.println(x3);
	int x4=x1+=5;
	System.out.println(x4);
	int x5=x1+=20;
	System.out.println(x5);
	
	
		


	}

}
