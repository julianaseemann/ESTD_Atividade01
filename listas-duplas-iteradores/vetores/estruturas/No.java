package estruturas;

public class No {
    int dado;       // Valor armazenado no nó
    No proximo;     // Referência para o próximo nó na lista
    No anterior;    // Referência para o nó anterior na lista

    // Construtor: inicializa o nó com um valor e sem referências
    public No(int dado) {
        this.dado = dado;
        this.proximo = null;
        this.anterior = null;
    }
}