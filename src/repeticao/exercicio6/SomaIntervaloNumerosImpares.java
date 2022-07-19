package repeticao.exercicio6;

import java.util.Scanner;

public class SomaIntervaloNumerosImpares {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Digite a partir de  qual  número você quer somar");
        int intervaloInicial = input.nextInt();
        System.out.println("Digite até qual número você quer somar");
        int intervaloFinal = input.nextInt();
        int somaNumeros = 0;

        System.out.println("O intervalo inicial definido foi " + intervaloInicial + " e o intervalo final foi " + intervaloFinal);

        if (intervaloInicial >= intervaloFinal) {
            System.out.println("Valor de intervalo inválido.\n Fim do brograma!");
        }

        while (intervaloInicial <= intervaloFinal) {
            if (intervaloInicial % 2 == 1) {

                System.out.println("O número ímpar encontrado entre eles é: " + intervaloInicial);

                somaNumeros = somaNumeros + intervaloInicial;

                System.out.println("A soma entre eles é de: " + somaNumeros);
            }
            intervaloInicial++;
        }
    }

}