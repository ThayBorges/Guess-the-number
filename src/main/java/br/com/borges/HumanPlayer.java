package br.com.borges;
import java.util.Scanner;

public class HumanPlayer extends Player {
    private Scanner scanner;

    public HumanPlayer(String name) {
        super(name);//Chama o construtor da classe Player passando o nome do jogador como argumento, para inicializar a variável name.
        this.scanner = new Scanner(System.in);//inicializa a variavel scanner como uma nova instancia
    }

    @Override
    public int makeGuess() {
        System.out.print("Digite seu palpite: ");
        int guess = scanner.nextInt();
        guesses.add(guess);
        return guess;
    }

}
