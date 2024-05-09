package Main;

import java.util.Scanner;

public class exercicio_1 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        double altura, base, areaRetangulo, areaRetanguloMetro;

        System.out.println("informe o valor da base:");
        base = input.nextDouble();

        System.out.println("informe o valor da altura:");
        altura = input.nextDouble();
        areaRetangulo = base * altura;
        areaRetanguloMetro = areaRetangulo / 100;

        System.out.println("A área de um retângulo de base " + base+"cm");
        System.out.println("E altura "+altura+"cm");
        System.out.println("É igual a "+ areaRetangulo+"cm");
        System.out.println("ou "+areaRetanguloMetro+"m");


    }
}
