/* Aula Nakano 10-05-2014 */
class Arr {
	public static void main (String[] args) {
		double[] A;   //array de double
		double[] B;
		A = new double[100]; //"separa" um espaço na memória que cabe 100 doubles
		B = A; //B e A referenciam a msm memória
		A[0] = 5;
		for (int i=1; i<100; i++) {
			A[i] = A[i-1] * 1.06;
			for (int i=0; i<100; i++) {
				System.out.println (B[i]);
			}
		}
		B[5]=300;
		System.out.println (A[5]);
	}
}