package estruturas;

public class Lista {
    private Nodo inicio; // Referência para o primeiro nó da lista
    private Nodo fim;    // Referência para o último nó da lista
    private int tamanho; // Quantidade de nós na lista

    // Construtor: inicia uma lista vazia
    public Lista() {
        this.inicio = null;
        this.fim = null;
        this.tamanho = 0;
    }

    // Insere um novo valor no final da lista
    public void inserirNoFinal(int valor) {
        Nodo novoNodo = new Nodo(valor);
        if (fim == null) { // Se a lista estiver vazia
            inicio = fim = novoNodo;
        } else {
            fim.setProximo(novoNodo);
            novoNodo.setAnterior(fim);
            fim = novoNodo;
        }
        tamanho++;
    }

    // Insere um novo valor após um valor de referência na lista
    public void inserirAposValor(int valorReferencia, int novoValor) {
        Nodo atual = inicio;

        // Percorre a lista até encontrar o valor de referência
        while (atual != null && atual.getValor() != valorReferencia) {
            atual = atual.getProximo();
        }

        // Se encontrou o valor de referência, insere o novo nó após ele
        if (atual != null) {
            Nodo novoNodo = new Nodo(novoValor);
            novoNodo.setProximo(atual.getProximo());
            novoNodo.setAnterior(atual);

            if (atual.getProximo() != null) {
                atual.getProximo().setAnterior(novoNodo);
            }
            atual.setProximo(novoNodo);

            // Se o nó inserido for o último, atualiza a referência do fim
            if (atual == fim) {
                fim = novoNodo;
            }
            tamanho++;
        }
    }

    // Retorna o número de nós na lista
    public int getNumeroNos() {
        return tamanho;
    }

    // Exibe o tamanho da lista
    public void adicionarTamanho() {
        System.out.println("Tamanho da lista: " + tamanho);
    }

    // Retorna um iterador para percorrer a lista
    public Iterador getIterador() {
        return new Iterador(inicio);
    }

    // Exibe os elementos da lista
    public void mostrarNos() {
        Nodo atual = inicio;
        while (atual != null) {
            System.out.print(atual.getValor() + " ");
            atual = atual.getProximo();
        }
        System.out.println();
    }
}
