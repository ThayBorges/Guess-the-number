package br.com.borges;

import java.util.Random;

class ComputerPlayer extends Player {
    private Random random;

    public ComputerPlayer(String name) {
        super(name);
        this.random = new Random();
    }

    @Override //Indica que o método makeGuess() sobrescreve o método abstrato da classe Player
    public int makeGuess() {
        int guess = random.nextInt(101);
        guesses.add(guess);
        return guess; //retorna o palpite gerado pelo computador
    }
}
