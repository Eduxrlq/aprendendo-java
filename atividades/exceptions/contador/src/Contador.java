
import java.util.Scanner;

import exception.ParametrosInvalidosException;



   public class Contador {
	public static void main(String[] args) {
		Scanner terminal = new Scanner(System.in);
		System.out.println("Digite o primeiro parâmetro");
		int parametroUm = terminal.nextInt();
		System.out.println("Digite o segundo parâmetro");
		int parametroDois = terminal.nextInt();
		
		try {
			contar(parametroUm, parametroDois);
		
		}catch (ParametrosInvalidosException exception) {
			System.out.println(exception.getMessage());
		}
		
	}
	static void contar(int parametroUm, int parametroDois ) throws ParametrosInvalidosException {
		if(parametroUm > parametroDois)
		{
			throw new ParametrosInvalidosException("O 1° parâmetro tem que ser maior que o 2°!");
		}
		
		int contagem;
		for(contagem = parametroDois - parametroUm; contagem <= parametroDois; contagem++){
			System.out.println(contagem);

		}
	}
	
}

