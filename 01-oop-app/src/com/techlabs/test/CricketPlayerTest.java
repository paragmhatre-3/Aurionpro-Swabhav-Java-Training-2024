package com.techlabs.test;
import java.util.Scanner;
import com.techlabs.model.CricketPlayer;
public class CricketPlayerTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		CricketPlayer players[] = new CricketPlayer[2];
		
		
		for (int i = 0; i < players.length; i++) {
		System.out.println("Enter Player ID:");
		int playerId = sc.nextInt();
		System.out.println("Enter Number Of Matches:");
		int numberOfMatches = sc.nextInt();
		System.out.println("Enter Runs");
		int runs = sc.nextInt();
		System.out.println("Enter Wickets:");
		int wickets = sc.nextInt();
		players[i] = new CricketPlayer(playerId,numberOfMatches,runs,wickets);
		
		}
		
		for (int i = 0; i < players.length; i++) {
			System.out.println("Player ID:"+players[i].getPlayerId());
			System.out.println("Number Of Matches:"+players[i].getNumberOfMatches());
			System.out.println("Runs:"+players[i].getRuns());
			System.out.println("Wickets:"+players[i].getWickets());
			System.out.println("Average:" + players[i].getAverage());
			
			}
		
		
		CricketPlayer maxAveragePlayer = getMaximumAveragePlayer(players);
        if (maxAveragePlayer != null) {
            System.out.println("Player with maximum average:");
            System.out.println("Player Id of Player with maximum average:  "+maxAveragePlayer.getPlayerId());
            System.out.println("Runs of Player with maximum average:  "+maxAveragePlayer.getRuns());
            System.out.println("Average of Player with maximum average:  "+maxAveragePlayer.getAverage());

        } else {
            System.out.println("No accounts available.");
        }
        
        displayPlayers(players);
        
	}
	
	public static CricketPlayer getMaximumAveragePlayer(CricketPlayer[] players) {
        if (players.length == 0) {
            return null;
        }

        CricketPlayer maxAveragePlayer = players[0];
        for (int i = 0; i< players.length ; i++) {
            if (players[i].getAverage() > maxAveragePlayer.getAverage()) {
                maxAveragePlayer = players[i];
            }
        }
        return maxAveragePlayer;
    }
	
	public static void displayPlayers(CricketPlayer[] players) {
		

		CricketPlayer temp;
        for (int i = 0; i< players.length ; i++) {
        	for(int j = i+1; j< players.length; j++) {
            if (players[j].getAverage() < players[i].getAverage()) {
                temp = players[i];
                players[i] = players[j];
                players[j] = temp;
                
            }
            
        	}
        }
        for (int i = 0; i < players.length; i++) {
			System.out.println("Player ID:"+players[i].getPlayerId());
			System.out.println("Number Of Matches:"+players[i].getNumberOfMatches());
			System.out.println("Runs:"+players[i].getRuns());
			System.out.println("Wickets:"+players[i].getWickets());
			System.out.println("Average:" + players[i].getAverage());
			
			}
        
	}

}
