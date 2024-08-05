package com.assignment;
import java.util.Scanner;
import java.util.Random;

public class WordGuesserGame {
	private static final String[] WORDS = {"joy","python","tiger","computer","earth"};

	public static void main(String[] args) {
		
		Random rd = new Random();
		String randomWord = WORDS[rd.nextInt(WORDS.length)];
		int wordLength = randomWord.length();
		int maxLives = wordLength * 3;
		int lives = maxLives;
		
		char[] blanks = new char[wordLength];
		for(int i=0; i<wordLength; i++) {
			blanks[i] = '_';
		}
		
		boolean gameWon = false;
		Scanner sc = new Scanner(System.in);
		
		
		while(lives > 0 && !gameWon){
			System.out.println("Current word:"+new String(blanks));
			System.out.println("Lives remaining:"+lives);
			System.out.println("Guess a letter:");
			char guess = sc.next().charAt(0);
			
			boolean correctGuess = false;
			
			for(int i=0; i < wordLength; i++) {
				if(randomWord.charAt(i) == guess) {
					blanks[i] = guess;
					correctGuess = true;
				}
			}
			if (!correctGuess) {
				lives--;
			}
			
			gameWon = true;
			
			for (char c : blanks) {
				if (c == '_') {
					gameWon = false;
					break;
				}
			}
		}
		if (gameWon) {
			System.out.println("Congratulations! You guessed the word:"+randomWord);
		}else {
			System.out.println("Game Over! The word was:"+randomWord);
		}
		
	}

}
