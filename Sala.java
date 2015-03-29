public class Sala {
	Carteira[] s;
	void encheSala () {
		s = new Carteira [50];
		for (int i=0; i<s.length; c++) {
			s[i] = new Carteira();
			s[i].pesoMaxSuportado = i*10;
}

// objetivo: varre o array de carteiras e escolhe uma que suporta o peso