public abstract class Funcionario //é abstrato a classe, não pode ser instanciada
{

    private String nome;
    private int idade;
    private double salario;

    public void mostraInfo()
    {
        System.out.println("Nome do funcionário: " + nome);
        System.out.println("Idade do funcionário: " + idade);
        System.out.println("Salário do funcionário: " + salario);
    }

    public abstract void executaACao(); //ele obriga as classes filhas a fazerem polimorfismo; não tem corpo, é só isso

    public abstract double salarioBonus(); //mesma coisa

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public double getSalario() {
        return salario;
    }

    
    
}