public class Funcionário {
    
    String nome;
    int idade;
    float salario;
    int cpf;

    public void tirarFerias(String mes, int qtdias)
    {
        System.out.println("O funcionário " + nome + " tirou férias de " + qtdias + " dias no mês " + mes);
    }

    public float salarioAnual()
    {
        float salarioanual;

        salarioanual = salario * 12; //calcula o décimo terceiro

        return salarioanual;
    }

    public Funcionário(String nome, int idade, float salario, int cpf) {
        this.nome = nome;
        this.idade = idade;
        this.salario = salario;
        this.cpf = cpf;
    }

    public float salarioAnual(float decimoterceiro)
    {
        float salarioanual;
        salarioanual = (salario * 12) + decimoterceiro;

        return salarioanual;
    }

}
