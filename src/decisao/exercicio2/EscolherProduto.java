package decisao.exercicio2;

import java.util.Scanner;

public class EscolherProduto {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite o valor do primeiro produto");
        double valorProduto1 = entrada.nextDouble();
        System.out.println("digite o valor do segundo produto");
        double valorProduto2 = entrada.nextDouble();
        System.out.println("Digite o valor do terceiro produto");
        double valorProduto3 = entrada.nextDouble();

        entrada.close();

        if (valorProduto1 < valorProduto2 && valorProduto1 < valorProduto3)
            System.out.println("O produto a ser comprado é o primeiro, com o valor de " + valorProduto1);

        if (valorProduto2 < valorProduto3 && valorProduto2 < valorProduto1)
            System.out.println("O produto a ser comprado é o segundo, com o valor de: " + valorProduto2);

        if (valorProduto3 < valorProduto2 && valorProduto3 < valorProduto1)
            System.out.println("O produto a ser comprado é o terceiro, com o valor de: " + valorProduto3);
    }

}