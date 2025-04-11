package estruturas;

public class Pilha {
    private int[] elementos;
    private int topo;
    private int capacidade;

    // Construtor
    public Pilha(int capacidade) {
        this.capacidade = capacidade;
        this.elementos = new int[capacidade];
        this.topo = -1; // Pilha vazia
    }

    // Verifica se a pilha está vazia
    public boolean isEmpty() {
        return topo == -1;
    }

    // Verifica se a pilha está cheia
    public boolean isFull() {
        return topo == capacidade - 1;
    }

    // Inserir ao topo (empilhar)
    public void empilhar(int elemento) {
        if (isFull()) {
            throw new IllegalStateException("A pilha está cheia. Não é possível empilhar.");
        }
        topo++;
        elementos[topo] = elemento;
    }

    // Remover do topo (desempilhar)
    public int desempilhar() {
        if (isEmpty()) {
            throw new IllegalStateException("A pilha está vazia. Não é possível desempilhar.");
        }
        int elementoRemovido = elementos[topo];
        topo--;
        return elementoRemovido;
    }

    // Mostrar o elemento do topo
    public int topo() {
        if (isEmpty()) {
            throw new IllegalStateException("A pilha está vazia.");
        }
        return elementos[topo];
    }

    // Retorna o número de elementos na pilha
    public int tamanho() {
        return topo + 1;
    }
}