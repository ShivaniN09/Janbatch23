package pkg1;

public class Assignment3 
{ 
	public Assignment3()
	{
	this(5,10,15);
		System.out.println("default constructor");
}
public Assignment3(int a) {
	this();
	System.out.println("one parametrize constructor");
}
public Assignment3(int a, int b) {
	this(25,30,35,40);
	System.out.println("two parametrize constructor");
}
public Assignment3(int a, int b, int c) {
	System.out.println("three parametrize constructor");
}
public Assignment3(int a, int b, int c, int d) {
	this(45);
	System.out.println("four parametrize constructor");
}
public static void main(String[] args) {
	System.out.println("The Assignment Constructor should be in the below sequence");
Assignment3 obj=new Assignment3(20,50);
}
}
