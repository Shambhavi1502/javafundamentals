//calculate even odd in array
import java.util.*;
class ArrayEvenOdd{
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

public void CountEven()
{

for ( int i = 0 ; i<5 ; i++)
{

 if(arr[i] % 2 == 0 )
{
  System.out.println("even" + arr[i]);
}
}

}   
public void CountOdd()
{

for ( int i = 0 ; i<5 ; i++)
{

 if(arr[i] % 2 != 0 )
{
  System.out.println("Odd" + arr[i]);
}
}

}  

}


public class ArrayQue4{
public static void main(String args[])
{

ArrayEvenOdd obj = new ArrayEvenOdd();
obj.inputArray();
obj.CountEven();
obj.CountOdd();

}
}
