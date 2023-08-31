public class Ninja {
    String nome;
    int idade;
    String titulo;
    String ranking;

    public void mostraInfo()
    {
        System.out.println("Nome do ninja: " + nome);
        System.out.println("Idade do ninja: " + idade);
        System.out.println("Título do ninja: " + titulo);
        System.out.println("Ranking do ninja: " + ranking);
    }

    public Ninja(String nome, int idade, String titulo, String ranking) 
    {
        this.nome = nome;
        this.idade = idade;
        this.titulo = titulo;
        this.ranking = ranking;
    }

    
}
