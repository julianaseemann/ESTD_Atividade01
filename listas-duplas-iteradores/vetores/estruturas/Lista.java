package estruturas;

public class Lista {
    private Nodo inicio;
    private Nodo fim;
    private int tamanho;

    public Lista() {
        this.inicio = null;
        this.fim = null;
        this.tamanho = 0;
    }

    public void inserirNoFinal(int valor) {
        Nodo novoNodo = new Nodo(valor);
        if (fim == null) {
            inicio = fim = novoNodo;
        } else {
            fim.setProximo(novoNodo);
            novoNodo.setAnterior(fim);
            fim = novoNodo;
        }
        tamanho++;
    }

    public void inserirAposValor(int valorReferencia, int novoValor) {
        Nodo atual = inicio;
        while (atual != null && atual.getValor() != valorReferencia) {
            atual = atual.getProximo();
        }
        if (atual != null) {
            Nodo novoNodo = new Nodo(novoValor);
            novoNodo.setProximo(atual.getProximo());
            novoNodo.setAnterior(atual);
            if (atual.getProximo() != null) {
                atual.getProximo().setAnterior(novoNodo);
            }
            atual.setProximo(novoNodo);
            if (atual == fim) {
                fim = novoNodo;
            }
            tamanho++;
        }
    }

    public int getNumeroNos() {
        return tamanho;
    }

    public void adicionarTamanho() {
        System.out.println("Tamanho da lista: " + tamanho);
    }

    public Iterador getIterador() {
        return new Iterador(inicio);
    }

    public void mostrarNos() {
        Nodo atual = inicio;
        while (atual != null) {
            System.out.print(atual.getValor() + " ");
            atual = atual.getProximo();
        }
        System.out.println();
    }
}
