package JavaTask07;

import java.util.Scanner;

public class Division {
	
	static int num1;
	static int num2 ;
	

	public static void main(String[] args) {
		System.out.println("Enter two number");
Scanner sc = new Scanner(System.in);
 int num1 = sc.nextInt();
 int num2 = sc.nextInt();
 try {
 int Division = num1/num2;
 System.out.println("The Division of the Two number is :" + Division);
 }
 catch(ArithmeticException A) {
 
 }
 System.out.println("Error: cannot divide by zero ");
 

 


		
	}

}
