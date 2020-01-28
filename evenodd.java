import java.util.Scanner;
public class evenodd
{
public static void main(String args[])
{
int num;
System.out.print("enter integer");
Scanner sc= new Scanner(System.in);
num=sc.nextInt();
if(num%2==0)
System.out.print("even");
else
System.out.print("odd");
}
}
