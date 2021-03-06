
public class Aula05062016 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		float[][] valores = {
				{-1, 2, 33, 4, 10, 6, 21, -210}, 
				{2, 1, 2, 3, 7, 4, 7, 4},
				{25, 11, 21, 53, 37, 6, 37, 6},
				{3, 2, 1, 2, 6, 31, 6, 31}, 
				{4, 3, 2, 1, 5, 7, 5, 7},
				{7, 1, 2, 1, 2, 7, 2, 7},
				{0, 32, 52, 6, 9, 7, 6, 9},
		};
		
		int m = 0;
		while( m < valores.length ) {
			for (int i = m + 1; i < valores.length; i++) {
				float multiplicador = valores[i][m] / valores[m][m];
				for (int j = 0; j < valores[i].length; j++) {
					float r = valores[i][j] - (multiplicador * valores[m][j]);
					
					valores[i][j] = r;
				}
			}
			m++;
		}
		
		for (int i = 0; i < valores.length; i++) {
			for (int j = 0; j < valores[i].length; j++) {
				System.out.print(valores[i][j] + ", ");
			}
			System.out.println();
		}
		
	}
}
