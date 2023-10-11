public class Arquiteto extends Funcionario{
    String especialidade;

    @Override
    public void executaACao() {
        // TODO Auto-generated method stub
        System.out.println("O arquiteto está criando projetos!");
    }

    @Override
    public double salarioBonus() {
        // TODO Auto-generated method stub
        return getSalario() + 100;
    }

    
}
