import java.util.Scanner; 
/*
                                     *Programming Challenge 8*
     Simple program to demonstrate the ParkedCar, ParkingMeter, ParkingTicket ,and PoliceOfficer classes
*/ 
/**
   The ParkingTicketDemo class makes several objects
*/ 
public class ParkingTicketDemo  {
   public static void main(String[] args) { 
      
      String name ,badge ,make ,model ,color ,licensePlate;
      int minsParked ,meterTime, result; 
      Scanner scan = new Scanner(System.in); 
      
      System.out.print("Officer's Name: ");
      name = scan.nextLine(); 
      System.out.print("\nBadge: ");
      badge = scan.nextLine(); 
      
      PoliceOfficer officer = new PoliceOfficer(name ,badge);  
      
      System.out.print("\n\nCar Make: "); 
      make = scan.nextLine(); 
      System.out.print("\nModel: ");
      model = scan.nextLine(); 
      System.out.print("\nColor: "); 
      color = scan.nextLine(); 
      System.out.print("\nLicense Plate: "); 
      licensePlate = scan.nextLine(); 
      System.out.print("\nTotal Minutes Parked: "); 
      minsParked = scan.nextInt(); 
      
      ParkedCar car = new ParkedCar(make ,model ,color ,licensePlate ,minsParked); 
  
      System.out.print("\nTime Purchased On Meter: "); 
      meterTime = scan.nextInt(); 
      ParkingMeter meter = new ParkingMeter(meterTime); 
      
      result = officer.getTime(meter ,car);  
      
      if (result < 0) { 
         ParkingTicket ticket = new ParkingTicket(car ,officer); 
         System.out.print(ticket.issueTicket(result)); 
      } else 
         System.out.print("\nNo Parking Ticket"); 
     
     
      
   }
} 