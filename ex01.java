package ifElse;
import java.util.Scanner;

public class ex01 
{
	public static void main (String arg[])
	{
		Scanner leia = new Scanner(System.in);
		int n1, n2, n3, maior=0;
		
		System.out.println("Escreva o primeiro número: ");
		n1 = leia.nextInt();
		
		System.out.println("Escreva o segundo número: ");
		n2 = leia.nextInt();
		
		System.out.println("Escreva o terceiro número: ");
		n3 = leia.nextInt();
		
		if (n1 > n2) 
		{
			maior = n1;
		}
		
		else 
		{
			maior = n2;
		}
		
		if (n3 > n2 && n3 > n1)
		{
			maior = n3;
		}
		
		System.out.println("O maior número digitado é: " + maior + ".");
				
	}
}