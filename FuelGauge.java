/*
                           *Programming Challenge 10* 
                           Main method in Car2 class
                     
*/
/**
   The FuelGuage class simulates a fuel guage.
*/ 
public class FuelGauge { 

   private double gallonFuel;
   private final int MAX_TANK = 15; 
   
   /**
      Constrcutor no-arg why? because why not.
   */
   
   public FuelGauge() { 
      gallonFuel = 0; 
   } 
   
   /** 
      Constrctor 
      @startingGas The number of gallons to be directly added to gallonFuel field. 
   */ 
   
   public FuelGauge(double startingGas) { 
      gallonFuel = startingGas; 
   } 
   
   /**
      Constrcutor 
      @perma object2 A FuelGauge object. 
   */
   
   public FuelGauge(FuelGauge object2) { 
      gallonFuel = object2.getGallonFuel(); 
   } 
   
   /**
      The getGallonFuel method
      @return gallonFuel Field representing gallons of gas in a car.
   */
   
   public double getGallonFuel() { 
      return gallonFuel;
   } 
   
   /**
      The gasHerUp method increments the gallonFuel field by one. 
   */
   
   public void gasHerUp() { 
         gallonFuel++;  
   } 
   
   /**
      The engineRunning method decreases the gallonFuel field by one. 
      @return gallonFuel The field representing the amount of gas in a car
   */ 
   
   public double engineRunning() { 
         gallonFuel--; 
         return gallonFuel; 
          
   }
}   
 
       
   
   

   