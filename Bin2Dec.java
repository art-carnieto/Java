class Bin2Dec {
	public static void main (String[] args) {
		int i=0, n=10, p=1, base=2;
		int numeroBin=101101, numeroDec=0, digito;
		int nBin=numeroBin;
		while (i<=n) {
			System.out.println(i + " " + p);
			i++;
			// separa digito, somar no numeroDec
			digito=numeroBin % 10;
			numeroBin=numeroBin/10;
			numeroDec=numeroDec+digito*p;
			p=p*base;	//b elevado a i
		}
	System.out.println (nBin + " = " + numeroDec);
	}
}

//PG (progressão geométrica):  Pn = base * P(n-1), sendo P0 = 1
//recursos usados sem o math.pow (biblioteca de comandos de cálculo do java)