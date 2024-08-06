public class LargestPrimeFactor {

    // Método para encontrar o maior fator primo
    public static long maiorFatorPrimo(long numero) {
        long fatorPrimo = 1;

        // Divida por 2 até não ser mais divisível
        while (numero % 2 == 0) {
            fatorPrimo = 2;
            numero /= 2; // Divisão do número por 2 numero é atualizado com o resultado.
        }

        // Divida por números ímpares a partir de 3
        for (long i = 3; i * i <= numero; i += 2) {
            while (numero % i == 0) {
                fatorPrimo = i;
                numero /= i; // Divisão do número por i e numero é atualizado com o resultado.
            }
        }

        // Se o número restante for maior que 2, é um fator primo
        if (numero > 2) {
            fatorPrimo = numero;
        }

        return fatorPrimo;
    }

    public static void main(String[] args) {
        long numero = 600851475143L;
        long resultado = maiorFatorPrimo(numero);
        System.out.println("O maior fator primo de " + numero + " é: " + resultado);
    }
}