public class Carro {
    
    private String marca;
    private String modelo;
    private int ano;
    private String cor;

    
    public Carro(String marca, String modelo, int ano, String cor) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.cor = cor;
    }


    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    
    public void exibirInformacoes() {
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Ano: " + ano);
        System.out.println("Cor: " + cor);
    }

    
    public static void main(String[] args) {
        
        Carro carro1 = new Carro("Toyota", "Corolla", 2020, "Prata");
        Carro carro2 = new Carro("Honda", "Civic", 2019, "Preto");

        
        System.out.println("Informacoes do Carro 1:");
        carro1.exibirInformacoes();

        System.out.println();

        System.out.println("Informacoes do Carro 2:");
        carro2.exibirInformacoes();

        
        carro1.setAno(2021);
        carro1.setCor("Branco");

    
        System.out.println("Informacoes do Carro 1 apos modificacao:");
        carro1.exibirInformacoes();
    }
}
