package teste;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintStream;
import java.util.Scanner;


public class teste {

	public static void main(String[] args) throws IOException {
		
		int i = 0;
		Scanner entrada = new Scanner(System.in);
		System.out.print("Digite um texto:");
		while(entrada.hasNextLine()){
			  String linha = entrada.nextLine();
			  System.out.println(linha);
		} 
		entrada.close(); //Encerra o programa

	  }
}
