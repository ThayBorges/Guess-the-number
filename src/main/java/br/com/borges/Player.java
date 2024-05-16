package br.com.borges;

import java.util.ArrayList;

public abstract class Player {
    protected String name; //representa o nome do jogador
    protected ArrayList<Integer> guesses; //armazena os palpites do jogador.

    public Player(String name) {
        this.name = name;
        this.guesses = new ArrayList<>();
    }

    public abstract int makeGuess(); //Método abstrato makeGuess(), que deve ser implementado pelas classes concretas de jogadores (HumanPlayer e ComputerPlayer). Esse método é responsável por retornar o palpite do jogador.

    public String getName() {
        return name;
    }

    public ArrayList<Integer> getGuesses() {
        return guesses;
    }

    public void addGuess(int newGuess) {
        guesses.add(newGuess); //Recebe o novo palpite como parâmetro e o adiciona à lista guesses.
    }
}
