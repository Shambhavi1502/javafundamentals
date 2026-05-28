//max & min from array
import java.util.*;
public class Array3{
public static void main(String[] args){
Scanner sc = new Scanner(System.in);
System.out.println("eneter size of array ");
int size = sc.nextInt();

int elements[] = new int[size];
 for(int i=0 ; i< size ; i++){
  System.out.println("elements of array");
  elements[i] = sc.nextInt();
 System.out.println("elements of array are : " + elements[i]);
}

int max = elements[0];
int min = elements[0];
for(int i=0 ; i<elements.length ; i++){
  
   if(elements[i] > max)
{
max = elements[i];

}


if(elements[i] < min){
min = elements[i];

}
}

System.out.println("maximum element is" + max);
System.out.println("maximum element is" + min);

}}