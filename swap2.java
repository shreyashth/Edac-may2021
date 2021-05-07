import java.util.Scanner;
class swap2
{
public static void main(String args[])
{
 Scanner sc=new Scanner(System.in);
 int i=sc.nextInt();
 int j=sc.nextInt();
 int temp;
 temp=i;;
 i=j;
 j=temp;
 System.out.println("after swap i="+i);
 System.out.println("after swap i="+j);
}
}