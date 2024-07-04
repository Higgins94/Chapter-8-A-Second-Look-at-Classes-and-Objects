import java.util.Scanner; 
/*
                            *Programming Challenge 4*
       Practicing more aggregation but this time incorporating an equals method
         Class used: LandTract 
*/ 
/**
   The LandTractDemo class creates two objects and calls a couple methods from those
   objects and compares fields 
*/ 
public class LandTractDemo { 
   public static void main(String[] args) { 
   
      double length, width; 
      
      Scanner scan = new Scanner(System.in); 
      
      System.out.print("Tract 1's Length: "); 
      length = scan.nextDouble(); 
      System.out.print("\nTract 1's Width: "); 
      width = scan.nextDouble(); 
      LandTract plot1 = new LandTract(length ,width); 
      
      System.out.print("Tract 2's Length: "); 
      length = scan.nextDouble(); 
      System.out.print("\nTract 2's Width: "); 
      width = scan.nextDouble();
      LandTract plot2= new LandTract(length ,width); 
      
      System.out.printf(String.format("\nTract 1 Area: %,.1f " + 
         "\nTract 2 Area: %,.2f \n%s \n\ntoStrings" + 
         "\n%s\n%s" ,plot1.getArea() ,plot2.getArea() ,plot1.equals(plot2) 
         ,plot1.toString() ,plot2.toString())); 
   }
} 
 
     
       
        
      
      
      