import java.util.*;
public class Function2{
  public static int ProductValue(int a , int b) 
{
    
    return a*b;
}
  public static void main(String[] args){
  Scanner sc = new Scanner(System.in);
  System.out.println("enter NUMBER");
  int a = sc.nextInt();
  System.out.println("enter NUMBER");
  int b = sc.nextInt();

  
  System.out.println("product of 2 numbers is: " + ProductValue(a,b));
}
}

