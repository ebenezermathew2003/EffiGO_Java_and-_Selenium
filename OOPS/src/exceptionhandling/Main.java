package exceptionhandling;
import java.io.*;

public class Main {
public static void main(String[] args) {
	int n=10;
	int m=20;
	try {
		int ans=n/m;
		System.out.println("Answer: "+ans);
		
	}
	catch(ArithmeticException e)
	{
		System.out.println("Error");
	}
	finally {
		System.out.println("program continues after handling exception");
	}
}
}
