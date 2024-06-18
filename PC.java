package a3.da.rafa;
// Sub classe PC (computador)
public class PC extends Item {
    private String marca;

    public PC(String name, int amount, double price, String marca, String description, String size) {
        super(name, amount, price, description, size);
        this.marca = marca;
    }

      /*get e set
Set atribui um valor 
        Get retorna o valor
                */
    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getMarca() {
        return marca;
    }

    // Retornando os atributos
    @Override
    public String toString() {
        return "Computador{" +
                "nome='" + getName() + '\'' +
                ", quantidade=" + getAmount() +
                ", preço=" + getPrice() +
                ", descrição='" + getDescription() + '\'' +
                ", tamanho='" + getSize() + '\'' +
                ", marca='" + marca + '\'' +
                '}';
    }
}
