public class Droid extends Personagem
{
    private boolean hostil;

    public void hackerSistema()
    {
        System.out.println(getNome() + " hackeou o sistema da nave!");
    }

    public Droid(String nome, int id, int poder, boolean hostil) 
    {
        super(nome, id, poder);
        //TODO Auto-generated constructor stub
        this.hostil = hostil;

        cont++;
    }

    @Override
    public void travarBatalha() 
    {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'travarBatalha'");
    }

    public void verificaHostil()
    {
        if(hostil)
        {
            System.out.println(getNome() + " está travando uma batalha contra um jedi!");
            setPoder(getPoder() + 1);
        }

        else
        {
            System.out.println(getNome() + " está travando uma batalha contra um sith!");
            setPoder(getPoder() + 1);
        }
    }

    @Override
    public void mostraInfo()
    {
        super.mostraInfo();

        if(hostil)
        {
            System.out.println(getNome() + " é hostil!");
        }

        else
        {
            System.out.println(getNome() + " não é hostil!");
        }
    }
}
