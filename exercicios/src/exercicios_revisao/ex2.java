package exercicios_revisao;

import java.util.Scanner;

public class ex2 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		double altura, peso, imc;
		
		System.out.println("Qual seu peso?");
		peso = ler.nextDouble();
		System.out.println("Qual sua altura?");
		altura = ler.nextDouble();
		
		imc = peso/(altura*altura);
		
		System.out.printf("Seu imc �: %2f",imc);
		System.out.println();
		if(imc<18.5)
		{
			System.out.println("Abaixo do peso");
		}
		else if(imc>=18.5 && imc<=25)
		{
			System.out.println("Peso normal");
		}
		else if(imc>25 && imc<=30)
		{
			System.out.println("Acima do peso");
		}
		else if(imc>30)
		{
			System.out.println("Obeso");
		}
	}

}
