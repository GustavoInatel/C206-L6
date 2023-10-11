public class Oficial extends Soldado implements Defesa
{
    private String patente;
    private boolean possuiItemEspecial;

    public Oficial(String nome, long cpf, String patente, boolean possuiItemEspecial) 
    {
        super(nome, cpf);
        //TODO Auto-generated constructor stub
        this.patente = patente;
        this.possuiItemEspecial = possuiItemEspecial;
    }

    @Override
    public void usandoItem() 
    {
        // TODO Auto-generated method stub
        if(possuiItemEspecial)
        {
            System.out.println(getNome() + " utilizando item especial " + getItemespec().tipo);
        }

        else
        {
            System.out.println("Não tem item especial para utilizar");
        }
        
    }

    @Override
    public void mostraInfo()
    {
        super.mostraInfo();
        System.out.println("Patente do oficial: " + patente);
        if(possuiItemEspecial)
        {
            System.out.println(getNome() + " conseguiu se defender!");
        }
        else
        {
            System.out.println(getNome() + " não conseguiu se defender!");
        }
    }

    @Override
    public void defender() 
    {
        // TODO Auto-generated method stub
        if(possuiItemEspecial)
        {
            System.out.println("O sargento pode se defender, ele é uma parede!");
        }

        else
        {
            System.out.println("O sargento não pode se defender!");
        }
        
    }    

}
