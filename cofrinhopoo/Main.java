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
					Menu.escolhaMoeda();
					escolhaMoeda = inputUsuario.nextInt();
				}
				
				System.out.println("Qual valor gostaria de adicionar?");
				escolhaValor = inputUsuario.nextInt();
				cofrinho.adicionar(escolhaMoeda, escolhaValor);
				break;
			case 2://Escolhe moeda, valor e a remove do cofrinho (classe Cofrinho)
				escolhaMoeda = 0;
				while(escolhaMoeda>3 || escolhaMoeda<=0) {
					Menu.escolhaRemover();
					escolhaMoeda = inputUsuario.nextInt();
				}
		
				System.out.println("Qual valor gostaria de remover?");
				escolhaValor = inputUsuario.nextInt();
				cofrinho.remover(escolhaMoeda, escolhaValor);
				break;
			case 3:
				//Logica para listar moedas
				
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
