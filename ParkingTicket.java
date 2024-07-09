/*
                                   *Programming Challenge 8*
                              Classes Used: PoliceOfficer ,ParkedCar
           Working with more objects inside of other classes. 4 classes total and a program for demo.  

*/
/**
   The ParkingTicket class calculates and displays a parking ticket 
*/ 
public class ParkingTicket { 
   
   private final int FINE_INCREMENT = 60; 
   private final int BASE_FINE = 25;
   private final int PER_HOUR_FINE = 10; 
   private int fine;
   private ParkedCar car; 
   private PoliceOfficer officer; 
    
   
   /**
      Constructor 
      @perma carObj2 A ParkedCar object
      @perma officerObj2 A PoliceOfficer object 
   */ 
   
   public ParkingTicket(ParkedCar carObj2 ,PoliceOfficer officerObj2) { 
      
      car = new ParkedCar(carObj2); 
      officer = new PoliceOfficer(officerObj2); 
      
   }
   
   /**
      The issueTicket class calculates the fine amount and displays a parking ticket
      @perma mins The number of minutes over what was purchased from the meter 
   */ 
   
   public String issueTicket(int mins){ 
      
      fine = 0;
      int illegalParkTime;
      illegalParkTime = mins;
      if (illegalParkTime < 0) { 
         fine += BASE_FINE;
         illegalParkTime += FINE_INCREMENT; 
      } 
         
      for (int time = illegalParkTime; time < 0; time += FINE_INCREMENT) { 
         fine += PER_HOUR_FINE; 
      }
      
      String str = "\nPARKING VIOLATION TICKET" + "\nExpired Time: " + (mins * -1) + " minutes\nFine: $" + fine +
         "\n--------------------\nCar Information" + car.toString() +
             "\n\n------------------\nOfficer Name: " + officer.getName() + "\nBadge: " + officer.getBadge();  
         return str;  
      
   }  
   
} 
          
   