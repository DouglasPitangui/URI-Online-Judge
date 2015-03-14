package iniciante;

import java.util.Scanner;

public class Consumo {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int X = scanner.nextInt(); // distancia
		double Y = scanner.nextDouble(); //combustivel
		
		double consumo = X/Y;
		System.out.printf("%.3f", consumo);
		System.out.printf(" km/l\n");

	}

}
