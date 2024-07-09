/*
                                 *Programming Challenge 8*
                          Classes Used: ParkedCar ,ParkingMeter
*/ 
/**
   The PoliceOfficer class holds information relating to a police officer.
*/ 
public class PoliceOfficer { 

   private String name; 
   private String badge;
   private ParkedCar car; 
   private ParkingMeter meter; 
   private int timeExpired;   
   
   /**
      Constructor 
      @perma name The name of the officer.
      @perma badge Identification information.
   */ 
   
   public PoliceOfficer(String name, String badge) { 
      this.name = name; 
      this.badge = badge; 
      timeExpired = 0;
   } 
   
   /**
      Constructor 
      @perma officerObj2 A PoliceOfficer object.
   */ 
   
   public PoliceOfficer(PoliceOfficer officerObj2) { 
   
      name = officerObj2.name; 
      badge = officerObj2.badge;
      timeExpired = 0; 
   }  
   
   /**
      getName method 
      @return name The name of the officer. 
   */
   
   public String getName() { 
      return name; 
   } 
   
   /**
      getBadge method 
      @return badge Identification information. 
   */ 
   
   public String getBadge() { 
      return badge; 
   } 
   
   /**
      The getTime method calculates the difference between total time the car has 
      been parked and the amount of time purchased from the meter.
      @perma meterObj2 A ParkingMeter object
      @perma carObj2 A ParkedCar method 
      @return The difference between the two fields.
   */
   
   public int getTime(ParkingMeter meterObj2 ,ParkedCar carObj2) { 
     
      meter = new ParkingMeter(meterObj2); 
      car = new ParkedCar(carObj2); 
       
      return meter.getMinutes() - car.getMinutes(); 
      
       
   }     
} 
