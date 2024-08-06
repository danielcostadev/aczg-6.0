public class EvenFibonacciNumbers {
    static int aux = 0;
    public static void main(String[] args) {

        // Declaração das varíavis primitivas que servirão como controle para calculo da Sequência Fibonacci
        int a = 0, b = 1, n = 4000000, temp;

        // laço while enquanto os valores Fibonacci não excederem 4 milhões
        while (b <= n) {

            temp = a;
            a = b;
            b = temp + b;

            System.out.printf("..%d", b);
            // Calculo da soma dos números pares

            if (b % 2 == 0){
                aux += b;
                //System.out.println("SOU PAR!");
            }
        }
        System.out.printf("%nResultado %d", aux);
    }
}