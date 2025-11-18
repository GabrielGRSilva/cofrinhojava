package cofrinhopoo;

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
				try {
					while(escolhaMoeda > 3 || escolhaMoeda <= 0) {
						Menu.escolhaRemover();
						escolhaMoeda = inputUsuario.nextInt();
						if(escolhaMoeda!=1 && escolhaMoeda!=2 && escolhaMoeda!=3) {
							System.out.println("Opção inválida!");
							break;
						}
					}
					System.out.println("Qual valor gostaria de remover?");
					escolhaValor = inputUsuario.nextInt();
					if(escolhaValor < 0) {
						System.out.println("Opa! Digite apenas o valor 'limpo', sem utilizar números negativos!");
						break;
					}
					cofrinho.remover(escolhaMoeda, escolhaValor);
				}catch(Exception erro) {
					System.out.println("Opa, algo deu errado! Você digitou o número da opção correta?\n" + erro);
				}
				break;
			case 3://Faz a iteração para mostrar o valor de cada moeda guardada
				System.out.println("Aqui estão suas moedas:\n");
				
				for(Moeda moeda: cofrinho.moedas) {
					if(moeda.valor == 0) {
						System.out.println(moeda.nome + ": Vazio! :( \n");
					}else{
						System.out.println(moeda.nome + ": " + moeda.valor + "\n");
					}
				}
				break;
			case 4://Converte tudo e mostra o valor em reais
				totalEmReais = 0;
				
				for(int i = 0; i<=2; i++) {
					Moeda moedaObj = cofrinho.get(i);
					totalEmReais += moedaObj.converter();
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