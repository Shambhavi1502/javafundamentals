//calculate sum of array
import java.util.*;
class ArraySum{
int arr[]=new int[5];
Scanner sc = new Scanner(System.in);
 public void inputArray()
{

System.out.println("enter elements");
      for(int i=0 ; i<5 ; i++)
{
         arr[i]=sc.nextInt();
}
}

public int CalculateSum()
{
int sum = 0;
for ( int i = 0 ; i<5 ; i++)
{
sum = sum + arr[i];
}
return sum;
}   

}


public class ArrayQue2{
public static void main(String args[])
{

ArraySum obj = new ArraySum();
obj.inputArray();

System.out.println("sum is:" + obj.CalculateSum());

}
}
