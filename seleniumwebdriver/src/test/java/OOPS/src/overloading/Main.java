package overloading;
class overloading
{

	void add(int a,int b)
	{
		int c= a+b;
		System.out.println(c);
	}
	void add(int  a,int  b,int e)
	
	{
		int d= a + b+ e;
		System.out.println(d);
	}
}
public class Main {
	public static void main(String[] args) {
		overloading v1=new overloading();
		v1.add(10,20);
		v1.add(10,20,30);
	}

}
