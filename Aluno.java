package classes;

	public class Aluno {
	
	String nome;
	int idade;
	int turma;

	public Aluno(String nome, int idade, int turma) {
	
	this.nome = nome;
	this.idade = idade;
	this.turma = turma; 

}

	public void identidade() {
	 
	System.out.println("Nome: " + nome);
	System.out.println("idade: " + idade);
	System.out.println("Turma: " + turma);
	
}

	public static void main (String[] agrs) {
	
	Aluno aluno1 = new Aluno ("Luís Caio", 19, 48);
	aluno1.identidade();
	
}

}