package exceptionhandling;

public class trycatch {
	public static void main(String[] args) {
		try {
			int[] numbers= {1,2,3,4,5};
			System.out.println(numbers[4]);
		}
		catch(Exception e)
		{
			System.out.println("something is wrong");
		}
		finally
		{
			System.out.println("try-catch is finished");
		}
	}

}
