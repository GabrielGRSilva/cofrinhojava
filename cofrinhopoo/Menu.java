package cofrinhopoo;

public class Menu {
	public static void menu(){
	System.out.println("Digite uma das opções abaixo:");
	System.out.println("1 - ADICIONAR moeda\n2 - REMOVER moeda\n3 - LISTAR moedas\n4 - CALCULAR total (em BRL Reais)\n0 - ENCERRAR");
	}
	
	public static void escolhaMoeda() {
		System.out.println("Qual moeda você quer adicionar?");
		System.out.println("1 - Reais\n2 - Dólares\n3 - Euros");
	}
	
	public static void escolhaRemover() {
		System.out.println("Qual moeda você quer remover?");
		System.out.println("1 - Reais\n2 - Dólares\n3 - Euros");
	}
	
	public static void escolhaValor() {
		System.out.println("Qual o valor da moeda?");
		System.out.println("1 - 0,10\n2 - 0,25\n3 - 0,50\n4 - 1,00");
	}
}
