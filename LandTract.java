/*
                        *Programming Challenge 4*
       Practicing more aggregation but this time incorporating an equals method
*/ 
/**
   The LandTract method calculates the area of a tract of land 
*/ 

public class LandTract {
   
   private double length; 
   private double width;
   private boolean status = false;  
   
   /**
      Constructor 
      @perma l The length of the tract of land 
      @perma w The width of the tract of land 
   */ 
   
   public LandTract(double l ,double w) { 
      length = l; 
      width = w; 
   } 
   
   /**
      The getArea method
      @return the area of the tract of land 
   */ 
    
   
   public double getArea() {  
      return length * width; 
   } 
  
   /**
      The equals method compares the fields of two LandTract objects 
      @return status The string denoting if the fields are equal
   */
   
   public String equals(LandTract object2) { 
   
      String status = "The tracts of land are different sizes";
      
      if (length == object2.length && width == object2.width)  
         status = "The tracts of land are the same size";  
      return status; 
   } 
   
   /**
   toString method
   @return A string indicating the values of length and width 
   */ 
   
   public String toString() { 
      
      String str = "Length: " + length + " Width: " + width;
      return str; 
   } 
} 
