public class Pikachu extends Pokemon 
{
    private float soltarRaios;  
    private float paralisiaEletrica;

    public void mostraInfo()
    {
        System.out.println("Que eletrizante, o " + getNome() + " está soltando soltando " + soltarRaios + " volts pelos raios!!" );
        System.out.println("Rapaz, o inimigo ficou paralisado por " + paralisiaEletrica + " segundos!!");
    }

    @Override
    public void atacar() 
    {
        // TODO Auto-generated method stub
        super.atacar();
        System.out.println("O " + getNome() + " está atacando!");
    }

    public float getSoltarRaios() {
        return soltarRaios;
    }

    public void setSoltarRaios(float soltarRaios) {
        this.soltarRaios = soltarRaios;
    }

    public float getParalisiaEletrica() {
        return paralisiaEletrica;
    }

    public void setParalisiaEletrica(float paralisiaEletrica) {
        this.paralisiaEletrica = paralisiaEletrica;
    }

    public Pikachu(String nome, String tipo, float soltarRaios, float paralisiaEletrica) {
        super(nome, tipo);
        this.soltarRaios = soltarRaios;
        this.paralisiaEletrica = paralisiaEletrica;
    }

    
}
