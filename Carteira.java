/* Pesquisar no Google "busca bin�ria". Opera��es de busca com log para buscar s�o extremamente
eficientes:
log(2)n = k		k	|	n
			0	|	1
			1	|	2
			2	|	4
			3	|	8
			.	|	.
			16	|	~65000
			.	|	.
			32	|	~2*(10^9)

ex: usando 32 opera��es pode-se buscar em aproximadamente 2*(10^2) (dois gigas) elementos.

Objetos - 	atributos (vari�veis)		ex: carteiras
			m�todos						-peso
										-cor
										-volume
										-lado
										-pesoMaxSuportado
										-material
							

*/

public class Carteira {
		double peso;
		String cor;
		double volume;
		boolean lado;
		double pesoMaxSuportado;
		int material;
		
	public static void main (String[] args) {
		Carteira C;
		C = new Carteira();
		C.cor = "azul";
		C.peso = 5.0;
		C.pesoMaxSuportado = 120;
		C.suportaPeso (77);
		System.out.println (C.cor);
	}
							
	double densidade () {
		return peso/volume;
	}							
							
	boolean suportaPeso (double carga) {
		return pesoMaxSuportado >= carga;
	}
	
}