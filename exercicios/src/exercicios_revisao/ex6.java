package exercicios_revisao;

import java.util.Scanner;

public class ex6 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int vetor[]=new int[3]; 
		int matriz[][]=new int[3][3];
		int matrizR[][]=new int[3][3];
		int lin,col,i;
		
		//preenche vetor
		for ( i = 0; i < vetor.length; i++)
		{
			System.out.println("Digite um n�mero para o vetor:");
			vetor[i] = ler.nextInt();
		}
		
		//mostra vetor
		for ( i = 0; i < vetor.length; i++)
		{
			System.out.printf("%d \t",vetor[i]);
		}
		System.out.println();
		System.out.println();
		
		//preenche matriz
		for(lin=0;lin<3;lin++)
		{
			for(col=0;col<3;col++)
			{
				System.out.println("Digite um n�mero para a matriz");
				matriz[lin][col]=ler.nextInt();
				i=0;
				matrizR[lin][col]= matriz[lin][col]*vetor[i];
				i++;
			}
		}
		
		//mostra matriz
		for(lin=0;lin<3;lin++)
		{
			for(col=0;col<3;col++)
			{
				System.out.printf("%d \t",matriz[lin][col]);
			}
			System.out.println();
		}
		System.out.println();
		System.out.println();

		//mostra matriz
		for(lin=0;lin<3;lin++)
		{
			for(col=0;col<matrizR.length;col++)
			{
				System.out.printf("%d \t",matrizR[lin][col]);
			}
			System.out.println();
		}
		
	
	}

}
