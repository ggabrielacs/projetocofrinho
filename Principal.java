package empresa;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		
		// Criando o cofrinho para armazenar as moedas
		Cofrinho cofrinho = new Cofrinho();
		// Criando o scanner para ler a entrada
		Scanner scanner = new Scanner(System.in);
		
		
		while(true) {
			
		    // Informar qual opção do menu deseja realizar
		    System.out.println("\nEscolha a operação que deseja realizar:");
            System.out.println("\n1. Adicionar moeda");
            System.out.println("2. Remover moeda");
            System.out.println("3. Listar moedas");
            System.out.println("4. Calcular o valor total convertido em real");
            System.out.println("5. Encerrar");
            System.out.print("\nEscolha uma opção: ");
            
            // Opção escolhida
            int opcao = scanner.nextInt();
            
            switch (opcao) {
            case 1:
            	
            	// Escolha da moeda
                System.out.println("\nEscolha uma moeda:");
                System.out.println("1. Dolar");
                System.out.println("2. Euro");
                System.out.println("3. Real");
                
                System.out.print("\nEscolha uma opção: ");
                int tipo = scanner.nextInt(); 

                // Escolha do valor da moeda 
                System.out.print("\nQual o valor da moeda: ");   
               
                
                double valor = scanner.nextDouble();

                if (tipo == 1) 
                    cofrinho.adicionar(new Dolar(valor));
               // É criado uma instância da classe Dolar com o valor informado
                else if (tipo == 2)
                    cofrinho.adicionar(new Euro(valor));
              // É criado uma instância da classe Euro com o valor informado
                else if (tipo == 3)
                // É criado uma instância da classe Real com o valor informado
                    cofrinho.adicionar(new Real(valor));
                else
                    System.out.println("Opção inválida!");
                System.out.println("\nMoeda adicionada com sucesso!");
                continue; // Volta ao início do loop

       
            case 2:
            	
            	// informar o valor que será removido
            	System.out.print("\nDigite o valor da moeda a ser removida: ");
                double valorRemover = scanner.nextDouble();  
                
                // informar qual a moeda que será removida
                System.out.println("\nEscolha qual a moeda a ser removida:");
                System.out.println("1. Dolar");
                System.out.println("2. Euro");
                System.out.println("3. Real");

                System.out.print("\nEscolha uma opção: ");
                int tipoRemover = scanner.nextInt();

                Moeda moedaRemover = null;

                if (tipoRemover == 1)
                    moedaRemover = new Dolar(valorRemover);
                else if (tipoRemover == 2)
                    moedaRemover = new Euro(valorRemover);
                else if (tipoRemover == 3)
                    moedaRemover = new Real(valorRemover);
                else {
                    System.out.println("\nOpção inválida!");
                    continue;
                }

                if (cofrinho.removerMoeda(moedaRemover))
                    System.out.println("\nMoeda removida com sucesso!");
                else
                    System.out.println("\nMoeda não encontrada no cofrinho!");

                continue; // Volta ao início do loop
                
            case 3:
            	// Lista as moedas presentes no cofrinho
                cofrinho.listaMoedas();
                break;

            case 4:
            	// Calcula o total de moedas convertendo para o Real
                System.out.println("\nTotal convertido para o Real: R$ " + cofrinho.totalConvertido());
                break;

            case 5:
                System.out.println("\nFinalizado!!");
                scanner.close();
                return;

            default:
                System.out.println("\nOpção inválida!");
            }
        }
    }
}
	

	

		
