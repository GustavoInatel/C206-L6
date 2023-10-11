public class Jedi extends Personagem implements Treinamento, Forca
{

    private boolean mestre;
    private Sabre sabre; //associação com Sabre
    

    public Jedi(String nome, int id, int poder, boolean mestre) 
    {
        super(nome, id, poder);
        //TODO Auto-generated constructor stub
        this.mestre = mestre;
        this.sabre = new Sabre();
        this.sabre.setCor("Rosa");
        cont++;
    }

    @Override
    public void travarBatalha() 
    {
        // TODO Auto-generated method stub
        System.out.println(getNome() + " travou uma batalha contra um sith!");
        setPoder(getPoder() + 1); //aumentando uma unidade de poder
    }

    @Override
    public void usarForca() {
        // TODO Auto-generated method stub
        System.out.println(getNome() + " usou a força para o bem!");
        setPoder(getPoder() + 5);
    }

    @Override
    public void trocarSabre(String cor) {
        // TODO Auto-generated method stub
        this.sabre.setCor(cor);
        System.out.println("Agora o sabre é da cor " + this.sabre.getCor());
    }

    @Override
    public void treinarPadawan() {
        // TODO Auto-generated method stub
        if(mestre == true || getPoder() > 70)
        {
            System.out.println(getNome() + " treinou um Padawan!");
        }

        else
        {
            System.out.println(getNome() + " ainda não consegue treinar padawans!");
        }
    }

    public Sabre getSabre() {
        return sabre;
    }

    public void setSabre(Sabre sabre) 
    {
        this.sabre = sabre;
    }

    @Override
    public void mostraInfo() {
        // TODO Auto-generated method stub
        super.mostraInfo();
        System.out.println("O sabre de luz do " + getNome() + " é da cor " + this.sabre.getCor());
        if(mestre)
        {
            System.out.println(getNome() + " é um mestre!");
        }

        else
        {
            System.out.println(getNome() + " não é um mestre!");
        }

    }

    
}