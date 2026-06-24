//tenth
import java.util.*;
public class count{
    public static void main(String args[])
{
Scanner sc = new Scanner(System.in);
System.out.println("enter number:");
int n= sc.nextInt();
int count = 1;
for(int i=1; i<=n ; i++)
{
  count++;
  n=n/10;
  

}
System.out.println(count);

}
}
