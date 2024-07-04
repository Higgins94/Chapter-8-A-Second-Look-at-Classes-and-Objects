/*
                          *Programming Challnge 3*
     Practicing aggregation, class has field for RoomDimension object
     Followed the UML diagram provided

/**
   The RoomCarpet class calculates the total cost for a carpet installation 
*/

public class RoomCarpet { 

   private double carpetCost; 
   private RoomDimension size; 
   
   /**
      Constructor 
      @perma dim A RoomDimension object
      @perma cost The price per square foot of a carpet to be installed 
   */ 
   
   public RoomCarpet(RoomDimension dim ,double cost) {
   
      size = new RoomDimension(dim); 
      carpetCost = cost; 
   } 
   
   /**
      The getTotalCost returns the total cost for the installation 
   */ 
   
   public double getTotalCost() { 
      return size.getArea() * carpetCost; 
   } 
   
   /**
      toString method 
      @return str A string that diplays the area total and capert cost per sqft  
   */ 
   
   public String toString() { 
      String str = (String.format("Area: %,.2f " + 
         "Carpet Cost = %,.2f" ,size.getArea() ,carpetCost));
      return str;  
   } 
} 
 
      
   
   
   
   