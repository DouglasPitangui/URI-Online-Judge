/**
 * Neste problema deve-se ler o c�digo de uma pe�a 1, o n�mero de pe�as 1,
 * o valor unit�rio de cada pe�a 1, o c�digo de uma pe�a 2, o n�mero de pe�as 2,
 * o valor unit�rio de cada pe�a 2 e calcula e mostra o valor a ser pago.
 */
package iniciante;

import java.util.Scanner;

public class SalarioComBonus {

	public static void main(String[] args) {
		Scanner scanner = new Scanner( System.in ); 
		
		int codigo1 = scanner.nextInt();
		int qtd1 = scanner.nextInt();
		double valorInitario1 = scanner.nextDouble();
		
		int codigo2 = scanner.nextInt();
		int qtd2 = scanner.nextInt();
		double valorInitario2 = scanner.nextDouble();

		double valorPago  = qtd1*valorInitario1 + qtd2*valorInitario2; 
		
		//System.out.printf("NUMBER = "+ numero+"\n");
		System.out.printf("VALOR A PAGAR: R$ %.2f\n", valorPago);

	}

}
