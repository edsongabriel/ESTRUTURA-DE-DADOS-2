import java.util.Scanner;

public class Main {
    static int fibonacciIterativo(int N) {
        if (N <= 1) {
            return N;
        }

        int fN = 0;
        int fN1 = 1;
        int fN2 = 0;

        for (int i = 2; i <= N; i++) {
              fN = fN1 + fN2;
              fN2 = fN1;
              fN1 = fN;
        }

        return fN;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Informe o valor de N para obter o número de Fibonacci: ");
        int N = scanner.nextInt();

        int resultado = fibonacciIterativo(N);
        System.out.println("O " + N + "º número de Fibonacci é: " + resultado);
    }
}
