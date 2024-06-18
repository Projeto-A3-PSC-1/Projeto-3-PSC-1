package a3.da.rafa;
// Abrindo uma subclasse referente a acessorios para celulares

public class Celular extends Item{
private String marca;
    
    public Celular(String name, String description, String size, int amount, double price, String marca) {
 super (name, amount, price, description, size);
        this.marca = marca;
    }
    /*get e set
Set atribui um valor 
        Get retorna o valor
                */
    public void setMarca (String marca){
        this.marca = marca;
    }
    public String getMarca(){
        return marca;
    }
    // vamos retornar os atributos
@Override
    public String toString(){
        return "Celular{" +
                "nome='" +getName() + '\'' +
        ",quantidade=" +getAmount() +
                ",preço=" + getPrice() +
                ", marca='" + marca + '\'' +
                '}';
    }
    
}
