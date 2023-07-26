package firstpackage;

public class ArithmaticOperation {
	//Constructor
	public ArithmaticOperation() {
		System.out.println("\n");
	}
	
	//without parameter and without return type - Addition
	public static void Add() {
		int a=20;
		int b=10;
		int c=a+b;
		System.out.println("a = 20");
		System.out.println("b = 10");
		System.out.println("\nAddition of a and b is \t\t:"+ c);
	}

	//with parameter and without return type - Subtraction
	public static void Sub(int a,int b) {
		int c=a-b;
		System.out.println("Subtraction of a and b is \t:"+ c);
	}
	
	//with parameter and with return type - Multiplication
	public static int Mul(int a,int b) {
		int c=a*b;
		System.out.println("Multiplication of a and b is \t:"+ c);
		return c;
	}
	
	//without parameter and with return type - Division
	public static int Div() {
		int a=20;
		int b=10;
		int c=a/b;
		System.out.println("Division of a and b is  \t:"+ c);
		return c;
	}
	
	public static void main(String[] args) {
		ArithmaticOperation Add=new ArithmaticOperation();
		ArithmaticOperation.Add();
		
		ArithmaticOperation Sub=new ArithmaticOperation();
		ArithmaticOperation.Sub(20, 10);
		
		ArithmaticOperation Mul=new ArithmaticOperation();
		ArithmaticOperation.Mul(20, 10);
		
		ArithmaticOperation Div=new ArithmaticOperation();
		ArithmaticOperation.Div();
	}

}
