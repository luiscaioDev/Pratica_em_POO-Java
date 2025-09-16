package classes;

public class Cachorro {
	String nome;
	String raca;
	int idade;

	public Cachorro (String nome, String raca, int idade) {

	this.nome = nome;
	this.raca = raca;
	this.idade = idade;
	}	
	
	public void latir () {
		
		System.out.println("Minha cachorra " + nome + ", latiu assim: AUAUAU");	
	}
	
	public void apresentar () {
		
		System.out.println(nome + " tem " + idade + " anos de idade, e é da raça " + raca);
	}
	public static void main(String[] args) {
		
		Cachorro cachorro1 = new Cachorro ("Pandora", "Pitbull", 5);
		cachorro1.latir();
		cachorro1.apresentar();
	}
}