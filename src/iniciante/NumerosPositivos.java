package iniciante;

import java.util.Scanner;

public class NumerosPositivos {

	public static void main(String[] args) {
	     
	      Scanner entrada = new Scanner(System.in);
	      int p = 0 ;
	      double vetor[] = new double[6];
	      
	      for(int c = 0 ; c <6 ; c++){
	         vetor[c] = entrada.nextDouble() ;
	         if(vetor[c]>=0){
	            p++ ;
	         }
	      }
	
	      System.out.printf("%d valores positivos\n", (p));

	}

}
