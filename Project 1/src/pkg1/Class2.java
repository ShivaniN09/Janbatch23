	package pkg1;

public class Class2 {
	public int sum(int a, int b)          //method 01
	{
		int c=a+b;
		System.out.println("sum result is "+c);
		return c;
	}
public int sub(int a1,int a2)             //method2
{
	int r=a1-a2;
	System.out.println("sub result is "+ r);
	return r;
}
public int multi(int s1, int s2)              //method3
{
	int m=s1*s2;
	System.out.println("multi result is"+ m);
	return m;
}
public int div(int t1, int t2)                //method4
{
	int d=t1/t2;
	System.out.println("div result is"+d);
	return d;
}
public static void main(String[] args) 
{
	Class2 shi=new Class2();
	int sumresult=shi.sum(10, 2);
	int sumresult2=shi.sum(sumresult,2);
	int subresult=shi.sub(sumresult2, 2);
	int multiresult=shi.multi(subresult, 2);
	shi.div(multiresult, 2);
}
}
