import java.util.*;
class greatest
{
public static void main(String args[])
{
int a,b,c;
Scanner s=new Scanner(System.in);
System.out.println("Enter the nos :");
a=s.nextInt();
b=s.nextInt();
c=s.nextInt();
if(a>b)
{
if(a>c)
{
System.out.println(a);
}
else
System.out.println(c);
}
else if(b>c)
{
System.out.println(b);
}
else 
System.out.println(c);
}
}