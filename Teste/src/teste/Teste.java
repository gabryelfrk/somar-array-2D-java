package teste;

public class Teste {

	public static void main(String[] args) {
		// Cria 2 array 2D
		int a[][] = { {1, 3, 4}, {6, 4, 5} }; 
		int b[][] = { {1, 3 ,7}, {9, 4 ,2} };
		
		// Matriz para armazenar a soma das duas matrizes
		int c[][] = new int [2][3];
		
		for (int i=0; i <2; i++) {
			for (int j=0; j<3; j++) {
				c[i][j] = a[i][j] + b[i][j];
				
				System.out.print(c[i][j] + " ");
			}
			
			System.out.println();
		}
	}

}
