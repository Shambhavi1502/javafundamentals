import java.util.*;
public class Function1{
  public static int SumValue(int a , int b) {
    int sum = a + b;
    return sum;
}
  public static void main(String[] args){
  Scanner sc = new Scanner(System.in);
  System.out.println("enter NUMBER");
  int a = sc.nextInt();
  System.out.println("enter NUMBER");
  int b = sc.nextInt();

  int sum = SumValue(a,b);
  System.out.println(sum);
}
}
