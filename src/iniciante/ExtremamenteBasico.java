package iniciante;

import java.util.Scanner;


public class ExtremamenteBasico {

	public static void main(String[] args) {
        int A, B, X;
        Scanner scanner = new Scanner( System.in ); 
         
        A = scanner.nextInt();
        B = scanner.nextInt();
         
        X = A + B;
         
        System.out.printf("X = "+ X+"\n");
	}

}
