package exercicios_revisao;

import java.util.Scanner;

public class ex1 {

	public static void main(String[] args) {
		double preco_etiq,novopreco;
		int op;
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Qual o pre�o do produto?");
		preco_etiq = ler.nextDouble();
		System.out.println("Qual ser� a forma de pagamento?");
		System.out.println("1 - � VISTA (DINHEIRO OU CHEQUE) (20% DESCONTO)");
		System.out.println("2 - � VISTA (CART�O DE CR�DITO) (15% DESCONTO)");
		System.out.println("3 - 2X SEM JUROS");
		System.out.println("4 - 3X (10% JUROS)");
		op = ler.nextInt();
		
		switch (op) {
		case 1:
			novopreco = preco_etiq*0.80;
			System.out.printf("Novo pre�o: %2.2f",novopreco);
			break;
		case 2:
			novopreco = preco_etiq*0.85;
			System.out.printf("Novo pre�o: %2.2f",novopreco);
			break;
		case 3:
			novopreco = preco_etiq;
			System.out.printf("Novo pre�o: %2.2f",novopreco);
			break;
		case 4:
			novopreco = preco_etiq*1.1;
			System.out.printf("Novo pre�o: %2.2f",novopreco);
			break;

		default:
			System.out.println("Op��o inv�lida!");
			break;
		}
	}

}
