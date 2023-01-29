package Week3.day1;

public class Calculator {

	public void Add(int a, int b) {
		System.out.println(a+b);
		
	}
	public void Add(int a, int b , int c)
	{
		System.out.println(c=a+b);
	}

	public void Multiple(double a, int b) {
		System.out.println(a*b);
		
	}
	public void multiple(double a, double b) {
		System.out.println(a*b);
		
	}


public static void main(String args[]) {
	
	Calculator cal = new Calculator();
	
	cal.Add(2,4);
	cal.multiple(4,5);
	
	
}

}
