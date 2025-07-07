package empresa;

// A Classe abstrata que representará uma moeda 
public abstract class Moeda {
	
	    protected double valor; // Valor da moeda protegida

	    // Inicializa o valor da moeda
	    public Moeda(double valor) {
	        this.valor = valor;
	    }

	    // Método abstrato para exibir informações da moeda
	    public abstract void info();
	    
	    // Método abstrato para converter o valor da moeda para Real
	    public abstract double converter();
	}

