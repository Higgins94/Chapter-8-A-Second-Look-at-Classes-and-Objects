import java.util.Scanner; 
/*
                                       *Programming Challenge 10*
  More aggregation practice. I had a little trouble with getting the right reference variable; I Was confusing the object gas2 with the deep cut 
        copy in the meter object, because they were name the same. Learned to definitely use the this. variable or other names entirely.  
*/
/**
   The Car2 class simulates travel and fuel for a car, using an Odometer object 
   and a FuelGauge object
*/
public class Car2 { 
   public static void main(String[] args) { 
      
      double odometerStart ,startingGas ,distance ,gallons; 
      Scanner scan = new Scanner(System.in); 
      
      System.out.print("\nCurrent milage on car's odometer: "); 
      odometerStart = scan.nextDouble(); 
      if (odometerStart < 0 || odometerStart > 999999) { 
         System.out.print("\nCurrent milage on car's odometer: "); 
         odometerStart = scan.nextDouble(); 
      }  
      System.out.print("\nCurrent Fuel Level (Gallons): "); 
      startingGas = scan.nextDouble();
      while (startingGas < 1 || startingGas > 15) { 
         System.out.print("\nCurrent Fuel Level (Gallons): "); 
         startingGas = scan.nextDouble();
      }    
      FuelGauge gas1 = new FuelGauge(startingGas); 
      Odometer meter = new Odometer(gas1 ,odometerStart);
      
      
      while (true) { 
         System.out.print("\nEnter Trip Distance (Miles): ");
         distance = scan.nextDouble(); 
         meter.travel(distance); 
     
         System.out.print("\n----------\nGas Stop\nGallons of Fuel: "); 
         gallons = scan.nextDouble(); 
         
         while (gallons < 0 || gallons > 15) { 
            System.out.print("\nGallons of Fuel: "); 
            gallons = scan.nextDouble();
         }
         
         for (double i = 0; i < gallons; i++) { 
            meter.fuel(); 
            if (meter.getGas() <= 0) { 
               System.out.print("\nTANK FULL");
               i = gallons + 1; 
            }         
         }
         System.out.print("\nCurrent Fuel Level : " + meter.getGas());  
      } 
   } 
}    
         
         
               
      
      
