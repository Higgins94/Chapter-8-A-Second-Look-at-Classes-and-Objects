/*
                                             *Programming Challenge 10*
                                              Main method in Car2 class
*/
/**
   The Odometer class simulates a car odometer.
*/
public class Odometer { 
   
   private final int MAX_MILES = 999999; 
   private final int MILES_PER_GALLON = 24; 
   private double milage;
   private FuelGauge gas;
   private int counter;
   
   /**
      Constructor no args
   */ 
   
   public Odometer() { 
      milage = 0; 
   } 
   
   /**
      Constructor 
      @perma object2 A FuelGauge object
      @perma startingMilage The miles to be added directly to milage field; 
   */ 
   
   public Odometer(FuelGauge object2 ,double startingMilage) { 
      gas = new FuelGauge(object2);  
      setMeter(startingMilage); //unnecessary method call

   } 
    
   /**
      The setMeter methods sets miles for milage field.
      @perma miles The value of miles.
   */ 
   
   public void setMeter(double miles) { 
      milage = miles; 
   } 
   
   /**
      The getGas method returns the class's FuelGuage copy object's gallonFuel field.
      @return The value for the gallonFuel field.
   */ 
      
   public double getGas() { 
      return gas.getGallonFuel(); 
   } 
   
   /**
      The fuel method calls the gas FuelGuage object to call gasHerUp method. 
   */ 
   
   public void fuel() { 
      gas.gasHerUp(); 
   
   } 
   
   /**
      The getMilage method
      @return milage The field representing the number of miles on an odometer. 
   */ 
   
   public double getMilage() { 
      return milage; 
   } 
   
   /**
      The distance method simulates a car traveling through altering the milage field and the gas object's gallonFuel field
   */ 
   
   public void travel(double distance) { 
      
      counter = 0;
       
      for (double mile = 1; mile <= distance; mile++) { 
         milage++; 
         counter++;
         System.out.print("\nMile #" + mile + "\nOdometer: " + milage + " miles\nGauge: " + getGas() + " gallons"); 
         if (milage > MAX_MILES) 
            milage = 0; 
         if (counter == MILES_PER_GALLON) {  
            gas.engineRunning(); 
            counter = 0;
            if (getGas() <= 0) { 
               mile = distance + 1; 
               System.out.print("\nOUT OF FUEL\nGuage: 0.0 gallons"); 
            }
         }  
      }
       
   } 
} 
      
      