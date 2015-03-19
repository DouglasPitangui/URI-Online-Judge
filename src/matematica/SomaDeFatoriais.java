package matematica;

import java.util.Scanner;

public class SomaDeFatoriais {

	public static void main(String[] args) {
		Scanner scanner = new Scanner( System.in ); 
		
		while(scanner.hasNextLine()){
			int M = 0;
			int N = 0;
			long resultM = 1;
			long resultN = 1;
			
			String texto = scanner.nextLine();
			String[] result = texto.split(" ");

			M = Integer.parseInt(result[0]);
			N = Integer.parseInt(result[1]);
			
			if(M != 0){
				while(M>1){
					resultM = resultM * M;
					M--;
				}
			}
			
			if(N != 0){
				while(N>1){
					resultN = resultN * N;
					N--;
				}
			}
			
			System.out.printf(resultM+resultN+"\n");
		}
		
	}

}


