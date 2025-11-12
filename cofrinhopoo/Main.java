package cofrinhopoo;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner inputUsuario = new Scanner(System.in);
		
		int opcao = inputUsuario.nextInt();
		
		int escolhaMoeda;
		double escolhaValor;
		
		while(opcao!=0) {
			
			Menu.menu();
			
			switch(opcao) {
			
			case 1:
				escolhaMoeda = 0;
				
				while(escolhaMoeda>3 || escolhaMoeda<=0) {
					Menu.escolhaMoeda();
					escolhaMoeda = inputUsuario.nextInt();
				}
				
				System.out.println("Qual valor gostaria de adicionar?");
				escolhaValor = inputUsuario.nextInt();
				
				
				
				break;
			case 2:
				//Logica para remover moeda
				
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
