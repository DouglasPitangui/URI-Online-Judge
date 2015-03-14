package iniciante;

import java.util.Scanner;

public class OMaior {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		int c = scanner.nextInt();
		
		int MaiorAB = (a+b+ Math.abs(a-b))/2;
		int maior = (MaiorAB+c+ Math.abs(MaiorAB-c))/2;
		
		System.out.printf(maior+" eh o maior\n");
		

	}

}
