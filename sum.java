import java.util.*;
class sum
{
public static void main(String args[])
{
int n,i=1,sum=0;
Scanner s=new Scanner(System.in);
System.out.println("Enter the number :");
n=s.nextInt();
do
{
sum=sum+i;
i++;
}while(i<=n);
System.out.println(sum);
}
}