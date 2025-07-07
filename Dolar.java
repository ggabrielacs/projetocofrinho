package empresa;

//Classe que representa o Dólar
public class Dolar extends Moeda {
 public Dolar(double valor) {
     super(valor);
 }

 public void info() {
     System.out.println("Dolar: " + valor);
 }

 public double converter() {
     return valor * 5.70; // 1 dólar equivale a 5.70 reais - Coloquei o valor atual da moeda
 }
}

