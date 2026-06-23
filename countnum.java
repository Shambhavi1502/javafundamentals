//eleventh
import java.util.*;
public class countnum{
    public static void main(String args[])
{
Scanner sc = new Scanner(System.in);
System.out.println("enter number:");
int n= sc.nextInt();
int rem ;
int sum = 0;
while(n!=0)
{
  rem=n%10;
  n=n/10;
sum = sum + rem;
  

}
System.out.println(sum);

}
}
