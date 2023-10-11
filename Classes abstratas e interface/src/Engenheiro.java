public class Engenheiro extends Funcionario implements GerenciaProjetos {
    String ramo;

    @Override
    public void executaACao() {
        // TODO Auto-generated method stub
        System.out.println("O engenheiro está planejando construções!");
    }

    public String getRamo() {
        return ramo;
    }

    @Override
    public double salarioBonus() {
        // TODO Auto-generated method stub
        return getSalario() + 300;
    }

    @Override
    public void gerencia() {
        // TODO Auto-generated method stub
        System.out.println("O engenheiro está executando projeto!");
    }

    
}
