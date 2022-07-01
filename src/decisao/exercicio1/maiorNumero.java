package decisao.exercicio1;

import java.util.Scanner;

public class MaiorNumero {

    public static void main(String[] args) {


        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite o primeiro número");
        int primeiroNumero = entrada.nextInt();
        System.out.println("Digite o segundo número");
        int segundoNumero = entrada.nextInt();
        entrada.close();

        if (primeiroNumero > segundoNumero) {
            System.out.println("O maior número foi " + primeiroNumero);
        } else if (segundoNumero == primeiroNumero) {
            System.out.println("O primeiro número foi igual ao segundo. ");
        }
        if (segundoNumero > primeiroNumero)
            System.out.println("O maior número foi" + segundoNumero);
    }
}