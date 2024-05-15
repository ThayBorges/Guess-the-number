package br.com.borges;
import java.util.Scanner;

public class HumanPlayer extends Player {
    private Scanner scanner;

    public HumanPlayer(String name) {
        super(name);
        this.scanner = new Scanner(System.in);
    }

    @Override
    public int makeGuess() {
        System.out.print("Digite seu palpite: ");
        int guess = scanner.nextInt();
        guesses.add(guess);
        return guess;
    }

}
