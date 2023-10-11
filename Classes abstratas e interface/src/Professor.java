public class Professor extends Funcionario {
    String materia;

    @Override
    public void executaACao() {
        // TODO Auto-generated method stub
        System.out.println("O engenheiro está codando!");
        
    }

    @Override
    public double salarioBonus() {
        // TODO Auto-generated method stub
        return getSalario() + 500;
    }

    
}