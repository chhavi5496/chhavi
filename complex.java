import java.util.*;
class num
{
void add(int a,int b,int c,int d)
{
System.out.print(a+c);
System.out.print(b+d);
}
void multiply(int a,int b,int c,int d)
{
System.out.print(a*c-b*d);
System.out.print(a*d+b*c);
}
void sub(int a,int b,int c,int d)
{
System.out.print(a-c);
System.out.print(b-d);
}
}
public class complex
{
public static void main(String args[])
{
System.out.println("ENTER CASE");
Scanner s=new Scanner(System.in);
int n=s.nextInt();
System.out.print("ENTER VALUES");
Scanner sc= new Scanner(System.in);
int a=sc.nextInt();
int b=sc.nextInt();
int c=sc.nextInt();
int d=sc.nextInt();
num ob=new num();
switch(n)
{
case 1:
{
ob.add(a,b,c,d);
break;
}
case 2:
{
ob.multiply(a,b,c,d);
break;
}
case 3:
{
ob.sub(a,b,c,d);
break;
}
}
}
}

