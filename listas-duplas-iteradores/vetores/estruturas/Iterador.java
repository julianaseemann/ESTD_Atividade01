package estruturas;

public class Iterador {
    private Nodo atual;

    public Iterador(Nodo primeiro) {
        this.atual = primeiro;
    }

    public boolean temProximo() {
        return atual != null && atual.getProximo() != null;
    }

    public void proximo() {
        if (temProximo()) {
            atual = atual.getProximo();
        }
    }

    public void inserirApos(int valor) {
        if (atual == null) return;

        Nodo novoNodo = new Nodo(valor);
        novoNodo.setProximo(atual.getProximo());
        novoNodo.setAnterior(atual);

        if (atual.getProximo() != null) {
            atual.getProximo().setAnterior(novoNodo);
        }
        atual.setProximo(novoNodo);
    }

    public void removerApos() {
        if (atual == null || atual.getProximo() == null) return;

        Nodo nodoRemover = atual.getProximo();
        atual.setProximo(nodoRemover.getProximo());

        if (nodoRemover.getProximo() != null) {
            nodoRemover.getProximo().setAnterior(atual);
        }
    }

    public void inserirAntes(int valor) {
        if (atual == null) return;

        Nodo novoNodo = new Nodo(valor);
        novoNodo.setAnterior(atual.getAnterior());
        novoNodo.setProximo(atual);

        if (atual.getAnterior() != null) {
            atual.getAnterior().setProximo(novoNodo);
        }
        atual.setAnterior(novoNodo);
    }

    public void removerAntes() {
        if (atual == null || atual.getAnterior() == null) return;

        Nodo nodoRemover = atual.getAnterior();
        if (nodoRemover.getAnterior() != null) {
            nodoRemover.getAnterior().setProximo(atual);
        }
        atual.setAnterior(nodoRemover.getAnterior());
    }

    public Nodo getAtual() {
        return atual;
    }
}
