package teste;

import java.util.Scanner;

public class cinema {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		String vetor[] = new String[10];
		String resp;
		int num_sele;
		int x;

		vetor[0] = "comprado0";
		vetor[1] = "comprado1";
		vetor[2] = "comprado2";
		vetor[3] = "";

		System.out.println("Qual assento deseja comprar?");
		num_sele = ler.nextInt();
		
		if(vetor[num_sele-1].isBlank()==false)
		{
			System.out.println("J� comprado!");
			System.out.println(vetor[num_sele-1]);
		}
		else
		{
			//pergunta se quer comprar 
			System.out.println("Deseja comprar esse assento?");
			resp = ler.nextLine();
			if(resp == "sim")
			{
				vetor[num_sele-1] = "vendido";
				System.out.println("Vendido!");
			}
		}
		for(x=0;x<9;x++)
		{
			System.out.println(vetor[x]);
		}
		
	}
}
