import java.util.Scanner; 
/*
                              Programming challenge 9* 
                          Basic program to demostrate Geometry class

*/
/**
   The GeomtryDemo class displays the area of either a circle, rectangle, or triangle
*/ 

public class GeometryDemo { 
   public static void main(String[] args) { 
   
   double radius = 0 ,base = 0 ,height = 0; 
   int length = 0 ,width = 0 ,menu; 
   
   Scanner scan = new Scanner(System.in);
   Geometry math = new Geometry();  
   
   System.out.print("\nGeometry Calculator\n1. Circle\n2.Rectangle\n3.Triangle\n4.Quit" + 
                     "\nEnter your choice (1-4): "); 
   menu = scan.nextInt(); 
   
      if (menu == 1) {
         math.area(radius);  
         while (math.area(radius) == 0) { 
            System.out.print("\nRadius: "); 
            radius = scan.nextDouble(); 
            math.area(radius); 
         }   
      System.out.printf("\nArea: %,.1f" ,math.area(radius));
      }
          
      if (menu == 2) {
         math.area(length ,width);  
         while (math.area(length ,width) == 0) {
            System.out.print("\nLength: "); 
            length = scan.nextInt(); 
            System.out.print("\nWidth: "); 
            width = scan.nextInt(); 
            math.area(length ,width); 
         }
         System.out.print("\nArea: " + math.area(length ,width)); 
      } 
      
      if (menu == 3) { 
         math.area(base ,height); 
         while (math.area(base ,height) == 0) {
            System.out.print("\nBase: "); 
            base = scan.nextDouble(); 
            System.out.print("\nHeight: "); 
            height = scan.nextDouble(); 
            math.area(base ,height); 
         } 
         System.out.printf("\nArea: %,.1f" , math.area(base ,height));         
      } 
      
      System.out.print("\nGoodbye."); 
   }
}      
         
   
   
   