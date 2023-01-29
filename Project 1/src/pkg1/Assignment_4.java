package pkg1;

public class Assignment_4 
{
public Assignment_4() 
{
	this(2,4,6,8);
	System.out.println("default constructor");
}
public Assignment_4(int a){
	this();
	System.out.println("one parameterized constructor");
}
public Assignment_4(int a, int b){
	this(10,12,14);
	System.out.println("two parameterized constructor");
}
public Assignment_4(int a, int b, int c){
	this(18);
	System.out.println("three parameterized constructor");
}
public Assignment_4(int a, int b, int c, int d){
	System.out.println("four parameterized constructor");
}
public static void main(String[] args) {
	Assignment_4 ABC=new Assignment_4(32,16);
	
}
}
