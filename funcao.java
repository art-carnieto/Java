public class funcao {
	public static void main (String[] args) {
/*
		double a, b, x, y;
		a=5.0;
		b=7.6;
		x=5;
		y=a*x+b;
		System.out.println (y);
		x=7.0;
		y=a*x+b;
		System.out.println (y);
		System.out.println (f(8.5));
		System.out.println (f(3.7));
*/
		int i=0;
		double x=0.0;
		while (f(x)>=0.0) {
			System.out.println ("f(" + x + ")=" + f(x));
			x=x-0.02;
		}
		System.out.println ("f(" + x + ")=" + f(x));
	}
	static double f (double z) { // 5*z+7.6
		double a, b;
		a=5.0;
		b=7.6;
		return a*z+b;
	}
}