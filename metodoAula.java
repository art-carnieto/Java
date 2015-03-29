/* Aula Nakano 12-05-2014 */
class metodoAula {
	public static void main(String[] args){
		double A[];
		A = new double[100];
		A[0] = 12;
		for (int i=1; i<A.length; i++) {
			A[i] = A[i-1] + 1;
		}
		System.out.println (imprimeVetor (A));
	}
	static double[] imprimeVetor(double[] V) {
		for (int i=0; i<V.length; i++) {
			System.out.println (V[i]);
		}
	return V;
	}
}

/*Para vetores, utilizar V.length para saber o comprimento
Para saber o tamanho de uma matriz:
M.length = número de linhas
M[0].length = número de elementos na linha 0
*/