import java.math.*; 
/*
                  *Programming challenge 9* 
          Using three basic static methods in a class
*/
/**
   The Geometry class calculates the area for circle, rectangle, and triangle
*/

public class Geometry { 
   
   /**
   No-arg Constructor
   */ 
   
   public Geometry() {    
   } 
   
   /**
      area method for circle
      @perma radius The radius of a circle 
      @return The area of a circle
   */ 
   
   public static double area(double radius) {
     if (radius < 0) { 
      System.out.print("\nERROR");
      return 0;
     } 
     return Math.PI * (radius * radius); 
   } 
   
   /**
         area method for circle
      @perma length A rectangle side
      @perma width A rectangle side
      @return The area of a rectangle
   */ 
   
   public static double area(int length ,int width) { 
      if (length < 0 || width < 0) { 
         System.out.print("\nERROR");
      return length * width * 0; 
     } 
      return length * width; 
   } 
   
   /**
      area method for triangle 
      @perma base The base of the triangle 
      @perma height The height of triangle 
      @return The area of a triangle 
   */ 
   
   public static double area(double base ,double height) { 
      if (base < 0 || height < 0) { 
         System.out.print("\nERROR");
      return base * height * 0; 
     }
      return base * height * 0.5; 
   } 
} 


    
      
      
   