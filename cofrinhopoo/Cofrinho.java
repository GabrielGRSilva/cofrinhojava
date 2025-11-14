package cofrinhopoo;

import java.util.ArrayList;

public class Cofrinho {
	ArrayList<Moeda> moedas = new ArrayList<>();
	Real real = new Real();
	Dolar dolar = new Dolar();
	Euro euro = new Euro();
	
	public Cofrinho() {
		moedas.add(real);
		moedas.add(dolar);
		moedas.add(euro);
	}
	
	public void adicionar(int escolhaMoeda, double escolhaValor) {
		switch(escolhaMoeda) {
		
		case 1:
			real.valor += escolhaValor;
			System.out.printf("Foram adicionados %.2f reais ao cofrinho!", escolhaValor);
			break;
			
		case 2:
			dolar.valor += escolhaValor;
			System.out.printf("Foram adicionados %.2f dólares ao cofrinho!", escolhaValor);
			break;
		case 3:
			euro.valor += escolhaValor;
			System.out.printf("Foram adicionados %.2f euros ao cofrinho!", escolhaValor);
			break;
		default:
			System.out.println("Opção inválida!");
		}
	}
	
	public void remover(int escolhaMoeda, double escolhaValor) {
		switch(escolhaMoeda) {
		
		case 1:
			if(real.valor > escolhaValor) {
				real.valor -= escolhaValor;
				System.out.printf("Foram removidos %.2f reais ao cofrinho!", escolhaValor);
			}else {
				System.out.println("Você não pode remover um valor maior do que tem guardado!");
			}
			break;
		case 2:
			if(dolar.valor > escolhaValor) {
				dolar.valor -= escolhaValor;
				System.out.printf("Foram removidos %.2f dólares ao cofrinho!", escolhaValor);
			}else {
				System.out.println("Você não pode remover um valor maior do que tem guardado!");
			}
			break;
		case 3:
			if(euro.valor > escolhaValor) {
				euro.valor -= escolhaValor;
				System.out.printf("Foram removidos %.2f euros ao cofrinho!", escolhaValor);
			}else {
				System.out.println("Você não pode remover um valor maior do que tem guardado!");
			}
			break;
		default:
			System.out.println("Opção inválida!");
		}
	}
	
}
