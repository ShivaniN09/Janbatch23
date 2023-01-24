package pkg1;

public class Class1 {
int age;
int roll_no;
public void display1()
{
	System.out.println("welcome to all of you");
}
public void display2()
{
	System.out.println("the automation is very easy");
}
public static void main(String[] args) {
	Class1 obj=new Class1();
	obj.age=23;
	obj.roll_no=32;
	obj.display1();
	obj.display2();
	System.out.println(obj.age);
	System.out.println(obj.roll_no);
}
}
