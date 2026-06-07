import java.util.*;
public class Function2{
  public static void PrintFactorial(int n) 
{
   if(n < 0){
  System.out.println("inavlid");
}
   int f = 1;
   for(int i=n;i>=1;i--){
      f = f * i;
}
    System.out.println(f);    
    return;
}
  public static void main(String[] args){
  Scanner sc = new Scanner(System.in);
  System.out.println("enter NUMBER");
  int n = sc.nextInt();

  PrintFactorial(n);
}
}