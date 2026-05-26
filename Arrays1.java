//finding element in array
import java.util.*;
public class Arrays1{
public static void main(String[] args){
Scanner sc = new Scanner(System.in);
int size;
System.out.println("enter size of array:");
size = sc.nextInt();
int numbers[] = new int[size];
for(int i = 0 ; i<size ; i++)
{
System.out.println("enter elements of array:");
numbers[i]=sc.nextInt();
System.out.println("elements of array :" + numbers[i]);
}
int x;
System.out.println("enter x to be found:");

x = sc.nextInt();

for(int i =0 ; i<numbers.length ; i++)
{
if(numbers[i] == x)
{
System.out.println("x is found at" + i);
}
}
}}
enter size of array:
3
enter elements of array:
2
elements of array :2
enter elements of array:
4
elements of array :4
enter elements of array:
6
elements of array :6
enter x to be found:
6
x is found at2