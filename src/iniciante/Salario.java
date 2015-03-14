package iniciante;

import java.util.Scanner;

public class Salario {

	public static void main(String[] args) {
		Scanner scanner = new Scanner( System.in ); 
		
		int numero = scanner.nextInt();
		int horasTrabalhadas = scanner.nextInt();
		double valorPorHora = scanner.nextDouble();

		double salario  = horasTrabalhadas*valorPorHora; 
		
		System.out.printf("NUMBER = "+ numero+"\n");
		System.out.printf("SALARY = U$ %.2f\n", salario);

	}

}
