import java.util.Scanner; 
/*
                                    *Programming Challenge 5*
                                     Class used:
                                        Month.java
   More practice with objects in classes. Bare bones program to make sure the Month class is 
   functioning as intended.
*/
/**
   The MonthDemo demonstrates the Month Class
*/ 
public class MonthDemo { 
   public static void main(String[] args) { 
   
   int monthNumber; 
   String monthString; 
   Scanner scan = new Scanner(System.in);
   
   System.out.print("Input Month Number: "); 
   monthNumber = scan.nextInt();
   scan.nextLine(); 
   Month month1 = new Month(monthNumber); 
   System.out.print("getMonth: " + month1.getMonth() + "\ntoString: " + 
      month1.toString() + "\ngetMonthName: " + month1.getMonthName());
   
   System.out.print("\nEnter A Month's Name: "); 
   monthString = scan.nextLine(); 
   Month month2 = new Month(monthString);
   System.out.print("\ngetMonth: " + month2.getMonth() + "\ntoString: " + 
      month2.toString() + "\ngetMonthName: " + month2.getMonthName() +
      "\n\nObject1 Compare Object2\n-------------\nEquals: " + month1.equals(month2) + 
      "\nGreater: " + month1.greaterThan(month2) + "\nLesser: " + month1.lessThan(month2));
   } 
} 


      
  
   
    
     
   
  