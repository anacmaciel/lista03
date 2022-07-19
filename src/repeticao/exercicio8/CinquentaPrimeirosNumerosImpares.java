package repeticao.exercicio8;

public class CinquentaPrimeirosNumerosImpares {
        public static void main(String[] args) {
int numeroImpar = 1;
            int somaNumeros = 0;

            while (numeroImpar <= 99) {
                if (numeroImpar % 2 == 1) {

                    System.out.println("O número ímpar encontrado entre eles é: " + numeroImpar);

                    somaNumeros = somaNumeros + numeroImpar;

                    System.out.println("A soma entre eles é de: " + somaNumeros);
                }
                numeroImpar++;
            }


    }
}
