import java.util.Scanner; 
import java.io.*; 
/*
                                     *Programming Challenge 6*
      Same as challenge 6 (CashRegistarDemo class) but now the class being called prints to a file

*/
/**
  The CashRegistarFileDemo class creates two objects and prompts from quantity to be pruchased
*/
public class CashRegistarFileDemo { 
   public static void main(String[] args) throws IOException { 
      
      int quantity ,units = 43;
      double cost = 29.99;  
      String description = "T-Shirt Description";
      RetailItem rItem = new RetailItem(description ,units ,cost);
      Scanner scan = new Scanner(System.in); 
      
      System.out.print("Quantity: "); 
      quantity = scan.nextInt(); 
      
      CashRegistarFile cashR = new CashRegistarFile(rItem, quantity); 
      
   }
}
      
      
      