package decisao.exercicio4;

import java.util.Scanner;

public class SalarioReajuste {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Digite o seu salário atual!");
        double salarioAtual = input.nextDouble();


        if (salarioAtual <= 280.00) {
            double salarioReajuste20 = (salarioAtual * 0.20);
            double novoSalario = (salarioAtual + salarioReajuste20);
            System.out.println("O reajuste do seu salário foi de 20%, seu salário antes do reajuste era de: " + salarioAtual + ", o aumento foi de: " + salarioReajuste20 + " e o novo salário é de: " + novoSalario);

        }

        if (salarioAtual >= 280.01 && salarioAtual <= 700.00) {

            double salarioReajuste15 = (salarioAtual * 0.15);
            double novoSalario = (salarioAtual + salarioReajuste15);
            System.out.println("O reajuste do seu salário foi de 15%, seu salário antes do reajuste era de: " + salarioAtual + ", o aumento foi de: " + salarioReajuste15 + " e o novo salário é de: " + novoSalario);


        }
        if (salarioAtual >= 700.01 && salarioAtual <= 1500.00) {
            double salarioReajuste10 = (salarioAtual * 0.10);
            double novoSalario = (salarioAtual + salarioReajuste10);
            System.out.println("O reajuste do seu salário foi de 10%, seu salário antes do reajuste era de: " + salarioAtual + ", o aumento foi de: " + salarioReajuste10 + " e o novo salário é de: " + novoSalario);
        }
        if (salarioAtual >= 1500.00) {
            double salarioReajuste5 = (salarioAtual * 0.05);
        double novoSalario = (salarioAtual + salarioReajuste5);
        System.out.println("O reajuste do seu salário foi de 5%, seu salário antes do reajuste era de: " + salarioAtual + ", o aumento foi de: " + salarioReajuste5 + " e o novo salário é de: " + novoSalario);
    }
    }
}
