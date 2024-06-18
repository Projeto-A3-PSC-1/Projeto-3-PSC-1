package a3.da.rafa;

// Subclasse de videogames
public class Consoles extends Item {
    private String marca;
    private String jogos;

    public Consoles(String name, String description, String size, int amount, String marca, String jogos, double price) {
        super(name, amount, price, description, size);
        this.marca = marca;
        this.jogos = jogos;
    }

    // Getters e Setters
    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getMarca() {
        return marca;
    }

    public void setJogos(String jogos) {
        this.jogos = jogos;
    }

    public String getJogos() {
        return jogos;
    }

    // Retornando os atributos
    @Override
    public String toString() {
        return "Video Game{" +
                "nome='" + getName() + '\'' +
                ", quantidade=" + getAmount() +
                ", preço=" + getPrice() +
                ", marca='" + marca + '\'' +
                ", jogos='" + jogos + '\'' +
                '}';
    }
}
