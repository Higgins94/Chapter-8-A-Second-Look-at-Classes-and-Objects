import java.util.Scanner; 
/*
                           *Programming Challenge 2*
       Practice with the expanded concepts of classes, using a copy constructor in the 
       SavingAccountCopyConstructor class to assign balance of account1 object to account2 object
       if statements to show object addresses are different yet have same value for balance field.
    
*/

/**
   The SavingAccountCopyConstructorDemo class creates two objects with the SavingAccountCopyConstructor
*/ 

public class SavingAccountCopyConstructorDemo { 
   public static void main(String[] args) { 
   
      Scanner scan = new Scanner(System.in); 
      double balance;
      System.out.print("Enter Balance: $"); 
      balance = scan.nextDouble(); 
      SavingAccountCopyConstructor account1 = new SavingAccountCopyConstructor(balance);
      SavingAccountCopyConstructor account2 = new SavingAccountCopyConstructor(account1); 
      System.out.println(account1.getBalance());  
      System.out.println(account2.getBalance()); 
      
      if(account1 == account2) 
         System.out.println("The objects share the same address"); 
      else 
         System.out.println("The objects are two different addresses");
         
      boolean status = account1.equals(account2); 
      if (status = true)  
         System.out.println("Balance fields are the same"); 
      else
         System.out.println("Balance fields are different"); 
          
           
   } 
}  
  