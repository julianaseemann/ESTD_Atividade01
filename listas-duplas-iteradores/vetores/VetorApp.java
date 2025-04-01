import estruturas.Lista;
import estruturas.Iterador;

public class VetorApp {
    public static void main(String[] args) {
        // Criando uma lista duplamente encadeada
        Lista lista = new Lista();

        // Inserindo elementos no final da lista
        int[] valores = {2, 7, 9, 12, 16, 21, 27, 33, 42, 54};
        for (int valor : valores) {
            lista.inserirNoFinal(valor);
        }

        // Exibindo a lista antes das operações
        System.out.println("Lista antes das operações:");
        lista.mostrarNos();

        // Criando um iterador para manipular a lista
        Iterador iterador = lista.getIterador();

        // Movendo o iterador para o primeiro nó e inserindo 30 após o atual
        iterador.proximo();
        iterador.inserirApos(30);
        System.out.println("Lista após inserir 30 após o atual:");
        lista.mostrarNos();

        // Removendo o nó após o atual
        iterador.removerApos();
        System.out.println("Lista após remover após o atual:");
        lista.mostrarNos();

        // Movendo o iterador e inserindo 18 antes do atual
        iterador.proximo();
        iterador.inserirAntes(18);
        System.out.println("Lista após inserir 18 antes do atual:");
        lista.mostrarNos();

        // Removendo o nó antes do atual
        iterador.removerAntes();
        System.out.println("Lista após remover antes do atual:");
        lista.mostrarNos();
    }
}
