// Aula dia 30.05.2014
// link apt-get jdk 1.8u5 -> http://www.ubuntuupdates.org/ppa/webupd8_java
// Pegar slides em http://nakano.pro.br/

class Reservas {
	consulta
	reserva //metodos
	cancela
	edita

	Passagem[] P;
	Clientes[] C;
	Voo[] V;
}

class Voo {
	String dataHora;
	String origem;
	String destino;
}

class Cliente {
	String nome;
	String endereco;
	int ID;
}

class Passagem {
	Cliente C;
	Voo v;
}

//testaCliente

Cliente c= newCliente();
c.nome = "Victor";
i.endereco = "UNICID";

class Cliente {
	String nome;				//Padrão de projeto
	String getNome() {			//getter/setter
		return nome;
	}
	void setNome (String novoNome) {
		nome=novoNome;
	}
}


public static void main (String[] args) {
	Passagem P;
	p=new Passagem();
	Cliente c;
	c = new Cliente();
	c.nome = "Lucas";
	p.c = c;
}
