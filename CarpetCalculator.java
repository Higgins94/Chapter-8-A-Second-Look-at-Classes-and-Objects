import java.util.Scanner; 
/*
                             Programming Challnge 3*
               Main method to make objects for aggregation class 
               Classes used: 
                  RoomDimension
                  RoomCarpet 
*/

/**
   The CarpetCalculator class prompts the user for the length, width, and 
   carpet cost per square foot in order to determine total cost of installation 
*/ 
public class CarpetCalculator { 
   public static void main(String[] args) { 
      
      double carpetCost ,length ,widith; 
      
      Scanner scan = new Scanner(System.in); 
      
      System.out.print("Enter length of room (feet): "); 
      length = scan.nextDouble(); 
      System.out.print("Enter widith of room (feet): ");
      widith = scan.nextDouble();  
      RoomDimension size = new RoomDimension(length ,widith); 
      
      System.out.print("Enter cost of carpet: "); 
      carpetCost = scan.nextDouble(); 
      
      RoomCarpet roomCarpet = new RoomCarpet(size ,carpetCost); 
      System.out.println(roomCarpet.getTotalCost()); 
   } 
} 


      