public class Estudante {
    String nome;
    int idade;
    String ano;
     
    public void mostraInfo()
    {
        System.out.println("Nome do estudante: " + nome);
        System.out.println("Idade do estudante: " + idade);
        System.out.println("Ano do estudante: " + ano);
    }

    public Estudante(String nome, int idade, String ano) 
    {
        this.nome = nome;
        this.idade = idade;
        this.ano = ano;
    }


}
