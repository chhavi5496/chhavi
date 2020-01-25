class abc
{
static
{
System.out.print("loading");
}
void print()
{
System.out.print("inside class");
}
}
public class block
{
public static void main(String args[])
{
abc a= new abc();
a.print();
}
static 
{
System.out.print("loading main");
}
}

