import java.util.LinkedList;
import java.util.Queue;

public class Fila {
    public static void main(String[] args) {
        Queue<String> fila = new LinkedList<>();

        // Offer e Add -> Ambos adicionam elementos na fila
        //Diferença ocorre quando a fila está cheia
        //add --> quando não tem mais vagas lança exceção
        //offer -->  quando não tem mais vagas retorna false
        fila.add("Ana");
        fila.offer("Bia");

        //Peek e Element ambos obtem o próximo elemento da fila
        //Diferença ocorre quando a fila está vazia
        System.out.println(fila.peek()); // Quando não tiver elemento retorna Null
        System.out.println(fila.element()); // Quando não tiver elemento lança Exception

        //Tamanho da fila
        fila.size();

        //Limpar a fila
        //fila.clear();

        //Verifica se está vazia
        fila.isEmpty();

        //Obtem o próximo elemento da fila e remove ele
        //Quando não tem elementos retorna NULL
        System.out.println(fila.poll()); // -> Não retorna erro 
        


    }
}