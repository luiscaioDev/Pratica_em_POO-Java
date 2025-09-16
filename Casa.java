package classes;

public class Casa {
	 
	String cor;
	int numero;
	int qtdQuartos;

public Casa (String cor, int numero, int qtdQuartos) {
	
	this.cor = cor;
	this.numero = numero;
	this.qtdQuartos = qtdQuartos;
}

public void abrirPorta () {
	
	System.out.println("A casa de numero " + numero + " abriu a porta.");
}

public void mostrarCasa () {
	
	System.out.println("A casa da cor " + cor + " e tem " + qtdQuartos + " quartos na casa.");
}

public static void main(String []args) {
	
	Casa casa1 = new Casa ("Branca", 103, 3);
	casa1.abrirPorta();
	casa1.mostrarCasa();
}
}
