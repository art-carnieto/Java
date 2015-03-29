class Tela {
	static int[][] T;

	static int f(int x) {
		return (x^2)-x;
	}

	static void desenha (int[][] A) {
		int w = 0;        					// Aqui y = linha e x = coluna
		for (int x=0; x < 1920; x++) {		// Não consegui usar length para obter o nº 1920
			w = f(x);
			for (int y=0;y < A.length; y++){
				if (w>=0 && w < A[y].length) {
					// A[y][x] = 1;
					System.out.print ("1 ");
				}
				else System.out.print ("0 ");
			}
		}
	}
	public static void main (String[] args) {
	T=new int[1080][1920]; // T é uma tela preta
	desenha(T);
	}
}