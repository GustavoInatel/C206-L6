
public class Produto implements Comparable <Produto>{

    //Atributos da classe produto
    private String nome;
    private double preco;
    private String tipo;

    //Construtor com os atributos
    public Produto(String nome, double preco, String tipo) {
        this.nome = nome;
        this.preco = preco;
        this.tipo = tipo;
    }

    //Construtor sem atributos
    public Produto() {
    }

    //Getters e setters
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

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    //Comparando em relação ao preço de forma decrescente
    @Override
    public int compareTo(Produto o) {
        return Double.compare(o.preco,this.preco);
    }
}