public class Exercito 
{
    private String nome;
    private Soldado[] soldados;
    
    public void addSoldado(Soldado s)
    {
        for (int i = 0; i < soldados.length; i++) 
        {
            if(soldados[i] == null)
            {
                soldados[i] = s;
                break;
            }
        }
    }

    public void mostraInfo()
    {
        System.out.println("Nome do exército: " + nome);
        System.out.println();

        for (int i = 0; i < soldados.length; i++) 
        {
            if(soldados[i] != null)
            {
                if(soldados[i] instanceof Sargento)
                {
                   Sargento s = (Sargento) soldados[i]; 
                   s.mostraInfo();
                   s.usandoItem();
                   s.defender();
                   System.out.println();
                }

                else if(soldados[i] instanceof Oficial)
                {
                   Oficial o = (Oficial) soldados[i]; 
                   o.mostraInfo();
                   o.usandoItem();
                   o.defender();
                   System.out.println();
                }

                else if(soldados[i] instanceof MedicoMilitar)
                {
                    MedicoMilitar m = (MedicoMilitar) soldados[i];
                    m.mostraInfo();
                    m.usandoItem();
                    m.curar();
                    System.out.println( );
                }
                
            }
        }

    }

    public Exercito(String nome) 
    {
        this.nome = nome;
        soldados = new Soldado[10]; //composição
    }

}
