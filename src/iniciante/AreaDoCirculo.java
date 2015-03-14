package iniciante;
import java.util.Scanner;


public class AreaDoCirculo {

	public static void main(String[] args) {
		Scanner scanner = new Scanner( System.in ); 
		
		double raio = scanner.nextDouble();
		double area = (double) (3.14159*(raio*raio));
		
		System.out.printf("A=%.4f\n", area);
	}

}
