package classes;

public class Celular {
    String marca;
    String modelo;
    int bateria;

    public Celular(String marca, String modelo, int bateria) {
        this.marca = marca;
        this.modelo = modelo;
        this.bateria = bateria;
    }

    public void ligar() {
        System.out.println("O celular " + modelo + " está ligando...");
    }

    public void exibirStatus() {
        System.out.println("Marca: " + marca + ", Modelo: " + modelo + ", Bateria: " + bateria + "%");
    }

    public static void main(String[] args) {
        Celular cel1 = new Celular("Samsung", "Galaxy S21", 85);
        cel1.ligar();
        cel1.exibirStatus();
    }
}
