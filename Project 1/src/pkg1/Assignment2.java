package pkg1;

public class Assignment2
{	
public int div(int a,int b )
{
	int c=a/b;
	System.out.println("div result is"+c);
	return c;
}
public int sub(int d, int e)
{
	int f=d-e;
	System.out.println("sub result is"+f);
	return f;
}
public int sum(int g, int h)
{
	int i=g+h;
	System.out.println("sum result is"+i);
	return i;
}
public int multi(int j, int k)
{
	int l=j*k;
	System.out.println("multi result is"+l);
	return l;
}
public static void main(String[] args) {
	Assignment2 obj=new Assignment2();
	int divresult= obj.div(10, 2);
	int subresult= obj.sub(divresult,2);
	int sumresult= obj.sum(subresult, 2);
	int subresult1=obj.sub(sumresult, 2);
	obj.div(subresult1,2);
}
}
