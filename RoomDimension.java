/*
                        *Programming Challnge 3*
     Practicing aggregation, instance of this class will be filed in RoomCarpet class. 
     Followed the UML diagram provided
   
*/ 
/**
   The RoomDimension class calcualtes the area of room 
*/ 

public class RoomDimension { 
 
   private double length; 
   private double width; 
   
   public RoomDimension(double len ,double w) { 
      length = len; 
      width = w; 
   } 
   
   /**
      Constructor
      @object2 A copy of the class to assign fields 
   */ 
   public RoomDimension(RoomDimension object2) { 
      length = object2.length; 
      width = object2.width; 
   } 
   
   /**
      The getArea method calculates the area of the room
   */ 
   
   public double getArea() { 
      double area; 
      area = length * width; 
      return area; 
   } 
   
   /**
      toString method
      @return str The state of the class instance
   */ 
   
   public String toString() { 
      
      String str = ("Length: " + length + " Width: " + width); 
      return str;
   } 
} 

