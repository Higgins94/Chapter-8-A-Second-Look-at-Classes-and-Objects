import java.util.Scanner; 
/*
                            *Programming Challenge 12*
        Simple program to play a game of guess the side of the coin then declare a winner. 
        Using Coin class from Chapter 6. On to Chapter 9...
*/ 
/**
   The HeadsOrTailGame simualtes a game of guessing the side of a nickel 
*/ 
public class HeadsOrTailGame { 
   public static void main(String[] args) { 
      
      String player1 ,player2; 
      int player1Wins = 0 ,player2Wins = 0 ,guess1 ,guess2, rounds;
      Scanner scan = new Scanner(System.in); 
      Coin nickel = new Coin(); 
      
      System.out.print("Player One's Name: "); 
      player1 = scan.nextLine(); 
      System.out.print("\nPlayer Two's Name: "); 
      player2 = scan.nextLine();
      System.out.print("\nRounds: "); 
      rounds = scan.nextInt(); 
      
      for (int r = 1; r <= rounds; r++) { 
      
         System.out.printf("\n\nRound %d\n%s's Wins: %d\n\n\t1. Heads\n\t2. Tails\n\n(1 or 2): " 
            ,r ,player1 ,player1Wins); 
         guess1 = scan.nextInt(); 
         
        while (guess1 != 1 && guess1 != 2) {
            System.out.print("\nERROR\n(1 or 2): ");
            guess1 = scan.nextInt(); 
        } 
            
         System.out.printf("\n%s's Wins: %d\n\n\t1. Heads\n\t2. Tails\n\n(1 or 2): " ,player2 ,player2Wins); 
         guess2 = scan.nextInt();
         
         while (guess2 != 1 && guess2 != 2) {
            System.out.print("\nERROR\n(1 or 2): ");
            guess2 = scan.nextInt(); 
         } 
          
         nickel.toss();
         System.out.print("\n\nFlipping...");
          
         if (nickel.getSideUp() == 1) 
            System.out.print("Heads!"); 
         else 
            System.out.print("Tails!"); 
             
         if(guess1 == nickel.getSideUp()) 
            player1Wins++; 
            
         if (guess2 == nickel.getSideUp()) 
            player2Wins++;
      }
      
      if (player1Wins < player2Wins) 
         System.out.printf("\n%s WINS" ,player1); 
      else if (player2Wins < player1Wins) 
          System.out.printf("\n%s WINS" ,player2);
      else 
         System.out.print("\nTie Game"); 
   }
} 
            
         
         
      
      
      
      
      