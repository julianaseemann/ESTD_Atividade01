import java.util.Arrays;
import estruturas.Lista;

public class VetorApp {
    public static void main(String[] args) {
        int[] vetor = {2, 7, 9, 12, 16, 21, 27, 33, 42, 54};
        System.out.println("Vetor original: " + Arrays.toString(vetor));
        
        // Busca binária por um valor informado
        int valorBusca = 16;
        int indiceEncontrado = buscaBinaria(vetor, valorBusca);
        if (indiceEncontrado != -1) {
            System.out.println("Valor " + valorBusca + " encontrado no índice " + indiceEncontrado);
        } else {
            System.out.println("Valor " + valorBusca + " não encontrado.");
        }
        
        // Inserir no início do vetor
        int novoValor = 5;
        vetor = inserirNoInicio(vetor, novoValor);
        System.out.println("Vetor após inserção no início: " + Arrays.toString(vetor));
    }

    public static int buscaBinaria(int[] vetor, int valor) {
        int inicio = 0, fim = vetor.length - 1;
        while (inicio <= fim) {
            int meio = (inicio + fim) / 2;
            if (vetor[meio] == valor) {
                return meio;
            } else if (vetor[meio] < valor) {
                inicio = meio + 1;
            } else {
                fim = meio - 1;
            }
        }
        return -1;
    }

    public static int[] inserirNoInicio(int[] vetor, int novoValor) {
        int[] novoVetor = new int[vetor.length + 1];
        novoVetor[0] = novoValor;
        System.arraycopy(vetor, 0, novoVetor, 1, vetor.length);
        return novoVetor;
    }
}
