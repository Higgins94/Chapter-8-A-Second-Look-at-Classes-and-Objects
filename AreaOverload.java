import java.lang.Math;
/*
                        *Programming Challenge 1*
           Practice with static methods in an overloaded class
*/
/**
   The AreaOverload class has three static methods with different parameteres for calculating areas of three 
   shapes, circle, rectangle, and cylinder respectively. 
*/

public class AreaOverload { 
 
   /**
      The getArea static method for returning the area of a circle
      @perma radius The radius of the circle
   */ 
   
   public static double getArea(double radius) {  
      
      
      return Math.PI * (radius * radius);
      
   } 
   
   /**
      The getArea static method for returning the area of a rectangle 
      @perma length The length of the rectangle 
      @perma width The width of the rectangle 
   */    
   public static double getArea(int length ,int width) {  
     
     return length * width;  
   } 
   
   /**
      The getArea sattic method for returing the area of a cylinder
      @perma radius The radius of the two circles of a cylinder
      @perma height The height of the cylinder 
   */ 
   
   public static double getArea(double radius ,int height) { 
      
      return (2.0 * Math.PI * (radius * radius)) + (2.0 * Math.PI * radius * height); 
      
   } 
}
   
   