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

    
    public static void main(String[] args) {
        
        Produto produto1 = new Produto("Camiseta", 29.99, 50);
        Produto produto2 = new Produto("Tenis", 99.99, 20);

        
        System.out.println("Informacoes do Produto 1:");
        System.out.println("Nome: " + produto1.getNome());
        System.out.println("Preco: R$" + produto1.getPreco());
        System.out.println("Quantidade em Estoque: " + produto1.getQuantidadeEmEstoque());

        System.out.println();

        System.out.println("Informacoes do Produto 2:");
        System.out.println("Nome: " + produto2.getNome());
        System.out.println("Preco: R$" + produto2.getPreco());
        System.out.println("Quantidade em Estoque: " + produto2.getQuantidadeEmEstoque());

        
        produto1.setPreco(39.99);
        produto2.setQuantidadeEmEstoque(30);

        
        System.out.println("Informacoes do Produto 1 apos modificacao:");
        System.out.println("Nome: " + produto1.getNome());
        System.out.println("Preco: R$" + produto1.getPreco());
        System.out.println("Quantidade em Estoque: " + produto1.getQuantidadeEmEstoque());
    }
}

