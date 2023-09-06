public class Bruxo
{
    //atributos da classe bruxo
    String Nome;
    String Casa;
    String Varinha;
    boolean Quadribol;

    //mostra as informações do bruxo
    public void mostraInfo()
    {
        System.out.println("----------------------------------------------------------------------------");
        System.out.println("Nome do bruxo: " + Nome);
        System.out.println("Casa do bruxo: " + Casa);
        System.out.println("Nome da varinha: " + Varinha);
        System.out.println("Joga quadribol? " + Quadribol);
        System.out.println("----------------------------------------------------------------------------");
    }

    //construtor da classe bruxo
    public Bruxo(String nome, String casa, String varinha, boolean quadribol) 
    {
        this.Nome = nome;
        this.Casa = casa;
        this.Varinha = varinha;
        this.Quadribol = quadribol;
    }
}