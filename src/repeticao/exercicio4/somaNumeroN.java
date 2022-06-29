package repeticao.exercicio4;

import java.util.Scanner;
public class somaNumeroN {

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
                if (somaNumeros > 0) {


                    System.out.println("A soma dos números é: " + somaNumeros);
                }


            }
        }

    }
}
