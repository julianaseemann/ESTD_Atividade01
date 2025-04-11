package estruturas;

public class Main {
    public static void main(String[] args) {
        Pilha pilha = new Pilha(5);

        pilha.empilhar(10);
        pilha.empilhar(20);
        pilha.empilhar(30);

        System.out.println("Topo da pilha: " + pilha.topo());

        while (!pilha.isEmpty()) {
            System.out.println("Desempilhado: " + pilha.desempilhar());
        }

        System.out.println("Pilha está vazia? " + pilha.isEmpty());
    }
}

