
package snake.puzzale;

import java.util.HashMap;

class PlayerDetails {
	private int totalDiceNumber;
	private int noOfTimesDiceRole;

	public int getTotalDiceNumber() {
		return totalDiceNumber;
	}

	public void setTotalDiceNumber(int totalDiceNumber) {
		this.totalDiceNumber = totalDiceNumber;
	}

	public int getNoOfTimesDiceRoles() {
		return noOfTimesDiceRole;
	}

	public void setNoOfTimesDiceRoles(int noOfTimesDiceRoles) {
		this.noOfTimesDiceRole = noOfTimesDiceRoles;
	}

	public void setNoOfTimesDiceRole(int noOfTimesDiceRole) {
		this.noOfTimesDiceRole = noOfTimesDiceRole;
	}
}

class PlayGame {
	private HashMap<String, PlayerDetails> Players = new HashMap<>();
	private String CurrentPlayer = "A";

	public void startSnakeAndLaddergame() {

//use case 1
		PlayerDetails playerDetails = new PlayerDetails();
		playerDetails.setTotalDiceNumber(0);
		playerDetails.setNoOfTimesDiceRoles(0);
		Players.put("A", playerDetails);
		Players.put("B", playerDetails);
		System.out.println("Player A, Dice rolled number is : 0, totalnumbers gain is: " + 0);
		System.out.println("Player B, Dice rolled number is : 0, totalnumbers gain is: " + 0);

// use case 2
// use case 3
		while (Players.get("A").getTotalDiceNumber() < 100 || Players.get("B").getTotalDiceNumber() < 100) {
			checkOptions(CurrentPlayer, rollDice());
		}

//use case 4
//use case 5
		while (Players.get("A").getTotalDiceNumber() < 100 || Players.get("B").getTotalDiceNumber() < 100)
			if (Players.get("A").getTotalDiceNumber() >= 100) {
				System.out.println("winner is player A, Dice rolled no is" + Players.get("A").getNoOfTimesDiceRoles()
						+ "total number gain is: " + Players.get("A").getTotalDiceNumber());
			} else {
				System.out.println("winner is player B, Dice rolled no is" + Players.get("B").getNoOfTimesDiceRoles()
						+ "total number gain is: " + Players.get("B").getTotalDiceNumber());
			}
	}

	private void checkOptions(String currentPlayer, int diceNumber) {
		int min = 1;
		int max = 3;
		int options = (int) (Math.random() * (max - min + 1) + min);
		PlayerDetails details = Players.get(currentPlayer);
		details.setNoOfTimesDiceRoles(details.getNoOfTimesDiceRoles() + 1);
		switch (options) {
		case 1: // no play
			if (currentPlayer.contains("A")) {
				currentPlayer = "B";
			} else {
				currentPlayer = "A";
			}
			break;
		case 2: // ladder
			details.setTotalDiceNumber(details.getTotalDiceNumber() + diceNumber);
			Players.put(currentPlayer, details);
		case 3: // snake
			if (Players.get(currentPlayer).getTotalDiceNumber() <= diceNumber) {
				details.setTotalDiceNumber(0);
				Players.put(currentPlayer, details);
			} else {
				details.setTotalDiceNumber(details.getTotalDiceNumber() - diceNumber);
				Players.put(currentPlayer, details);
			}
			if (currentPlayer.contains("A")) {
				currentPlayer = "B";
			} else {
				currentPlayer = "A";
			}
			break;
		}
	}

	private int rollDice() {
		int min = 1;
		int max = 6;
		return (int) (Math.random() * (max - min + 1) + min);
	}
}

public class SnakePuzzle {
	public static void main(String[] args) {
		PlayGame game = new PlayGame();
		game.startSnakeAndLaddergame();
	}
}