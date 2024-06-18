package a3.da.rafa;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Gerenciador gerenciador = new Gerenciador();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1. Adicionar novo item ao estoque");
            System.out.println("2. Exibir lista de itens no estoque");
            System.out.println("3. Calcular valor total do estoque");
            System.out.println("4. Sair");
            System.out.print("Escolha uma opção: ");

            int opcao = scanner.nextInt();
            scanner.nextLine(); // consumir a nova linha

            // switch case para selecionar a opção do menu
            switch (opcao) {
                case 1 -> {
                    System.out.println("Escolha a categoria do item:");
                    System.out.println("1. Celular");
                    System.out.println("2. PC");
                    System.out.println("3. Consoles");
                    int categoria = scanner.nextInt();
                    scanner.nextLine(); // consumir a nova linha

                    System.out.print("Nome: ");
                    String name = scanner.nextLine();
                    System.out.print("Descrição: ");
                    String description = scanner.nextLine();
                    System.out.print("Tamanho: ");
                    String size = scanner.nextLine();
                    System.out.print("Quantidade: ");
                    int amount = scanner.nextInt();
                    System.out.print("Preço: ");
                    double price = scanner.nextDouble();
                    scanner.nextLine(); // consumir a nova linha
                    
                    Item item = null; // inicializa item como null

                    switch (categoria) {
                        case 1 -> {
                            System.out.print("Marca: ");
                            String marcaCelular = scanner.nextLine();
                            item = new Celular(name, description, size, amount, price, marcaCelular);
                        }
                        case 2 -> {
                            System.out.print("Marca: ");
                            String marcaPC = scanner.nextLine();
                            item = new PC(name, amount, price, description, size, marcaPC);
                        }
                        case 3 -> {
                            System.out.print("Marca: ");
                            String marcaConsoles = scanner.nextLine();
                            System.out.print("Jogos: ");
                            String jogos = scanner.nextLine();
                            item = new Consoles(name, description, size, amount, marcaConsoles, jogos, price);
                        }
                        default -> {
                            System.out.println("Categoria inválida!");
                            continue;
                        }
                    }

                    gerenciador.adicionarItem(item);
                    System.out.println("Item adicionado com sucesso!");
                }
                case 2 -> {
                    System.out.println("Itens no estoque:");
                    gerenciador.listarItens();
                }
                case 3 -> {
                    double valorTotal = gerenciador.calcularValorTotalEstoque();
                    System.out.printf("Valor total do estoque: R$ %.2f%n", valorTotal);
                }
                case 4 -> {
                    System.out.println("Saindo...");
                    scanner.close();
                    return;
                }
                default -> System.out.println("Opção inválida!");
            }
        }
    }
}
