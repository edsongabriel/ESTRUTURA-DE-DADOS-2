import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {
    static int buscaSequencialRecursiva(int[] vetorA, int N, int X, int inicio) {
        if (inicio >= N) {
            return -1; 
        }

        if (vetorA[inicio] == X) {
            return inicio;
        } else {
            return buscaSequencialRecursiva(vetorA, N, X, ++inicio); 
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
      
        System.out.println("Informe o tamanho do vetor: ");
        int N = scanner.nextInt();

        int[] vetorA = new int[N];

        for (int i = 0; i < N; i++) {
            vetorA[i] = random.nextInt(15) + 1; // Gera números aleatórios entre 1 e 15
        }

         System.out.println("Vetor gerado: " + Arrays.toString(vetorA));

        System.out.println("Informe o valor de X:");
        int X = scanner.nextInt();

      int indice = buscaSequencialRecursiva(vetorA, N, X, 0);

      if (indice != -1) {
          System.out.println("O valor " + X + " foi encontrado no índice " + indice);
      } else {
          System.out.println("O valor " + X + " não foi encontrado no vetor.");
      }
    }
}