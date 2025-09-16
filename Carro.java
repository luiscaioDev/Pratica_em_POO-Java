package classes;

public class Carro {
    String marca;
    String modelo;
    int ano;

    public Carro(String marca, String modelo, int ano) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
    }

    public void buzinar() {
        System.out.println("O carro " + modelo + " buzinou: BEEP BEEP!");
    }

    public void detalhes() {
        System.out.println("Carro da marca " + marca + ", modelo " + modelo + ", ano " + ano);
    }

    public static void main(String[] args) {
        Carro carro1 = new Carro("Toyota", "Corolla", 2020);
        carro1.buzinar();
        carro1.detalhes();
    }
}