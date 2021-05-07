//Write a Java program to print the area and perimeter of a rectangle.
import java.util.Scanner;
 class  rectangle{
	public static void main(String[] args) {
			Scanner sc=new Scanner (System.in);
			System.out.println("enter width ");
			double width=sc.nextDouble();
			System.out.println("enter height");
			double height=sc.nextDouble();
        double area = width*height ;
        double perimeter = 2*(width+height);

        System.out.println("Perimeter is = " +area);
        System.out.println("Area is = " +perimeter);
		}
		}