/*
                           *Programming Challenge 11*
      Nothing fancy, pretty simple challenge for second to last of the chapter.
      Using the old Die class from chapter 6 here
*/
/**
   The PlayerPart2 simulates a player of the game First To One.
*/ 
public class PlayerPart2 { 
   
   private final int STARTING_POINTS = 50; 
   private final int DIE_SIDES = 6; 
   private int roll; 
   private int points;
   private Die dice;  
   
   public PlayerPart2() {
      dice = new Die(DIE_SIDES); 
      points = STARTING_POINTS; 
   } 
   
   /**
      The roll method get a random int from dice object
      @return The value of that random int
   */ 
   
   public int roll() { 
      dice.roll(); 
       return dice.getValue(); 
   } 
   
   
   /**
      The setPoints method either adds or subtracts from the player's points
   */ 
   
   public void setPoints() { 
      if (points <= 0)  
         points += dice.getValue(); 
      else
         points -= dice.getValue();  
   } 
   
   /**
      The getPoints method 
      @return points The current total of the player's points 
   */ 
   
   public int getPoints() { 
      return points; 
   } 
} 
   

   
       
   
      
    
   
   
   