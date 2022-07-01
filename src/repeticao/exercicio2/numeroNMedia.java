package repeticao.exercicio2;

import java.util.Scanner;

public class NumeroNMedia {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Quantos números você quer?");

        double quantidadeNumero = input.nextInt();
        double somaNumeros = 0;
        for (int i = 0; i < quantidadeNumero; i++) {

            System.out.println("Digite o número" + (i + 1));
            double numero = input.nextInt();

            somaNumeros = somaNumeros + numero;
        }
        input.close();
        double mediaNumeros = (somaNumeros / quantidadeNumero);

        System.out.println("A média dos números é: " + mediaNumeros);


    }
}
