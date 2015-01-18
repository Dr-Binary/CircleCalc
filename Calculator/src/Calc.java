import java.util.Scanner;

public class Calc {
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		double Pi = 3.14;
		System.out.println("Enter the radius of the circle");
		double radius = sc.nextDouble();
		double area = radius * radius * Pi;
		double circumference = 2*radius * Pi;
		System.out.println("The area of the circle is"+area);
		System.out.println("The circumfrence of the circle is"+circumference);
		
	}

}
