class DivisoesSucessivas {
// fa�a o teste de mesa
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
// ? como converter um "bin�rio" em decimal?
// ? voc� tem R$10000 na cardeneta de poupan�a que rende 0.5% ao m�s