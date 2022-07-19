package repeticao.exercicio9;

import java.util.Scanner;

public class FatorialNumeroN {

    public static void main(String[] args) {

Scanner input = new Scanner(System.in);
        System.out.println("Digite o número para saber o fatorial dele");
        int numeroFatorial= input.nextInt();

        int multiplicarFatorial =1;
        for (int i = 1; i <= numeroFatorial; i++) {
multiplicarFatorial *= numeroFatorial;
            System.out.println("O fatorial de " + numeroFatorial + " é " + multiplicarFatorial);
        }
    }
}
