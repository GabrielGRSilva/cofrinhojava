package cofrinhopoo;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Cofrinho cofrinho = new Cofrinho();
	
		Scanner inputUsuario = new Scanner(System.in);
		
		int opcao = inputUsuario.nextInt();
		
		int escolhaMoeda;
		double escolhaValor;
		
		while(opcao!=0) {
			
			Menu.menu();
			
			switch(opcao) {
			
			case 1: //Escolhe moeda, valor e a adicione ao cofrinho (classe Cofrinho)
				escolhaMoeda = 0;
				while(escolhaMoeda>3 || escolhaMoeda<=0) {
					try {
						Menu.escolhaMoeda();
						escolhaMoeda = inputUsuario.nextInt();
					
					
						System.out.println("Qual valor gostaria de adicionar?");
						escolhaValor = inputUsuario.nextInt();
						cofrinho.adicionar(escolhaMoeda, escolhaValor);
					}catch(Exception erro) {
						System.out.println("Opa, algo deu errado:\n" + erro);
					}
				}
				break;
			case 2://Escolhe moeda, valor e a remove do cofrinho (classe Cofrinho)
				escolhaMoeda = 0;
				try {
					while(escolhaMoeda>3 || escolhaMoeda<=0) {
						Menu.escolhaRemover();
						escolhaMoeda = inputUsuario.nextInt();
					}
			
					System.out.println("Qual valor gostaria de remover?");
					escolhaValor = inputUsuario.nextInt();
					cofrinho.remover(escolhaMoeda, escolhaValor);
				}catch(Exception erro) {
					System.out.println("Opa, algo deu errado:\n" + erro);
				}
				break;
			case 3:
				System.out.println("Aqui estão suas moedas:\n");
				
				for(Moeda moeda: cofrinho.moedas) {
					if(moeda.valor == 0) {
						System.out.println(moeda.nome + ": Vazio! :( \n");
					}else{
						System.out.println(moeda.nome + ": " + moeda.valor + "\n");
					}
				}
				
				
				break;
			case 4:
				//Logica para calcular total em reais
				
				break;
			default:
				System.out.println("Opção inválida! Digite o número da opção escolhida!");
			}

		}
	}
}
