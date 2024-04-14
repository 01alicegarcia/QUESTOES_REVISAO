import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class GerenciadorEstoque {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, Produto> estoque = new HashMap<>();

        while (true) {
            System.out.println("\n=== Menu ===");
            System.out.println("1. Adicionar produto");
            System.out.println("2. Atualizar preco ou quantidade");
            System.out.println("3. Exibir detalhes de um produto");
            System.out.println("4. Sair");
            System.out.print("Escolha uma opcao:");
            int opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    adicionarProduto(estoque, scanner);
                    break;
                case 2:
                    atualizarProduto(estoque, scanner);
                    break;
                case 3:
                    exibirDetalhesProduto(estoque, scanner);
                    break;
                case 4:
                    System.out.println("Saindo do programa...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Opcao invalida. Tente novamente.");
            }
        }
    }

    public static void adicionarProduto(Map<String, Produto> estoque, Scanner scanner) {
        System.out.print("Digite o nome do produto: ");
        String nome = scanner.next();

        System.out.print("Digite o preco do produto: ");
        double preco = scanner.nextDouble();

        System.out.print("Digite a quantidade em estoque: ");
        int quantidade = scanner.nextInt();

        Produto produto = new Produto(nome, preco, quantidade);
        estoque.put(nome, produto);

        System.out.println("Produto adicionado com sucesso!");
    }

    public static void atualizarProduto(Map<String, Produto> estoque, Scanner scanner) {
        System.out.print("Digite o nome do produto: ");
        String nome = scanner.next();

        Produto produto = estoque.get(nome);
        if (produto == null) {
            System.out.println("Produto nao encontrado.");
            return;
        }

        System.out.println("Selecione o que deseja atualizar:");
        System.out.println("1. Preco");
        System.out.println("2. Quantidade em estoque");
        int opcao = scanner.nextInt();

        switch (opcao) {
            case 1:
                System.out.print("Digite o novo preco: ");
                double novoPreco = scanner.nextDouble();
                produto.setPreco(novoPreco);
                System.out.println("Preco atualizado com sucesso!");
                break;
            case 2:
                System.out.print("Digite a nova quantidade em estoque: ");
                int novaQuantidade = scanner.nextInt();
                produto.setQuantidadeEmEstoque(novaQuantidade);
                System.out.println("Quantidade em estoque atualizada com sucesso!");
                break;
            default:
                System.out.println("Opcao invalida. Tente novamente.");
        }
    }

    public static void exibirDetalhesProduto(Map<String, Produto> estoque, Scanner scanner) {
        System.out.print("Digite o nome do produto: ");
        String nome = scanner.next();

        Produto produto = estoque.get(nome);
        if (produto == null) {
            System.out.println("Produto nao encontrado.");
            return;
        }

        System.out.println("Detalhes do produto:");
        System.out.println("Nome: " + produto.getNome());
        System.out.println("Preco: R$" + produto.getPreco());
        System.out.println("Quantidade em estoque: " + produto.getQuantidadeEmEstoque());
    }
}

class Produto {
    
    private String nome;
    private double preco;
    private int quantidadeEmEstoque;

    
    public Produto(String nome, double preco, int quantidadeEmEstoque) {
        this.nome = nome;
        this.preco = preco;
        this.quantidadeEmEstoque = quantidadeEmEstoque;
    }

    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public int getQuantidadeEmEstoque() {
        return quantidadeEmEstoque;
    }

    public void setQuantidadeEmEstoque(int quantidadeEmEstoque) {
        this.quantidadeEmEstoque = quantidadeEmEstoque;
    }
}
