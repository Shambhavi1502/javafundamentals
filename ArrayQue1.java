//q1) find max element in array
import java.util.*;
class maxArray{
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
public void findmax(){
int max = arr[0];

 for(int i=0 ; i<5 ; i++)
{
if(arr[i]>max)
{
max = arr[i];
}
}
System.out.println("maximum :" + max);
}

public void findmin()
    {
     int min = arr[0];

 for(int i=0 ; i<5 ; i++)
{
if(arr[i]<min)
{
min = arr[i];
}
}
System.out.println("minimum :" + min);

}
   
}


public class ArrayQue1{
public static void main(String args[])
{

maxArray obj = new maxArray();
obj.inputArray();
obj.findmax();
obj.findmin();
}
}
