package br.com.borges;

import java.util.ArrayList;

public abstract class Player {
    protected String name;
    protected ArrayList<Integer> guesses;

    public Player(String name) {
        this.name = name;
        this.guesses = new ArrayList<>();
    }

    public abstract int makeGuess();

    public String getName() {
        return name;
    }

    public ArrayList<Integer> getGuesses() {
        return guesses;
    }

    public void addGuess(int newGuess) {
        guesses.add(newGuess);
    }
}
