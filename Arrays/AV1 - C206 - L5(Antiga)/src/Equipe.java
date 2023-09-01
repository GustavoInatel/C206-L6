public class Equipe {
    String capitao;
    Heroi[] herois = new Heroi[10];

    public void adicionarHeroi(Heroi  heroi)
    {
        for(int i = 0; i < herois.length; i++)
        {
            if(herois[i] == null)
            {
                herois[i] = heroi;
                break;
            }
        }
    }

    public void mostraInfo()
    {
        System.out.println("Nome do capitão: " + capitao);
        for (Heroi h : herois) 
        {
            if(h != null)
            {
                System.out.println("Nome do heroi: " + h.nome);
                System.out.println("Poder do heroi: " + h.poder);
                if(h.podeVoar == true)
                {
                    System.out.println("O heroi pode voar!");
                }
                else
                {
                    System.out.println("O heroi não pode voar");
                }

                System.out.println();
            }
        }
    }

    public void mostraMaisForte()
    {
        int maior = Integer.MIN_VALUE; //pega o menor valor possível

        for (Heroi h : herois) 
        {
            if (h != null && h.poder > maior) 
            {
                maior = (int)h.poder;
            }

        }

        for (Heroi her : herois) 
            {
                if(her != null)
                {
                    if((int)her.poder == maior && her != null)
                    {
                        System.out.println("O heroi mais forte é o: " + her.nome);
                    }
                }
            }


    }   


    public void calculaVoadores()
    {
        int voar = 0;
        int qtdherois = 0;
        int porcentagem;
        for (Heroi he : herois) 
        {                                                             
            if(he != null)
            {
                qtdherois++;
                if(he.podeVoar == true)
                {
                    voar++;
                }
            }
        }

        porcentagem = 100 * voar/ qtdherois;

        System.out.println("A porcentagem de herois na equipe que pode voar é de: " + porcentagem + "%");

    }

    public Equipe(String capitao) {
        this.capitao = capitao;
    }

    
}
