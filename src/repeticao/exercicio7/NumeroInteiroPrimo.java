package repeticao.exercicio7;

import java.util.Scanner;

public class NumeroInteiroPrimo {

    public static void main(String[] args) {


        int total = 0;
        Scanner input = new Scanner(System.in);
        System.out.println("Informe um número para sabermos se ele é primo: ");
        int numero = input.nextInt();
        input.close();
        for (int i = 1; i <= numero; i++) {
            if (numero % i == 0) {
                total += 1;
            }
        }
        if (total == 2) {
            System.out.println("O número " + numero + " é primo");
        } else {
            System.out.println("O número " + numero + " não é primo");
        }
    }
     }
