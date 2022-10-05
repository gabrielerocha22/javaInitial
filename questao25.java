package br.com.java.nelio;

import java.io.IOException;
import java.util.Scanner;

public class questao25 {
	public static void main (String [] args) throws IOException {
		try (Scanner br = new Scanner (System.in)) {
			
			int n = br.nextInt();
			for (int i =1; i <= n; i++) {
				int valor1 = i;
				int valor2 = i*i;
				int valor3 = i*i*i;
				
				System.out.printf("%d, %d, %d%n",valor1, valor2, valor3);
			}
		}
	}
}
