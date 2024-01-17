package Inheritance;

public class Main 
{
	public static void main(String[] args) {
		
		Father f = new Father();
		Son s = new Son();
		System.out.println(f.property());
		System.out.println(s.Property());
		
		Father f1 = new Son();
		System.out.println(f1.property());
		
		
		
		
	}

}
