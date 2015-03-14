/**
 * Neste problema deve-se ler o código de uma peça 1, o número de peças 1,
 * o valor unitário de cada peça 1, o código de uma peça 2, o número de peças 2,
 * o valor unitário de cada peça 2 e calcula e mostra o valor a ser pago.
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
