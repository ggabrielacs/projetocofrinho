package empresa;

//Classe que representa o Real
public class Real extends Moeda {
 public Real(double valor) {
     super(valor);
 }


 public void info() {
     System.out.println("Real: " + valor);
 }


 public double converter() {
     return valor; // O Real já está na moeda desejada
 }
}

