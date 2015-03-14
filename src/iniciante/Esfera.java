package iniciante;

import java.util.Scanner;

public class Esfera {

	public static void main(String[] args) {
		Scanner scanner = new Scanner( System.in ); 
		
		int R = scanner.nextInt();
		double VOLUME = (4.0/3)*3.14159*R*R*R;
		System.out.printf("VOLUME = %.3f\n", VOLUME);
	}

}
