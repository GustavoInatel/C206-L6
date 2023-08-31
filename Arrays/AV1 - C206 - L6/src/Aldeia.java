public class Aldeia {
    String nome;
    int qtdMoradores;
    String regiao;
    Ninja[] ninjas = new Ninja[10];

    public void adicionarNinja(Ninja ninja)
    {
        for (int i = 0; i < ninjas.length; i++) 
        {
            if(ninjas[i] == null)
            {
                ninjas[i] = ninja;
                break;
            }
        }
    }

    public void mostraInfo()
    {
        System.out.println("Nome da aldeia: " + nome);
        System.out.println("Quantidade de moradores na aldeia: " + qtdMoradores);
        System.out.println("Nome da região: " + regiao);
    }

    public void RankingS()
    {
        for (int i = 0; i < ninjas.length; i++) 
        {
            if(ninjas[i] != null)
            {
                if(ninjas[i].ranking.equals("S"))
                {
                    System.out.println(ninjas[i].nome);
                }
            }    
        }
    }

    public void qtdTitulos()
    {
        int gennin = 0;
        int chunnin = 0;
        int anbu = 0;
        for (int i = 0; i < ninjas.length; i++) 
        {
            if(ninjas[i] != null)
            {
                if(ninjas[i].titulo.equals("Gennin"))
                {
                    gennin++;
                }
                if(ninjas[i].titulo.equals("Chunnin"))
                {
                    chunnin++;
                }
                if(ninjas[i].titulo.equals("Anbu"))
                {
                    anbu++;
                }
            }    
        }

        System.out.println("Quantidade de títulos Gennin: " + gennin);
        System.out.println("Quantidade de títulos Chunnin: " + chunnin);
        System.out.println("Quantidade de títulos Anbu: " + anbu);
    }
}
