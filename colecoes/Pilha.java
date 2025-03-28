package colecoes;

import java.util.ArrayDeque;
import java.util.Deque;

public class Pilha {
  public static void main(String[] args) {
    Deque<String> livros = new ArrayDeque<>();

    // Adicionando livros na pilha
    // push e add -> Ambos adicionam elementos na pilha
    //Diferença ocorre quando a pilha está cheia
    //add --> quando não tem mais vagas lança exceção
    //push -->  quando não tem mais vagas retorna false
    livros.add("O pequeno Principe");
    livros.push("Dom Quixote");
    livros.push("O Senhor dos Anéis");  

    System.out.println(livros.peek()); // Retorna o elemento do topo da pilha, mas não remove
    System.out.println(livros.element()); // Retorna o elemento do topo da pilha, mas não remove

    System.out.println(livros.size()); // Tamanho da pilha
    System.out.println(livros.isEmpty()); // Verifica se a pilha está vazia

    System.out.println(livros.poll()); // Retorna false se a pilha estiver vazia
    System.out.println(livros.remove()); // Lança exceção se a pilha estiver vazia
    System.out.println(livros.pop()); // Lança exceção se a pilha estiver vazia
    
  }
}