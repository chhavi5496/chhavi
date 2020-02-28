import java.util.*;
public class vowels
{
public static void main(String[] arg)
{
String s;
char ch;
int i=0,j;
Scanner sc=new Scanner(System.in);
s=sc.nextLine();
for(j=0;j<s.length();j++)
{
ch=s.charAt(j);	

switch(ch)
{
case 'a':
case 'e':
case 'i':
case 'o':
case 'u':
case 'A':
case 'E':
case 'I':
case 'U':


System.out.print(ch);
}
}
}
}




