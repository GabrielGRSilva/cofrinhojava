package cofrinhopoo;

//OBS: Terminar de configurar case 3 e 4 e verificar se 1 e 2 precisam de mais alguma alteração

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Cofrinho cofrinho = new Cofrinho();
		Scanner inputUsuario = new Scanner(System.in);
		
		int opcao, escolhaMoeda, escolhaValor;
		double totalEmReais;
		
		opcao = -1;
		System.out.println("Bem-vindo(a) ao Cofrim!");
		
		while(opcao!=0) {
			Menu.menu();
			try {
			opcao = inputUsuario.nextInt();
			}catch(Exception erro) {
				System.out.println("Opção inválida! Digite apenas o número da opção escolhida!");
				inputUsuario.next();
				continue;
			}
			switch(opcao) {
			
			case 1: //Escolhe moeda, valor e a adicione ao cofrinho (classe Cofrinho)
				escolhaMoeda = 0;
				while(escolhaMoeda>3 || escolhaMoeda<=0) {
					try {
						Menu.escolhaMoeda();
						escolhaMoeda = inputUsuario.nextInt();
						if(escolhaMoeda!=1 && escolhaMoeda!=2 && escolhaMoeda!=3) {
							System.out.println("Opção inválida!");
							break;
						}
						Menu.escolhaValor();
						escolhaValor = inputUsuario.nextInt();
						if(escolhaValor <= 0 || escolhaValor > 4) {
							System.out.println("Opção inválida!");
							break;
						}
						cofrinho.adicionar(escolhaMoeda, escolhaValor);
					}catch(Exception erro) {
						System.out.println("Opa, algo deu errado:\n" + erro);
					}
				}
				break;
			case 2://Escolhe moeda, valor e a remove do cofrinho (classe Cofrinho)
				escolhaMoeda = 0;
				int numMoeda = 1;
				try {
					System.out.println("Estas são suas moedas:");
					while(cofrinho.it.hasNext()) {
						Moeda moeda = cofrinho.it.next();
						System.out.printf("%d - %s: Moeda de %f", numMoeda, moeda.nome, moeda.valor);
						numMoeda++;
					}
					escolhaMoeda = inputUsuario.nextInt();
					if(escolhaMoeda<1 || escolhaMoeda > cofrinho.cofrinho.size()) {
						System.out.println("Opção inválida!");
						break;
					}
					cofrinho.remover(escolhaMoeda);
				}catch(Exception erro) {
					System.out.println("Opa, algo deu errado! Você digitou o número da opção correta?\n" + erro);
				}
				break;
			case 3://Faz a iteração para mostrar o valor de cada moeda guardada
				numMoeda = 1;
				try {
					System.out.println("Estas são suas moedas:");
					while(cofrinho.it.hasNext()) {
						Moeda moeda = cofrinho.it.next();
						System.out.printf("%d - %s: Moeda de %f", numMoeda, moeda.nome, moeda.valor);
						numMoeda++;
					}
				}catch(Exception erro) {
					System.out.println("Opa, algo deu errado! Você digitou o número da opção correta?\n" + erro);
				}
				break;
			case 4://Converte tudo e mostra o valor em reais
				totalEmReais = 0;
				while(cofrinho.it.hasNext()) {
					Moeda moeda = cofrinho.it.next();
					totalEmReais += moeda.converter();
				}
				System.out.printf("Convertendo todas as moedas, você tem um total de %.2f reais no cofre!", totalEmReais);
				break;
			case 0:
				inputUsuario.close(); //Fecha antes de encerrar para evitar memory leak
				System.out.println("Obrigado por usar o Cofrim! Vamos ficar RIIIIIIICOS! $$$");
				System.exit(0);
				break;
			default:
				System.out.println("Opção inválida! Digite o número da opção escolhida!");
			}
		}
	}
}