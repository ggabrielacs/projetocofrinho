package empresa;

//Classe que representa o Euro
public class Euro extends Moeda {
 public Euro(double valor) {
     super(valor);
 }


 public void info() {
     System.out.println("Euro: " + valor);
 }

 public double converter() {
     return valor * 6.20; //  1 euro equivale a 6.20 reais - Coloquei o valor atual da moeda
 }
}