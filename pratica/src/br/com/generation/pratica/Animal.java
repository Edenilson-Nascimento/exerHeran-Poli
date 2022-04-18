package br.com.generation.pratica;

public class Animal {

		private String especie;
		private String nome;
		private String emitirSom;
		private int idade;
		
		public String getEspecie() {
			return especie;
		}
		public void setEspecie(String especie) {
			this.especie = especie;
		}
		
		public String getNome() {
			return nome;
		}
		public void setNome(String nome) {
			this.nome = nome;
		}
		public String getEmitirSom() {
			return emitirSom;
		}
		public void setEmitirSom(String emitirSom) {
			this.emitirSom = emitirSom;
		}
		public int getIdade() {
			return idade;
		}
		public void setIdade(int idade) {
			this.idade = idade;
		}
		
		void imprimir() {
			System.out.println("Espécie: "+especie+" de nome: "+nome+ ", tem: "+idade+" anos de idade.");
			System.out.println("O som que ele emite é o: "+emitirSom);
			System.out.println("====================================");


		}

	

}
