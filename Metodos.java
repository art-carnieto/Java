class Metodos {
// faça o teste de mesa
// escreva literalmente o que ele escreve na tela
	public static void main(String[] args){
		int base=15;
		int numero= 5940;
		int resto;
		System.out.println (converte(numero,base));
		
		base=7;
		numero=40;
		
		System.out.println (converte(numero,base));
	}
	static String converte (int numero, int base) {
		int resto;
		String resultado="";
		while (numero>0) {
			resto=numero % base;
			numero=numero /base;
			resultado = resto + " " + resultado;
		}
		return resultado;
	}
}