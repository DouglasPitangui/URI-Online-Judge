package matematica;

import java.util.Scanner;

public class Figurinhas {

	public static void main(String[] args) {
		Scanner scanner = new Scanner( System.in ); 			
		
		int N = scanner.nextInt();
		int aux = 0;
		int F = 0;
		int result[] = new int[N];
		for(int i=0; i<N;i++){
			int F1 = scanner.nextInt();
			int F2 = scanner.nextInt();
			
			if (F1>F2){
	            while(F2!=0){
	               aux = F1%F2;
	               F1 = F2;
	               F2 = aux;
	               F = F1;
	               }
	         }
	         if (F2>F1){
	            while(F1!=0){
	               aux = F2%F1;
	               F2 = F1;
	               F1 = aux;
	               F = F2;
	               }
	         }
			result[i] = F;
		}
		
		for(int i=0; i<N;i++){
			System.out.printf(result[i]+"\n");
		}
	}

}
