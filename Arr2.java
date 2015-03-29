/* Aula Nakano 10-05-2014 */
class Arr2 {
	public static void main (String[] args) {
		double[][] A;   //array de arrays de double (matriz)
		A = new double[50][]; 
		for (int i=0; i<50; i++) {
			A[i] = new double[500];
		}
		for (int i=0; i<50; i++) {
			for (int j=0; j<500; j++) {
				System.out.print (A[i][j] + " "); //sem o "ln" no print ele imprime linhas e colunas, não somente linhas
			}
		System.out.println (" ");
		}
	}
}