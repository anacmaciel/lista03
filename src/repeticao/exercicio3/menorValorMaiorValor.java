package repeticao.exercicio3;

//somente para estudo e fixação de conteúdo
import java.util.Scanner;
import java.util.List;

import java.util.ArrayList;

public class menorValorMaiorValor {
    public static void main(String[] args) {


        int quantidadeNumeros = 10;
        List<Integer> numeros = new ArrayList<>();

        for (int i = 0; i < quantidadeNumeros; i++) {
            System.out.println("Digite o número: ");
            Scanner input = new Scanner(System.in);
            numeros.add(input.nextInt());
        }

        int maiorNumero = 0;
        int menorNumero = Integer.MAX_VALUE;

        for (int i = 0; i < quantidadeNumeros; i++) {
            if (numeros.get(i) > maiorNumero) {
                maiorNumero = numeros.get(i);
            } else if (numeros.get(i) < menorNumero) {
                menorNumero = numeros.get(i);
            }
        }
        System.out.println(maiorNumero);
        System.out.println(menorNumero);
    }
}

