package lab7.ch3;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class Player extends Thread {

    private final List choices;
    private final String playerName;
    private String currentChoice;

    public Player(String name) {
        this.choices = Arrays.asList("rock", "paper", "scissors");
        this.playerName = name;
    }

    @Override
    public void run() {
        Random rand = new Random();
        int select = rand.nextInt(3);
        currentChoice = (String) choices.get(select);
    }

    public String getPlayerName() {
        return playerName;
    }

    public String getCurrentChoice() {
        return currentChoice;
    }
}
