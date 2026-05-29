//isAscending or not

import java.util.*;
//given array is ascending or not
import java.util.*;
public class Array4{
public static void main(String[] args){
Scanner sc = new Scanner(System.in);
System.out.println("eneter size of array ");
int size = sc.nextInt();

int elements[] = new int[size];
 for(int i=0 ; i< size ; i++)
{
  System.out.println("elements of array");
  elements[i] = sc.nextInt();
 System.out.println("elements of array are : " + elements[i]);
}

boolean isAscending = true;
for(int i=0 ; i<elements.length-1 ; i++){

if(elements[i]>elements[i+1]){
   isAscending = false;
}
}
 
if(isAscending){
 System.out.println("is Ascending !");
}
else{
System.out.println("is not Ascending!");
}


}
}