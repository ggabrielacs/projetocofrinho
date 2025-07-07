package empresa;

import java.util.ArrayList;

// A Classe que irá armazenar e gerenciar as moedas
public class Cofrinho {
 private ArrayList<Moeda> listaMoedas = new ArrayList<>();

 // Adicionar uma moeda ao cofrinho
 public void adicionar(Moeda moeda) {
     listaMoedas.add(moeda);
 }

 // Remover uma moeda da lista de moedas do cofrinho
 public boolean removerMoeda(Moeda moeda) {
	    for (Moeda m : listaMoedas) {
	        if (m.getClass() == moeda.getClass() && m.valor == moeda.valor) {
	            listaMoedas.remove(m);
	            return true; // Removido com sucesso
	        }
	    }
	    return false; // Moeda não encontrada
	}


 // Lista todas as moedas que estão no cofrinho
 public void listaMoedas() {
     for (Moeda moeda : listaMoedas) {
         moeda.info();
     }
 }

 // Calcular o valor total do cofrinho que foi convertido para o Real
 public double totalConvertido() {
     double total = 0;
  // Converte para o valor em Real
     for (Moeda moeda : listaMoedas) {
         total += moeda.converter();
     }
     return total;
 }
}