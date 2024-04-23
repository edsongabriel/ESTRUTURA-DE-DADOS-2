import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {
  
    public static int[] gerarVetorA(int N) {
        int[] vetorA = new int[N];
        Random random = new Random();
        for (int i = 0; i < N; i++) {
            vetorA[i] = random.nextInt(15) + 1; 
        }
        Arrays.sort(vetorA); 
        return vetorA;
    }

    public static int buscaBinariaIterativa(int[] vetorA, int X) {
        int esquerda = 0;
        int direita = vetorA.length - 1;

        while (esquerda <= direita) {
            int meio = esquerda + (direita - esquerda) / 2;

            if (vetorA[meio] == X)
                return meio;

            if (vetorA[meio] > X)
                direita = meio - 1;

            else
                esquerda = meio + 1;
        }

        return -1;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Informe o tamanho do vetor: ");
        int N = scanner.nextInt();

      
        int[] vetorA = gerarVetorA(N);
        System.out.println("Vetor gerado: " + Arrays.toString(vetorA));

        System.out.println("Informe o valor a ser buscado: ");
        int X = scanner.nextInt();

      
        int indice = buscaBinariaIterativa(vetorA, X);

      
        if (indice != -1) {
            System.out.println("O valor " + X + " foi encontrado no índice " + indice);
        } else {
            System.out.println("O valor " + X + " não foi encontrado no vetor.");
        }
    }

  
}