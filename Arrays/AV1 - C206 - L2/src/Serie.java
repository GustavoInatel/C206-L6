public class Serie {
    String nome;
    double nota;
    int temporadas;
    boolean finalizada;
    Diretor diretor; //associação

    public void mostraInfo()
    {
        System.out.println("Nome da série: " + nome);
        System.out.println("Nota da série: " + nota);
        System.out.println("Número de temporadas: " + temporadas);
        System.out.println("Série finalizada? ");
        if(finalizada)
        {
            System.out.println("A série foi finalizada!");
        }
        else
        {
            System.out.println("A série não foi finalizada!");
        }
        System.out.println("----------------------------------------------");
    }

    public Serie(String nome, double nota, int temporadas, boolean finalizada) 
    {
        this.nome = nome;
        this.nota = nota;
        this.temporadas = temporadas;
        this.finalizada = finalizada;

        diretor = new Diretor();
    }

    

}
