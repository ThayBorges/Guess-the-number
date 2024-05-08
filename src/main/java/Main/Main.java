package Main;

import java.util.Scanner;

/**
 * PARA FAZER UMA DOCUMENTAÇÃO EM JAVA DOC
 * TODA CLASSE TEM UM MÉTODO PRINCIPAL
 * ESSE MÉTODO PRINCIPAL INFORMA ONDE QUE O PROGRAMA DEVE INICIAR AO SER EXECULTADO.
 * Variáveis é o modo que o java consegue lhe dar com o tipo de datas (número inteiros, números decimais, booleam, caracteres, etc)
 * Dados Primitivos
 * 8 tipos:
 * byte o espaço armazenado nela é apenas até 8 bites até 127 ou -128;
 * short 16 bites;
 * int 32 bites;
 * long números enormes;
 * float  números com precisão maior que o double;
 * double números decimais;
 * boolean true ou false;
 * char para armazenar caractere, tem que ser entre aspas simples;
 * \n para quebra de linha
 * final no início transforma a variável em constante;
 * "%" representa o resto. exemplo: 12 % 5 = 2;
 * "+=" "-=" "*=" "%=" "++" "--"
 * String frase = "pão com mortadela"; >> objetivo tipo string que permite
 */

public class Main { //isso é uma classe
    public static void main (String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Incira um valor em gramas: ");
        int gramas = input.nextInt();

        int kilos = gramas/1000;
        gramas = gramas%1000;

        System.out.println("O total de kilos é "+kilos);
        System.out.println("O total de gramas é "+gramas);


    }
}
