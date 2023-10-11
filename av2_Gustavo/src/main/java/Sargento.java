public class Sargento extends Soldado implements Defesa
{
    private String especialização;
    private int experienciaCombate = 0;
    private boolean possuiItemEspecial;

    public Sargento(String nome, long cpf, String especialização, int experienciaCombate, boolean possuiItemEspecial) 
    {
        super(nome, cpf);
        //TODO Auto-generated constructor stub
        this.especialização = especialização;
        this.experienciaCombate = experienciaCombate;
        this.possuiItemEspecial = possuiItemEspecial;
    }

    @Override
    public void usandoItem() 
    {
        // TODO Auto-generated method stub
        if(possuiItemEspecial)
        {
            System.out.println(getNome() + " utilizando item especial " + getItemespec().tipo);
            experienciaCombate = experienciaCombate + 300;
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
        System.out.println("Especialização do sargento: " + especialização);
        System.out.println("Experiência em combate do sargento: " + experienciaCombate);
        if(possuiItemEspecial)
        {
            System.out.println("O oficial possui um item especial!");
        }
        else
        {
            System.out.println("O oficial não possui um item especial");
        }
    }

    @Override
    public void defender() 
    {
        // TODO Auto-generated method stub
        if(experienciaCombate > 650)
        {
            System.out.println("O sargento pode se defender, ele é uma parede!");
        }

        else
        {
            System.out.println("O sargento não pode se defender!");
        }
        
    }
    
}
