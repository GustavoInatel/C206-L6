public class Sith extends Personagem implements Forca
{

    private boolean darth;
    private Sabre sabre;

    public void corromperJedi()
    {
        if(darth == true && getPoder() > 60)
        {
            System.out.println(getNome() + " levou um jedi para o lado negro da força!");
        }

        else
        {
            System.out.println(getNome() + " ainda não consegue corromper jedis!");
        }
    }

    public Sith(String nome, int id, int poder, boolean darth) 
    {
        super(nome, id, poder);
        this.sabre = new Sabre();
        this.sabre.setCor("Verde");
        this.darth = darth;

        cont++;
    }

    @Override
    public void travarBatalha() {
        // TODO Auto-generated method stub
        System.out.println(getNome() + " está travando uma batalha contra um jedi!");
        setPoder(getPoder() + 1);
    }

    @Override
    public void usarForca() {
        // TODO Auto-generated method stub
        System.out.println(getNome() + " usou o ladro negro da força!");
        setPoder(getPoder() + 3);
    }

    @Override
    public void trocarSabre(String cor) {
        // TODO Auto-generated method stub
        this.sabre.setCor(cor);
        System.out.println("Agora o sabre é da cor " + this.sabre.getCor());
    }

    public Sabre getSabre() {
        return sabre;
    }

    public void setSabre(Sabre sabre) {
        this.sabre = sabre;
    }
  
    @Override
    public void mostraInfo()
    {
        super.mostraInfo();

        System.out.println("O sabre de luz do " + getNome() + " é da cor " + sabre.getCor());

        if(darth)
        {
            System.out.println(getNome() + " é um darth!");
        }

        else
        {
            System.out.println(getNome() + " não é um darth!");
        }
    }
}
