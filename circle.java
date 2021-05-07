 import java.util.Scanner;
 class  circle{
	public static void main(String[] args) {
			Scanner sc=new Scanner (System.in);
			double radius=sc.nextDouble();
        double perimeter = 2 * 3.14 * radius;
        double area = 3.14 * radius * radius;

        System.out.println("Perimeter is = " + perimeter);
        System.out.println("Area is = " + area);
    }
}