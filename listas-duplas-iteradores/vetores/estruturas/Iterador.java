package estruturas;

public class Iterador {
    private Nodo atual; // Nó atual do iterador

    // Construtor: inicializa o iterador no primeiro nó da lista
    public Iterador(Nodo primeiro) {
        this.atual = primeiro;
    }

    // Verifica se há um próximo elemento na lista
    public boolean temProximo() {
        return atual != null && atual.getProximo() != null;
    }

    // Avança para o próximo nó, se existir
    public void proximo() {
        if (temProximo()) {
            atual = atual.getProximo();
        }
    }

    // Insere um novo nó após o nó atual
    public void inserirApos(int valor) {
        if (atual == null) return; // Verifica se há um nó atual

        Nodo novoNodo = new Nodo(valor);
        novoNodo.setProximo(atual.getProximo());
        novoNodo.setAnterior(atual);

        if (atual.getProximo() != null) {
            atual.getProximo().setAnterior(novoNodo);
        }
        atual.setProximo(novoNodo);
    }

    // Remove o nó que está após o nó atual
    public void removerApos() {
        if (atual == null || atual.getProximo() == null) return; // Verifica se há um nó para remover

        Nodo nodoRemover = atual.getProximo();
        atual.setProximo(nodoRemover.getProximo());

        if (nodoRemover.getProximo() != null) {
            nodoRemover.getProximo().setAnterior(atual);
        }
    }

    // Insere um novo nó antes do nó atual
    public void inserirAntes(int valor) {
        if (atual == null) return; // Verifica se há um nó atual

        Nodo novoNodo = new Nodo(valor);
        novoNodo.setAnterior(atual.getAnterior());
        novoNodo.setProximo(atual);

        if (atual.getAnterior() != null) {
            atual.getAnterior().setProximo(novoNodo);
        }
        atual.setAnterior(novoNodo);
    }

    // Remove o nó que está antes do nó atual
    public void removerAntes() {
        if (atual == null || atual.getAnterior() == null) return; // Verifica se há um nó para remover

        Nodo nodoRemover = atual.getAnterior();
        if (nodoRemover.getAnterior() != null) {
            nodoRemover.getAnterior().setProximo(atual);
        }
        atual.setAnterior(nodoRemover.getAnterior());
    }

    // Retorna o nó atual
    public Nodo getAtual() {
        return atual;
    }
}
