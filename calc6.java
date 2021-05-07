import java.util.Scanner;
class calc6
{
public static void main(String args[]){
Scanner sc= new Scanner(System.in);
int i=sc.nextInt();
int j=sc.nextInt();
int a=i+j;
int b=i-j;
int c=i*j;
int d=i/j;
int e=i % j;
System.out.println(+i+"+"+j+"="+a);
System.out.println(+i+"-"+j+"="+b);
System.out.println(+i+"*"+j+"="+c);
System.out.println(+i+"/"+j+"="+d);
System.out.println(+i+"%"+j+"="+e);
}
}