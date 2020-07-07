package ifElse;
import java.util.Scanner;

public class ex03 {
	public static void main (String arg[])
	{
		Scanner leia = new Scanner (System.in);
		int idade;
		
		System.out.println("Digite sua idade: ");
		idade = leia.nextInt();
		
		if (idade >= 10 && idade <= 14)
		{
			System.out.println("Sua categoria é INFANTIL.");
		}
		
		else if (idade >= 15 && idade <= 17)
		{
			System.out.println("Sua categoria é JUVENIL.");
		}
		
		else if (idade >= 18 && idade <= 25)
		{
			System.out.println("Sua categoria é ADULTO.");
		}
		
		else 
		{
			System.out.println("Sua idade é inválida.");
		}
		
	}

}
