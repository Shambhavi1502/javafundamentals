import java.util.ArrayList;

public class ArrayList {
   public static void main(String[] args) { 
     ArrayList<Integer> list = new ArrayList<>();
//ArrayList<String> = new ArrayList<>();
//ArrayList<Boolean> = new ArrayList<>();

//Add elements
list.add(0);
list.add(2);
list.add(3);
System.out.println(list);

//Get elemstns 
int element = list.get(0);
System.out.println(element);

//add element in between
list.add(1,1);
System.out.println(list);
  }
}