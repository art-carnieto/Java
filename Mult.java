public class Mult {
	public static void main (String[] arg) {
		int num=124412, div;
		String res="1";
		for (div=2;num % div == 0;div++) {
			num=num / div;
			res=res + ", " + div;
		}
		System.out.println ("Os divisores de " + num + " sao: " + res);
	}
}