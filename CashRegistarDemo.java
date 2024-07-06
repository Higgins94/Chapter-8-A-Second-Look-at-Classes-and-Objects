import java.util.Scanner; 
/*
                     *Programming Challenge 6*
This is a simple program to test the functionality of the CashRegistar class
*/
/**
   The CashRegistarDemo class calculates the total amount due for a transaction 
*/
public class CashRegistarDemo { 
   public static void main(String[] args) { 
      
      int quantity ,units = 43;
      double cost = 29.99;  
      String description = "T-Shirt Description";
      RetailItem rItem = new RetailItem(description ,units ,cost);
      Scanner scan = new Scanner(System.in); 
      
      System.out.print("Quantity: "); 
      quantity = scan.nextInt(); 
      
      CashRegistar cashR = new CashRegistar(rItem, quantity); 
      
      System.out.print(String.format("\nSale: $%,.2f\nSubtotal: $%,.2f" + 
         "\nTax : $%,.2f\nTotal: $%,.2f" ,rItem.getPrice() ,cashR.getSubtotal() 
         ,cashR.getTax() ,cashR.getTotal())); 
   }
}
      
      
      