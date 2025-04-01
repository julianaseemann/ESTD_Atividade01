package estruturas;

public class Vetor {

    private Integer[] elementos; // Array para armazenar os valores
    private int tamanho;         // Número de elementos no vetor
    private int capacidade;      // Capacidade máxima atual do vetor

    // Construtor: inicializa o vetor com a capacidade informada
    public Vetor(int capacidade) {
        this.elementos = new Integer[capacidade];
        this.capacidade = capacidade;
        this.tamanho = 0;
    }

    // Adiciona um valor ao vetor, aumentando a capacidade se necessário
    public void adicionar(Integer valor) {
        if (tamanho == capacidade) {
            aumentarCapacidade();
        }
        elementos[tamanho++] = valor;
    }

    // Aumenta a capacidade do vetor em 50% quando necessário
    private void aumentarCapacidade() {
        capacidade += capacidade / 2;
        Integer[] novosElementos = new Integer[capacidade];

        System.arraycopy(elementos, 0, novosElementos, 0, tamanho); // Copia os elementos
        elementos = novosElementos;
    }

    // Exibe os elementos do vetor
    public void mostrarElementos() {
        System.out.println("Elementos no vetor:");
        for (int i = 0; i < tamanho; i++) {
            System.out.println(elementos[i]);
        }
        System.out.println("-----");
    }

    // Verifica se um valor está presente no vetor
    public void contem(Integer valor) {
        for (Integer elemento : elementos) {
            if (elemento != null && elemento.equals(valor)) {
                System.out.println("Valor encontrado");
                return;
            }
        }
        System.out.println("Valor não encontrado");
    }

    // Remove um elemento por posição
    public void remover(int posicao) {
        if (posicao < 0 || posicao >= tamanho) {
            System.out.println("Posição inválida");
            return;
        }

        System.arraycopy(elementos, posicao + 1, elementos, posicao, tamanho - posicao - 1);
        elementos[--tamanho] = null; // Diminui o tamanho e remove a referência do último elemento
    }

    // Remove um elemento pelo valor
    public void removerPorValor(Integer valor) {
        for (int i = 0; i < tamanho; i++) {
            if (elementos[i].equals(valor)) {
                remover(i);
                System.out.println("Item removido");
                return;
            }
        }
        System.out.println("Item não encontrado");
    }
}
