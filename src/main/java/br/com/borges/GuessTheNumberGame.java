package br.com.borges;
import java.util.Random;
import java.util.Scanner;

public class GuessTheNumberGame {
    private static final Random random = new Random();
    static int targetNumber;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o seu nome: ");
        String playerName = scanner.nextLine();

        startNewGame();
        Player player1 = new HumanPlayer(playerName);
        Player player2 = new ComputerPlayer("Computador");

        while (true) {
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
            System.out.println(player1.getName() + " adivinhou: " + guess2);
            if (checkGuess(player2)) {
                break;
            }
        }
    }

    private static void startNewGame() {
        targetNumber = random.nextInt(100) + 1;
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

        return false;
    }

    public static void setTargetNumber(int number) {
        targetNumber= number;
    }
}


    //private static final int targetNumber = new Random().nextInt(101);
    //public static void main (String[] args) {
        //System.out.println(targetNumber);


    //}

