/*
Crie uma um programa para trabalhar com estoque de uma loja, o programa dever�
trabalhar com Collection do tipo List do Java para manipular os dados desse estoque, o
programa dever� atender as seguintes funcionalidades:
Armazenar dados da List
Remover dados da list;
Atualizar dados da list.
Apresentar todos os dados da list.
*/

package exs_polimorfismo_collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Scanner;

public class collection_loja {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		String nomeprod;
		int x = 1;
		Collection<String> produtos = new ArrayList<String>();

		do {
			System.out.println("Qual o nome do produto?");
			nomeprod = ler.nextLine();
			produtos.add(nomeprod);

			System.out.printf("Deseja inserir outro produto? Se sim tecle '1', se n�o tecle '2'");
			x = ler.nextInt();
		} while (x == 1);

		System.out.println(produtos);
	}
}
