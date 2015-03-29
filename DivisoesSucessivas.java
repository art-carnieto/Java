class DivisoesSucessivas {
// faça o teste de mesa
// escreva literalmente o que ele escreve na tela
	public static void main(String[] args){
		int base=2;
		int numero= 621;
		int resto;
		String resultado="";
		while (numero>0) {
			resto=numero % base;
			numero=numero /base;
			resultado = resto + " " + resultado;
		}
		System.out.println (resultado);
	}
}
// ? como converter um "binário" em decimal?
// ? você tem R$10000 na cardeneta de poupança que rende 0.5% ao mês