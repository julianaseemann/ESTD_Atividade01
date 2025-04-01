package estruturas;

public class Nodo {
    private int valor;       // Armazena o valor do nó
    private Nodo proximo;    // Referência para o próximo nó na lista
    private Nodo anterior;   // Referência para o nó anterior na lista

    // Construtor: inicializa o nó com um valor e sem referências
    public Nodo(int valor) {
        this.valor = valor;
        this.proximo = null;
        this.anterior = null;
    }

    // Métodos de acesso (getters e setters) para manipular os atributos do nó
    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public Nodo getProximo() {
        return proximo;
    }

    public void setProximo(Nodo proximo) {
        this.proximo = proximo;
    }

    public Nodo getAnterior() {
        return anterior;
    }

    public void setAnterior(Nodo anterior) {
        this.anterior = anterior;
    }
}
