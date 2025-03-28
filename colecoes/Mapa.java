package colecoes;

import java.util.Map;
import java.util.Map.Entry;
import java.util.HashMap;

public class Mapa {
    public static void main(String[] args) {
        // Criando um mapa (dicionário) com chaves e valores
        // O tipo de chave e valor pode ser definido entre <>
        // MAP é a interface e HASHMAP é a implementação
        // O MAP não pode ser instanciado, apenas implementações dele

        Map<String, String> mapa = new HashMap<>();
        // Adicionando elementos ao mapa
        mapa.put("1", "Ana");
        mapa.put("2", "Bia");
        mapa.put("3", "Carlos");
        mapa.put("4", "Daniela");
        mapa.put("5", "Eduardo");
        // Diferente do add, o put não lança exceção se a chave já existe, apenas substitui o valor

        System.out.println(mapa.get("1")); // Retorna o valor associado à CHAVE "1"
        System.out.println(mapa.containsKey("2")); // Verifica se a CHAVE "2" existe no mapa
        System.out.println(mapa.containsValue("Carlos")); // Verifica se o VALOR "Carlos" existe no mapa

        System.out.println(mapa.size()); // Tamanho do mapa
        System.out.println(mapa.isEmpty()); // Verifica se o mapa está vazio

        System.out.println(mapa.keySet()); // Retorna um conjunto com todas as chaves do mapa
        System.out.println(mapa.values()); // Retorna um conjunto com todos os valores do mapa
        System.out.println(mapa.entrySet()); // Retorna um conjunto com todas as entradas (chave-valor) do mapa

        for (String chave: mapa.keySet()) {
            System.out.println("Chave: " + chave + ", Valor: " + mapa.get(chave));
        }

        // Removendo um elemento do mapa
        mapa.remove("3"); // Remove o elemento com a CHAVE "3"
        mapa.remove("5", "Eduardo"); // Remove o elemento com a CHAVE "5" e VALOR "Eduardo"
        System.out.println(mapa.containsKey("3")); // Verifica se a CHAVE "3" existe no mapa (deve retornar false)
        
        // Iterando sobre o mapa usando entrySet()
        // O entrySet() retorna um conjunto de entradas (chave-valor) do mapa
        // Cada entrada é um objeto do tipo Map.Entry, que contém a chave e o valor
        // O for-each percorre cada entrada do conjunto, permitindo acessar tanto a chave quanto o valor
        for(Entry<String, String> entry: mapa.entrySet()) {
            System.out.println("Chave: " + entry.getKey() + ", Valor: " + entry.getValue());
        }
        
        // Limpando o mapa  
        mapa.clear(); // Remove todos os elementos do mapa
    }
}
