package bank;

class Account {
   public String name; //accessible to anybody(any class also any package)
   protected String email; //only sub classes can access
   private String passwords; //can only be accessed only to its class no its subclass nor diff class

//getters & setters to access private ;
public String getPassword() {
   return this.password;
}

public void setPassword() {
   this.password = pass;

}
}

public class Bank {
     public static void main(String[] args)
 {
       Account acc1 = new Account;
       acc1.name = "Apna College";
       acc1.email = "apnacollege@gamil.com";

  }
}