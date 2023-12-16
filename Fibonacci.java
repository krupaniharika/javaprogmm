package javaprogrm;
import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
		
		int a=1,b=1, c=0;
		System.out.print("Enter a number:");
		Scanner sc=new Scanner(System.in);
		int k=sc.nextInt();
		System.out.print(a+" ");
		System.out.print(b+"");
		while(c<=k){
		c=a+b;
		if(c>=k)
		break;
		System.out.print(c+" ");
		a=b;
		b=c;
		}
		}
		
	

	}


