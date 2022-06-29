package decisao.exercicio5;

import java.util.Scanner;

public class diasDaSemana {

    public static void main(String[] args) {
        System.out.println("Digite o dia da semana escolhido");
        Scanner input = new Scanner(System.in);

        int numero = input.nextInt();
        switch (numero) {
            case 1:
                System.out.println("O dia da semana escolhido foi domingo");
                break;
            case 2:
                System.out.println("O dia da semana escolhido foi Segunda");
                break;
            case 3:
                System.out.println("O dia da semana escolhido foi Terça");
                break;
            case 4:
                System.out.println("O dia da semana escolhido foi Quarta");
                break;
            case 5:
                System.out.println("O dia da semana escolhido foi quinta");
                break;
            case 6:
                System.out.println("O dia da semana escolhido foi Sexta");
                break;
            case 7:
                System.out.println("O dia da semana escolhido foi Sábado");
                break;
            default:
                System.out.println("Opção inválida, digite apenas os números de 1 a 7. ");

        }
    }

}
