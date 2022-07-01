package decisao.exercicio3;

import java.util.Scanner;

public class MediaAlunos {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Digite a primeira nota");

        double nota1 = input.nextDouble();
        System.out.println("Digite a segunda nota");
        double nota2 = input.nextDouble();
        input.close();

        double mediaDasNotas = (nota1 + nota2) / 2;

        System.out.println("A média foi: " + mediaDasNotas);

        System.out.println();

        if (mediaDasNotas == 10) {
            System.out.println("Aprovado com distinção!");

        } else if (mediaDasNotas >= 7) {
            System.out.println("Aprovado!");

        } else {
            System.out.println("Reprovado");
        }
    }


}