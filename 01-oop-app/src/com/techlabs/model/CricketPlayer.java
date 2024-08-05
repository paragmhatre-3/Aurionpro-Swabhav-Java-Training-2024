package com.techlabs.model;

public class CricketPlayer {
	private int playerId;
	private int numberOfMatches;
	private int runs;
	private int wickets;
	
	public CricketPlayer() {
		
	}
	
	public CricketPlayer(int playerId, int numberOfMatches, int runs, int wickets) {
		this.playerId = playerId;
		this.numberOfMatches = numberOfMatches;
		this.runs = runs;
		this.wickets = wickets;
	}
	
	//Player ID
		public int getPlayerId() {
			return playerId;
		}
		public void setBookId(int playerId) {
			this.playerId = playerId;
		}
		//No.Of Matches
		public int getNumberOfMatches() {
			return numberOfMatches;
		}
		public void setNumberOfMatches(int numberOfMatches) {
			this.numberOfMatches = numberOfMatches;
		}
		//runs
		public int getRuns() {
			return runs;
		}
		public void setRuns(int runs) {
			this.runs = runs;
		}
		//wickets
		public int getWickets() {
			return wickets;
		}
		public void setWickets(int wickets) {
			this.wickets = wickets;
		}
		
		public int getAverage() {
			return this.runs/this.numberOfMatches;
		}
		
		@Override
		public String toString() {
			return "CricketPlayer [playerId=" + playerId + ", numberOfMatches=" + numberOfMatches + ", runs=" + runs
					+ ", wickets=" + wickets + ", getPlayerId()=" + getPlayerId() + ", getNumberOfMatches()="
					+ getNumberOfMatches() + ", getRuns()=" + getRuns() + ", getWickets()=" + getWickets()
					+ ", getAverage()=" + getAverage() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
					+ ", toString()=" + super.toString() + "]";
		}

		public void display() {
			System.out.println("Player ID"+getPlayerId());
			System.out.println("Number of matches"+getNumberOfMatches());
			System.out.println("Runs"+getRuns());
			System.out.println("Wickets"+getWickets());
			System.out.println("Average:");
			getAverage();
		}

}
