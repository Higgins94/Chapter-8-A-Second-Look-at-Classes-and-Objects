/*
                           *Programming Challenge 2*
       Practice with the expanded concepts of classes, using a copy constructor here 
    
*/

/**
   This is a simplified class of the orginal SavingAccount class. The purpose the SavingAccountCopyConstructor 
   is to have a copy constructor that copies the balance field of an object of the same class and assings that 
   object's balance field to the newly created object's balance field
*/ 
public class SavingAccountCopyConstructor { 

   private double balance;
    
 
   /**
      Copy constructor 
   */ 
      
      public SavingAccountCopyConstructor (SavingAccountCopyConstructor account) { 
        balance = account.balance; 
      } 
      
   /**
      Constructor 
      @bal The value for the balance of the account
   */ 
   
   public SavingAccountCopyConstructor(double bal) { 
      balance = bal; 
  }
  
  /**
   The getBalance method returns balance 
   @return balance The balance of the account
  */ 
  
  public double getBalace() { 
   return balance; 
  } 
   
   /**
      The equals method compares an object's balance field to another object's balance field
      @perma account The object of the same class 
      @return status The boolean value for if the balance fileds of the two objects are the same
   */
   
   public boolean equals(SavingAccountCopyConstructor account) { 
      boolean status = false; 
      
      if (balance == account.getBalance()) { 
         status = true; 
         return status; 
      } 
      return status; 
   } 
} 
   
   