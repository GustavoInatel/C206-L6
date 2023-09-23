public class Pokemon 
{
    static int qtdPokemon;
    private String nome;
    private String tipo;
    
    public void mostraInfo()
    {

    }

    public void atacar()
    {

    }

    public static int getQtdPokemon() {
        return qtdPokemon;
    }

    public static void setQtdPokemon(int qtdPokemon) {
        Pokemon.qtdPokemon = qtdPokemon;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Pokemon(String nome, String tipo) {

        this.nome = nome;
        this.tipo = tipo;

        qtdPokemon++;
    }

    
    
}
