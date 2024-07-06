/*
               *Programming Challenge 5*
   More practice with objects in classes. Decided to implement a switch because I have not 
   done a switch statement in a while; Plus, I went into a wormhole about enum datatypes and setting a variable as an
   ordinal value all while the challenge did to dictate to use enum types  
*/
/**
   The Month class relates a numerical representation of a month in a year to
   the month's name. 
*/ 
public class Month { 

   private int monthNumber;
   private String monthString; 
   private final int MONTHDEFAULT = 1; 
   
   /**
   Constructor, no arg
   */
      
   public Month() { 
      monthNumber = MONTHDEFAULT;
      monthString = "";    
   } 
   
   /**
   Constructor 
   @perma monthNumber the numerical representation of a month.
   */ 
   
   public Month(int monthNumber) { 
      
      if (monthNumber < MONTHDEFAULT || monthNumber > 12) 
         monthNumber = MONTHDEFAULT; 
      else 
         this.monthNumber = monthNumber; 
         
      monthString = getMonthName(monthNumber);    
   } 
   
   /**
      Constructor 
      @monthName The name of a month of the year.
   */ 
   
   public Month(String monthName) { 
      
      switch(monthName) { 
         case "January": 
            monthNumber = MONTHDEFAULT; 
            break;
         case "Febuary": 
            monthNumber = 2; 
            break;
         case "March":
            monthNumber = 3; 
            break;
         case "April": 
            monthNumber = 4; 
            break; 
         case "May":
            monthNumber = 5; 
            break;
         case "June": 
            monthNumber = 6; 
            break;
         case "July": 
            monthNumber = 7; 
            break;
         case "August": 
            monthNumber = 8;  
            break;
         case "September": 
            monthNumber = 9; 
            break;
         case "October": 
            monthNumber = 10; 
            break;
         case "November":    
            monthNumber = 11; 
            break;
         case "December": 
            monthNumber = 12; 
            break;
      }   
   }          
   
   /**
      The setMonthNumber method gives a value to the monthNumber field.
      @perma monthNumber the numerical representation of a month.
   */ 
   
   public void setMonthNumber(int monthNumber) { 
      
       
      if (monthNumber < MONTHDEFAULT || monthNumber > 12) 
         monthNumber = MONTHDEFAULT; 
      else 
         this.monthNumber = monthNumber;  
   } 
   
   /**
      The getMonth method returns monthNumber field.  
      @return monthNumber The the numerical representation of a month.
   */ 
   
   public int getMonth() { 
      return monthNumber; 
   } 
   
   /**
      The getMonthName method sets nd returns the monthString given monthNumber.
      return The name of the month that corresponds with monthNumber. 
   */ 
   
   public String getMonthName() { 
      
      switch (monthNumber) { 
         case 1: 
         monthString = "January";
         return monthString; 
         case 2: 
         monthString = "Febuary";
         return monthString;
         case 3: 
         monthString = "March";
         return monthString;
         case 4: 
         monthString = "April";
         return monthString;
         case 5: 
         monthString = "May";
         return monthString;
         case 6: 
         monthString = "June";
         return monthString;
         case 7: 
         monthString = "July";
         return monthString;
         case 8: 
         monthString = "August";
         return monthString;
         case 9: 
         monthString = "September";
         return monthString;
         case 10: 
         monthString = "October";
         return monthString;
         case 11: 
         monthString = "Novemeber";
         return monthString;
         case 12: 
         monthString = "December";
         return monthString;
         default: 
            monthString = "January"; 
            return monthString; 
      }
   }
 
   
   /**
      toString method
      @return getMonthName method
   */ 
   
   public String toString() { 
     return getMonthName(); 
   } 
   
   /**
      The equals method comapres the monthNumber and monthString fields to that of
      another Month object to see if equal.
      @perma object2 The Month object.
      @return matching The boolean value for the state of being equal. 
   */ 
   
   public boolean equals(Month object2) { 
      
      boolean matching = false;
      
      if (monthString.equals(object2.monthString) && 
         monthNumber == object2.monthNumber) { 
         matching = true; 
         return matching; 
      } else 
         return matching; 
   }
   
   /**
      The greaterThan method compares the monthnumber field to that of another Month object.
      @perma object2 The other Month object.
      @return matching The boolean value for the state of object2's fields being of higher value.
   */ 
   
   public boolean greaterThan(Month object2) { 
      boolean greater = false; 
      
      if (monthNumber < object2.monthNumber) { 
         greater = true; 
         return greater; 
      } else 
         return greater; 
   } 
   
   /**
   `The lessThan method compares the monthNumber field to that of another Month object. 
    @perma The other Month object. 
    @return lesser The boolean value for the state of object2's field being of lesser value. 
   */ 
   
   public boolean lessThan(Month object2) {    
   
      boolean lesser = false; 
      
      if (monthNumber > object2.monthNumber) { 
         lesser = true; 
         return lesser; 
      } else 
         return lesser; 
   } 
   
}
      
   
     
   
    