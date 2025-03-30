import estruturas.Lista;
import estruturas.Iterador;

public class VetorApp {
    public static void main(String[] args) {
        Lista lista = new Lista();
        lista.inserirNoFinal(2);
        lista.inserirNoFinal(7);
        lista.inserirNoFinal(9);
        lista.inserirNoFinal(12);
        lista.inserirNoFinal(16);
        lista.inserirNoFinal(21);
        lista.inserirNoFinal(27);
        lista.inserirNoFinal(33);
        lista.inserirNoFinal(42);
        lista.inserirNoFinal(54);

        System.out.println("Lista antes das operações:");
        lista.mostrarNos();

        Iterador iterador = lista.getIterador();

        iterador.proximo();
        iterador.inserirApos(30);
        System.out.println("Lista após inserir 30 após o atual:");
        lista.mostrarNos();

        iterador.removerApos();
        System.out.println("Lista após remover após o atual:");
        lista.mostrarNos();

        iterador.proximo();
        iterador.inserirAntes(18);
        System.out.println("Lista após inserir 18 antes do atual:");
        lista.mostrarNos();

        iterador.removerAntes();
        System.out.println("Lista após remover antes do atual:");
        lista.mostrarNos();
    }
}
