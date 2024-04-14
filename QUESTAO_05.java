import java.util.Scanner;

public class Produto {

    private String nome;
    private double preco;
    private int quantidadeEmEstoque;

    
    public Produto(String nome) {
        this.nome = nome;
        this.preco = 0.0;
        this.quantidadeEmEstoque = 0;
    }

    
    public Produto(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
        this.quantidadeEmEstoque = 0;
    }


    public Produto(String nome, double preco, int quantidadeEmEstoque) {
        this.nome = nome;
        this.preco = preco;
        this.quantidadeEmEstoque = quantidadeEmEstoque;
    }

    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        Produto produto1 = new Produto("Vestido");
        Produto produto2 = new Produto("Perfume", 100.00);
        Produto produto3 = new Produto("Bolsa", 124.99, 100);

        
        System.out.println("Produto 1:");
        exibirDetalhesProduto(produto1);

        System.out.println("Produto 2:");
        exibirDetalhesProduto(produto2);

        System.out.println("Produto 3:");
        exibirDetalhesProduto(produto3);

        scanner.close();
    }

    
    public static void exibirDetalhesProduto(Produto produto) {
        System.out.println("Nome: " + produto.nome);
        System.out.println("Preco: R$" + produto.preco);
        System.out.println("Quantidade em Estoque: " + produto.quantidadeEmEstoque);
    }
}
