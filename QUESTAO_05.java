import java.util.Scanner;

public class Produto {

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

    public double getPreco() {
        return preco;
    }

    public int getQuantidadeEmEstoque() {
        return quantidadeEmEstoque;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        Produto produto1 = new Produto("Creme", 24.99, 200);
        Produto produto2 = new Produto("Perfume", 99.99, 45);
        Produto produto3 = new Produto("Vestido", 79.99, 50);

        
        System.out.println("Produto 1:");
        exibirDetalhesProduto(produto1);

        System.out.println("Produto 2:");
        exibirDetalhesProduto(produto2);

        System.out.println("Produto 3:");
        exibirDetalhesProduto(produto3);

        scanner.close();
    }

    public static void exibirDetalhesProduto(Produto produto) {
        System.out.println("Nome: " + produto.getNome());
        System.out.println("Preco: R$" + produto.getPreco());
        System.out.println("Quantidade em Estoque: " + produto.getQuantidadeEmEstoque());
    }
}
