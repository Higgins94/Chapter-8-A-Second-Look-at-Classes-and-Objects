import java.util.Scanner; 
/*
                               *Programming Challenge 11*
                       Program to demostrate PlayerPart2 class
*/ 
/**
   The FirstToOneGame class simulates a game of the same name as class
*/ 
public class FirstToOneGame { 
   public static void main(String[] args) { 
      
      String player1 ,player2;
      boolean gameover = false; 
      
      Scanner scan = new Scanner(System.in); 
       
      System.out.print("Player One Name: ");
      player1 = scan.nextLine();
      PlayerPart2 playerOne = new PlayerPart2(); 
      
      System.out.print("\nPlayer Two Name: "); 
      player2 = scan.nextLine(); 
      PlayerPart2 playerTwo = new PlayerPart2();
      
      while (gameover != true) { 
         System.out.printf(String.format("\n%s's Turn\nPoints: %d " + 
            "\nRolling... %d" ,player1 ,playerOne.getPoints() ,playerOne.roll()));
         playerOne.setPoints(); 
         System.out.print("\n----------------\n" + player1 + " ends the turn with " + playerOne.getPoints() + 
                          " points\n_______________" );
         if (playerOne.getPoints() == 1 && playerTwo.getPoints() != -1) {  
            System.out.print("\n\n" + player1 + " WINS"); 
            gameover = true;
            break;
         }   
                            
         System.out.printf(String.format("\n%s's Turn\nPoints: %d " + 
            "\nRolling... %d" ,player2 ,playerTwo.getPoints() ,playerTwo.roll()));
         playerTwo.setPoints();
         System.out.print("\n----------------\n" + player2 + " ends the turn with " + playerTwo.getPoints() + 
                          " points\n_______________" );
         if (playerTwo.getPoints() == 1 && playerTwo.getPoints() != -1) {  
            System.out.print("\n\n" + player2 + " WINS");
            gameover = true;
            break;
         }  
      }
   }
}    
          
          
        
      
        
      