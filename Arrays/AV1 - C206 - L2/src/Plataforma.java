public class Plataforma {
    String nome;
    Serie[] series = new Serie[5];

    public void mostraInfo()
    {
        System.out.println("Nome da plataforma: " + nome);
    }

    public void addSerie(Serie serie)
    {
        for (int i = 0; i < series.length; i++) 
        {
            if(series[i] == null)
            {
                series[i] = serie;
                break;
            }
        }
    }

    String SerieMaisLongaFinalizada()
    {
        int maior = Integer.MIN_VALUE;
        String nomedaseriemaislonga = "";
        for (Serie s : series) 
        {
            if(s != null)
            {
                if(s.finalizada)
                {
                    if((int)s.temporadas > maior)
                    {
                        maior = (int)s.temporadas;
                    }
                }
            }
        }

        for (Serie seriese : series) 
        {
            if(seriese != null)
            {
                if((int)seriese.temporadas == maior)
                {
                    nomedaseriemaislonga = seriese.nome;
                }
            }
        }

        return "O nome da série mais longa finalizada é: " + nomedaseriemaislonga;
    }

    public void mediaPorcentagem()
    {
        int porcentagem;
        int qtdSeries = 0;
        int finalizadas = 0;
        int somadasnotas = 0;
        int qtdnotas = 0;
        double media;

        for (Serie serie : series) 
        {
            if(serie != null)
            {
                qtdSeries++;
                if(serie.finalizada)
                {
                    finalizadas++;
                }
            }
        }

        porcentagem = 100 * finalizadas/ qtdSeries;
        System.out.println("A porcentagem de séries finalizadas é de: " + porcentagem + "%");


        for (Serie ser : series) 
        {
            if(ser != null)
            {
                if(ser.temporadas >= 3)
                {
                    somadasnotas += ser.nota;
                    qtdnotas++;
                }
            }
        }

        media = (double)somadasnotas/qtdnotas;
        System.out.println("A média das notas das séries com 3 ou mais temporadas é de: " + media);
        
    }

    public Plataforma(String nome) 
    {
        this.nome = nome;
    }

    
}
