package br.com.generation.pratica;

public class TestarAnimal {

	public static void main(String[] args) {
		 Cachorro an1 = new Cachorro();
		 Cavalo an2 = new Cavalo();	 
		 Preguiça an3 = new Preguiça();
		
		
			an1.setEspecie("Cachorro");
			an1.setNome("Bob");
			an1.setIdade(8);
			an1.setEmitirSom("AU AU AU");
			an1.setCorrer("Corre");
			an1.imprimir();
			
			an2.setEspecie("Cavalo");
			an2.setNome("Spirit");
			an2.setIdade(6);
			an2.setEmitirSom("hiiiihihihihi");
			an2.setCavalgar("Cavalga");
			an2.imprimir();

			an3.setEspecie("Preguiça");
			an3.setNome("Ton");
			an3.setIdade(3);
			an3.setEmitirSom("iiiiii");
			an3.setPendurar("Sobe em árvores.");
			an3.imprimir();

	}

}
