package com.techlabs.test;
import java.util.Random;
import java.util.Scanner;

class Game{
	int totalScore = 0;
	int turnScore = 0;
	int turnCount = 0;
}
public class PigGameTest {
	    private static final int WINNING_SCORE = 20;

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        Random random = new Random();
	        Game game = new Game();

	        gameLoop(game,random,scanner);

	        System.out.println("You finished in " + gameLoop(game,random,scanner) + " turns!");
	        System.out.println("Game over!");
	    }
	    
	    
	    
	    private static int gameLoop(Game game,Random random, Scanner scanner) {
	    	game.totalScore = 0;
	        game.turnCount = 0;

	        while (game.totalScore < WINNING_SCORE) {
	            game.turnCount++;
	            System.out.println("TURN " + game.turnCount);
	            game.turnScore = 0;
	            boolean turnOver = false;

	            turnLoop(game,random,scanner,turnOver);
	            System.out.println();
	        }
	        
	        return game.turnCount;
			
		}
	    
	    private static void checker(Game game) {
	    	if(game.totalScore >= 20) {
	    		System.out.println("You won");
	    	}
	    }

		private static int turnLoop(Game game,Random random,Scanner scanner,boolean turnOver) {
	    	while (!turnOver) {
                System.out.print("Roll or hold? (r/h): ");
                char choice = scanner.next().charAt(0);
                //if (!(choice == 'r' && choice == 'h'))
                	//System.out.println("Enter valid choice!");
                if (choice == 'r')
                	rollDice(game,random,turnOver);
                if(choice == 'h')
                	holdDice(game,turnOver);
            }
	    	return game.totalScore;
			
		}

		private static boolean holdDice(Game game, boolean turnOver) {
	    	 game.totalScore += game.turnScore;
             System.out.println("Score for turn: " + game.turnScore);
             System.out.println("Total score: " + game.totalScore);
             return turnOver = true;
			
		}

		private static int rollDice(Game game, Random random, boolean turnOver) {
	    	int die = random.nextInt(6) + 1;
            System.out.println("Die: " + die);
            if (die == 1) {
                System.out.println("Turn over. No score.");
                game.turnScore = 0;
                turnOver = true;
            }
            return game.turnScore += die;
			
		}

		    
	
}
