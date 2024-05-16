package br.com.borges;
import java.util.Random;
import java.util.Scanner;

public class GuessTheNumberGame {
    private static final Random random = new Random();
    static int targetNumber; //Como é estática, todos os objetos da classe compartilham o mesmo valor de targetNumber.

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o seu nome: ");
        String playerName = scanner.nextLine();

        startNewGame(); //Chama o método startNewGame() para iniciar um novo jogo.
        Player player1 = new HumanPlayer(playerName); //cria uma instancia da classe HumanPlayer
        Player player2 = new ComputerPlayer("Computador"); //cria ums instancia da classe ComputerPlayer

        while (true) { //cria um loop infinito
            System.out.println("É a vez de " + player1.getName() + ".");
            int guess1 = player1.makeGuess();
            player1.addGuess(guess1);
            System.out.println(player1.getName() + " adivinhou: " + guess1);

            if (checkGuess(player1)) {;
                break;
            }

            System.out.println("É a vez do " + player2.getName() + ".");
            int guess2 = player2.makeGuess();
            player2.addGuess(guess2);
            System.out.println(player2.getName() + " adivinhou: " + guess2);

            if (checkGuess(player2)) {
                break;
            }
        }
    }

    private static void startNewGame() {
        targetNumber = random.nextInt(101);
        System.out.println("Um novo jogo começou! Adivinhe um número entre 1 e 100.");
    }

    public static boolean checkGuess(Player player) {

        if (player.getGuesses().getLast() < targetNumber) {
            System.out.println("É um número maior.");
        } else if (player.getGuesses().getLast() > targetNumber) {
            System.out.println("É um número menor.");
        }else {
            System.out.println("Parabéns, " + player.getName() + "! Você ganhou!");
            return true;
        }

        return false; //O método retorna true se o jogador acertar o número alvo, caso contrário, retorna false.
    }

    public static void setTargetNumber(int number) {
        targetNumber= number;
    }
}


