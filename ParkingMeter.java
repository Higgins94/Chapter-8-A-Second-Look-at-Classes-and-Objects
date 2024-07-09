/*
                                  *Programming Challenge 8*
                  
*/
/**
   The ParkingMeter class holds the amount of time purchased on a parking meter.
*/ 

public class ParkingMeter { 
   
   private int minsPurchased; 
   
   /**
      No-arg Constructor
   */ 
   
   public ParkingMeter() { 
      minsPurchased = 0; 
   } 
   
   /**
      Constructor 
      @perma mins The amount of minutes purcahsed for parking. 
   */ 
   
   public ParkingMeter(int mins) {
      minsPurchased = mins; 
   } 
   
   /**
      Constructor 
      @perma object2 An object of the same class 
   */ 
   
   public ParkingMeter(ParkingMeter object2) { 
      minsPurchased = object2.minsPurchased; 
   } 
   
   /**
      The buyMinutes methods set the minsPurchased field.
      @perma mins The amount of minutes added to the meter.
   */ 
   
   public void buyMinutes(int mins) { 
      minsPurchased = mins; 
   }  
   
   /**
      The getMinutes method 
      @return minsPurchased Number of minutes purchased for parking 
   */ 
   
   public int getMinutes() { 
      return minsPurchased; 
   } 
}  
      