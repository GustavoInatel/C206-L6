public class Squirtle extends Pokemon
{
    private float multiplicadorAgua;

    public void mostraInfo()
    {
        System.out.println("O modificador de água do " + getNome() + " é de " + multiplicadorAgua);
    }

    @Override
    public void atacar() 
    {
        // TODO Auto-generated method stub
        super.atacar();
        System.out.println("O " + getNome() + " está atacando!!");
    }

    public float getMultiplicadorAgua() {
        return multiplicadorAgua;
    }

    public void setMultiplicadorAgua(float multiplicadorAgua) {
        this.multiplicadorAgua = multiplicadorAgua;
    }

    public Squirtle(String nome, String tipo, float multiplicadorAgua) {
        super(nome, tipo);
        this.multiplicadorAgua = multiplicadorAgua;
    }

    
}
