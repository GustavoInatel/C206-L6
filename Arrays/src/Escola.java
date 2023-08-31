public class Escola {
    String nome;
    String email;
    int numTelefone;
    String endereco;
    Estudante[] estudantes = new Estudante[301]; //associação

    public void addEstudante(Estudante e)
    {
        for (int i = 0; i < estudantes.length; i++) 
        {
            if(estudantes[i] == null)
            {
                estudantes[i] = e;
                break;
            }
        }
    }

    public void qtdEstudantesPorAno()
    {
        int primeiroano = 0;
        int segundoano = 0;
        int terceiroano = 0;
       for (int i = 0; i < estudantes.length; i++) 
       {
            if(estudantes[i] != null)
            {
                if(estudantes[i].ano.equals("primeiro ano"))
                {
                    primeiroano++;
                }
                if(estudantes[i].ano.equals("segundo ano"))
                {
                    segundoano++;
                }
                if(estudantes[i].ano.equals("terceiro ano"))
                {
                    terceiroano++;
                }
            }
       }

       System.out.println("Quantidade de alunos no primeiro ano: " + primeiroano + " alunos");
       System.out.println("Quantidade de alunos no segundo ano: " + segundoano + " alunos");
       System.out.println("Quantidade de alunos no terceiro ano: " + terceiroano + " alunos");
            
    }

}
