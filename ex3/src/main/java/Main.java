public class Main {
    static boolean estaOrdenado(int[] vetor) {
        int N = vetor.length;

        for (int i = 0; i < N - 1; i++) {
            if (vetor[i] > vetor[i + 1]) {
                return false;
            }
        }

        return true; 
    }

    public static void main(String[] args) {
        int[] vetorA = {1, 5, 3, 4, 5};

        System.out.println("O vetor A está ordenado? " + estaOrdenado(vetorA));
    }
}