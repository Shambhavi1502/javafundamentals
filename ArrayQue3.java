//find average of array 
import java.util.*;
class ArrayAverage{
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

public double findAverage()
{
double sum = 0;
double average = 0;
for ( int i = 0 ; i<5 ; i++)
{
sum = sum + arr[i];
average = sum / arr.length;
}
average = sum / arr.length;
return average;
}   

}


public class ArrayQue3{
public static void main(String args[])
{

ArrayAverage obj = new ArrayAverage();
obj.inputArray();

System.out.println("Average is:" + obj.findAverage());

}
}
