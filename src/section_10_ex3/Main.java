package section_10_ex3;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int linha = sc.nextInt();
		int coluna = sc.nextInt();
		sc.nextLine();
		
		int[][] matriz = new int[linha][coluna];
		
		for (int i = 0; i < linha; i++) {
			for (int j = 0; j < coluna; j++) {
				matriz[i][j] = sc.nextInt();
			}
			
			sc.nextLine();
		}
		
		int numberToSearch = sc.nextInt();
		sc.nextLine();
		
		for (int i = 0; i < linha; i++) {
			for (int j = 0; j < coluna; j++) {
				if (matriz[i][j] == numberToSearch) {
					System.out.println("Position " + i + "," + j);
					imprimeValoresAdjacentes(i, j, matriz, coluna);
				}
			}
		}
		
		sc.close();
	}
	
	public static void imprimeValoresAdjacentes(int linha, int coluna, int[][] matriz, int tamanhoColuna) {
		if (coluna > 0) {
			System.out.println("Left: " + matriz[linha][coluna - 1]);
		}
		if (linha > 0) {
			System.out.println("Up: " + matriz[linha - 1][coluna]);
		}
		if (coluna + 1 < matriz[linha].length) {
			System.out.println("Right: " + matriz[linha][coluna + 1]);
		}
		if (linha + 1 < tamanhoColuna) {
			System.out.println("Down: " + matriz[linha + 1][coluna]);
		}
	}
}
