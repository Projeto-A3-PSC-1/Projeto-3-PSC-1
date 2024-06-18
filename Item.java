package a3.da.rafa;

// classe de gerenciamento de itens

public class Item {
    private String name;
    private int amount;
    private double price;
    String description;
    String size;

    public Item(String name, int amount, double price, String description,String size) {
        this.name = name;
        this.amount = amount;
        this.price = price;
        this.description = description;
        this.size = size;
    }

      /*get e set
Set atribui um valor 
        Get retorna o valor
                */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
    
    public String getDescription() {
        return description;
    }

    public void setDescription (String description) {
        this.description = description;
    }
    
    public String getSize() {
        return size;
    }

    public void setSize (String size) {
        this.size = size;
    }

    // retornando os atributos acima
    @Override
    public String toString() {
        return "Item{" +
                "nome='" + name + '\'' +
                ", quantidade=" + amount +
                ", preco=" + price +
                ", descriçao=" + description +
                ",tamanho=" + amount +
                '}';
    }
}
