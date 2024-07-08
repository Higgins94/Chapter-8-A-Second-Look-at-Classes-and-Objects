import java.io.*; 
/*
                              *Programming Challenge 7*
             Same as challenge 6 (CashRegistar class) but now printing to a file, I chose to have the constructor just handle 
             everything when created
*/
/**
   The CashRegistarFile class calculates subtotal, tax, and total using RetailItem
   
*/ 
public class CashRegistarFile { 
   
   private final double TAX = 0.06; 
   private int quantity;
   private double subtotal; 
   private double tax; 
   private double total; 
   private RetailItem cashR;
   private File file = new File("test.txt");
   private PrintWriter outputFile = new PrintWriter(file);

   /**
      Constructor calls all methods, prints to file
      @perma object2 The RetailItem object. 
      @perma quanitity The amount of units to be pruchased.
   */ 
   
   public CashRegistarFile(RetailItem object2 ,int quantity) throws IOException { 
        
      this.quantity = quantity;
      outputFile.println("Sales Receipt"); 
      cashR = new RetailItem(object2.getDescription() ,object2.getUnits() ,object2.getPrice());
      outputFile.println("Unit Price: $" + cashR.getPrice());
      outputFile.println("Quantity: " + quantity); 
      getSubtotal();
      getTax();
      getTotal();    
   }
   
   /**
      The getSubtotal method returns the price field for cashR object then prints to file
   */ 
   
   public void getSubtotal() throws IOException { 
      subtotal = cashR.getPrice() * quantity; 
      outputFile.println(String.format("Subtotal: $%,.2f" ,subtotal)); 
   } 
   
   /**
      The getTax method calculates the tax to be added then prints to file  
   */ 
   
   public void getTax() throws IOException { 
      tax = subtotal * TAX; 
      outputFile.println(String.format("Tax: $%,.2f" ,tax));   
   }
   
   /**
      The getTotal method adds subtotal and tax fields then prints to file
   */ 
   
   public void getTotal () throws IOException { 
     total = subtotal + tax;  
     outputFile.println(String.format("Total: $%,.2f" ,total)); 
     outputFile.close(); 
   } 
}


   
  