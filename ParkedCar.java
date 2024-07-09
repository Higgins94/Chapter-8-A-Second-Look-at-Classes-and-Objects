/*
                                 *Programming Challenge 8*
*/
/**
   The ParkedCar method holds information pertaining to a parked car.
*/ 
public class ParkedCar { 

   private String make;
   private String model; 
   private String color;
   private String licensePlate;
   private int minsParked;
   
   /**
      No-arg constructor
   */ 
   
   public ParkedCar() { 
      make = "Not Set";
      model = "Not Set";
      color = "Not Set";
      licensePlate = "Not Set";
      minsParked = 0;  
   } 
   
   /**
      Constructor 
      @perma make The manufacturer of the car.
      @perma model The style of car. 
      @perma color The color of the car.
      @perma licensePlate The license plate of the car.
      @perma minsParked The total amount of time the car has been parked.
   */
   
   public ParkedCar(String make ,String model ,String color ,String licensePlate ,int minsParked) { 
      
      this.make = make; 
      this.model = model; 
      this.color = color; 
      this.licensePlate = licensePlate; 
      this.minsParked = minsParked; 
   } 
   
   /**
      Copy constructor for object of same class.
   */ 
   
   public ParkedCar(ParkedCar object2) { 
      make = object2.make; 
      model = object2.model; 
      color = object2.color; 
      licensePlate = object2.licensePlate; 
      minsParked = object2.minsParked; 
   } 
   
   /**
      The setMake method sets the make field. 
      @perma make The The manufacturer of the car. 
   */ 
   public void setMake(String make) { 
      this.make = make; 
   } 
   
   /**
      getMake method returns make 
      @make The The manufacturer of the car
   */ 
   
   public String getMake() { 
      return make; 
   } 
   
   /**
      The setModel method sets the model field 
      @perma model The style of the car
   */ 
   
   public void setModel(String model) { 
      this.model = model; 
   } 
   
   /**
      getModel method 
      @return model The style of the car.
   */
   
   public String getModel() { 
      return model; 
   } 
   
   /**
      setColor method sets color field.
      @perma color The color of the car.
   */ 
   
   public void setColor(String color) { 
      this.color = color; 
   } 
   
   /**
      getColor method
      @return color The color of the car.
   */ 
   
   public String getColor() { 
      return color; 
   } 
   
   /**
      The setLicensePlate method sets the licensePlate field. 
      @perma licensePlate The license plate of the car.
   */ 
   
   public void setLicensePlate(String licensePlate) { 
      this.licensePlate = licensePlate; 
   } 
   
   /**
      getLicensePlate method
      @return The license plate of the car.
   */ 
   
   public String getLicensePlate() { 
      return licensePlate; 
   } 
   
   /**
      The setMinutes method sets the minutes field
      @perma minutes The total amount of time in minutes the car has been parked.  
   */ 
   
   public void setMinutes(int minutes) { 
      minsParked = minutes; 
   }
   
   /**
      The getMinutes method 
      @return minsParked The total amount of time in minutes the car has been parked.
   */ 
   
   public int getMinutes() { 
      return minsParked; 
   } 
   
   /**
      toString method
      @return A String denoting the value of each field.
   */ 
   
   public String toString() { 
      String str = String.format("\nMake: %s\nModel: %s\nColor: %s\nLicense " + 
         "Plate: %s\nMinutes Parked: %d" ,make ,model ,color ,licensePlate ,minsParked); 
      return str; 
   } 
} 
 
   