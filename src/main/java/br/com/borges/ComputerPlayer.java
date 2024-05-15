package br.com.borges;

import java.util.Random;

class ComputerPlayer extends Player {
    private Random random;

    public ComputerPlayer(String name) {
        super(name);
        this.random = new Random();
    }

    @Override
    public int makeGuess() {
        int guess = random.nextInt(100) + 1;
        guesses.add(guess);
        return guess;
    }
}
