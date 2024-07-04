import java.util.Scanner; 
/**
   The AreaOverloadDemo class is a simple program to demonstrate the static methods in AreaOverload class. 
   
*/ 
public class AreaOverloadDemo { 
   public static void main(String[] args) { 
   
      int length ,width ,height ,areaI; 
      double radius;  
      
      Scanner scan = new Scanner(System.in); 
      AreaOverload area = new AreaOverload(); 
      
      System.out.print("Circle Area: Enter Radius: "); 
      radius = scan.nextDouble(); 
      System.out.print(String.format("\nArea: %,.2f \n\nEnter Length: " ,area.getArea(radius))); 
      length = scan.nextInt(); 
      System.out.print("\nEnter Width: "); 
      width = scan.nextInt();  
      System.out.print("\nArea: " + area.getArea(length ,width) +  "\n\nEnter Radius: ");
      radius = scan.nextDouble(); 
      System.out.print("\nEnter Hegiht: "); 
      height = scan.nextInt(); 
      System.out.print(String.format("\nArea: %,.2f" ,area.getArea(radius ,height))); 
   } 
} 
