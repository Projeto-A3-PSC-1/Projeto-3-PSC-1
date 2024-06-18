package a3.da.rafa;

import java.util.ArrayList;
import java.util.List;

public class Gerenciador {
    private final List<Item> itens;

    public Gerenciador() {
        this.itens = new ArrayList<>();
    }

    // Método para adicionar um item ao estoque
    public void adicionarItem(Item item) {
        itens.add(item);
    }

    // Método para listar todos os itens no estoque
    public void listarItens() {
        for (Item item : itens) {
            System.out.println(item);
        }
    }

    // Método para calcular o valor total do estoque
    public double calcularValorTotalEstoque() {
        double total = 0;
        for (Item item : itens) {
            total += item.getPrice() * item.getAmount();
        }
        return total;
    }
}
