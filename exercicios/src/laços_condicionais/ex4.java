package la�os_condicionais;
import java.util.*;
public class ex4 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		double x;
		
		System.out.println("Entre com um n�mero");
		x = ler.nextInt();
		
		if(x%2==0)
		{
			System.out.println("Este n�mero � par");
			x = Math.sqrt(x);
			System.out.println(x);
		}
		else
		{
			System.out.println("Este n�mero � �mpar");
			x = Math.pow(x, 2);
			System.out.println(x);
		}

	}

}
