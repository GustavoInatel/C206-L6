public class Bulbassaur extends Pokemon
{
    private float luminosidadeAmbiente;

    public void mostraInfo()
    {
        System.out.println("A luminosidade ambiente do " + getNome() + " é de " + luminosidadeAmbiente + " unidades.");

    }

    @Override
    public void atacar() 
    {
        // TODO Auto-generated method stub
        super.atacar();
        System.out.println("O " + getNome() + " está atacando!!");
    }

    public float getLuminosidadeAmbiente() {
        return luminosidadeAmbiente;
    }

    public void setLuminosidadeAmbiente(float luminosidadeAmbiente) {
        this.luminosidadeAmbiente = luminosidadeAmbiente;
    }

    public Bulbassaur(String nome, String tipo, float luminosidadeAmbiente) {
        super(nome, tipo);
        this.luminosidadeAmbiente = luminosidadeAmbiente;
    }

    
}
