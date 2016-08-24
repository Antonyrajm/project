import java.util.*;
class fibo
{
public static void main(String args[])
{
int a=0,b=1,n,i,f=0;
Scanner s=new Scanner(System.in);
System.out.println("Enter the number :");
n=s.nextInt();
for(i=1;i<=n;i++)
{
System.out.println(f);

a=b;
b=f;
f=a+b;
}
}
}