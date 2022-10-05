package br.com.java.nelio;

import java.io.IOException;
import java.util.Scanner;

public class questao21 {
	public static void main(String[] args) throws IOException {

		try (Scanner br = new Scanner(System.in)) {
			int num = br.nextInt();

			for (int i = 0; i < num; i++) {

				double x1 = br.nextDouble();
				double x2 = br.nextDouble();
				double x3 = br.nextDouble();
				
				double media = ( x1 * 2.0 + x2 * 3.0 + x3 * 5.0 ) / 10;
				System.out.println(media);

				br.close();

			}
		}
	}

}
