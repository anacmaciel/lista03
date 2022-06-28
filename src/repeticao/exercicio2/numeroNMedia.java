package repeticao.exercicio2;
import java.util.Scanner;
public class numeroNMedia {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Quantos números você quer?");

        int quantidadeNumero =input.nextInt();
        int somaNumeros = 0;
        for (int i = 0; i < quantidadeNumero; i++) {

            System.out.println("Digite o número" + (i + 1));
            int numero = input.nextInt();

        somaNumeros = somaNumeros + numero;
        }
        input.close();
        int mediaNumeros = (somaNumeros / quantidadeNumero);

        System.out.println("A média dos números é: " + mediaNumeros);



    }
}
