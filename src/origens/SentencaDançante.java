package origens;


import java.io.IOException;
import java.util.Scanner;

public class SentencaDançante {

	public static void main(String[] args) throws IOException {
		
		Scanner scanner = new Scanner( System.in ); 
		
		while(scanner.hasNextLine()){
			String texto = scanner.nextLine();
			String resultado = "";
			int i = 0;
			int aux = 1;
			
			if(texto.length() ==1){
					System.out.printf("%s\n", texto.toUpperCase());
			}else{
			
				//string para comparação com todo o texto maiusculo
				String comparacao = texto.toUpperCase();
				
				//busca a posição da primeira string
				while(texto.charAt(i)==' '){
					i++;
				}
				
				//insere os espaços encontrados antes da primeira string
				for(int k = 0; k<i;k++){
					resultado+=" ";
				}
				
				resultado+= comparacao.charAt(i);	
				
				//loop para inserir as demais letras de forma que alterne entre maiusculo e minusculo
				for(int l = i;l<texto.length()-1; l++){
					if(texto.charAt(l+1) != ' '){
						if(aux == 1){
							resultado+= texto.toLowerCase().charAt(l+1);
							aux = 0;
						}else{
							resultado+= texto.toUpperCase().charAt(l+1);
							aux = 1;
						}
					}else{
						resultado +=" ";
					}
								
				}
				
				resultado +="\n";
		}
			System.out.print(resultado);
		}
	
	}
}
