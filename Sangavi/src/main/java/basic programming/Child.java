package Assignment3;

public class Child extends Parent{
	int c;
	
	public Child(int p, int c) {
		super(p);
		this.c = c;
	}
	
	public Child(int z)
	{
		super(0);
		this.c=z;
	}

	

	public static void main(String[] args) {
		
		Child cobj = new Child(10,20);
		Child conly = new Child(30);
		
		System.out.println("Value from Child:"+cobj.c);
		System.out.println("Value from Paremt:"+cobj.p);
		System.out.println("Passign only child variable:"+conly.c);
		
		
		
	}

}
