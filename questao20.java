package br.com.java.nelio;

import java.io.IOException;
import java.util.Scanner;

public class questao20 {
	public static void main(String[] args) throws IOException {
		try (Scanner br = new Scanner(System.in)) {
			int num = br.nextInt();
			
			int in = 0;
			int out = 0;
			
			for (int i = 0; i < num; i++) {
				int x = br.nextInt();
				if ( x >= 10 && x <= 20) {
					in = in +1;
				}
				else { 
					out = out +1;
				}
			}

			System.out.println(in + " in");
			System.out.println(out + " out");
			
			br.close();
		}

	}
}
