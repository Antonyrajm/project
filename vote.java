import java.util.*;
class vote
{
public static void main(String args[])
{
int n;
Scanner s=new Scanner(System.in);
System.out.println("Enter the age :");
n=s.nextInt();
if(n>=18)
{
System.out.println("eligible");
}
else
{
System.out.println("not eligible");
}
}
}