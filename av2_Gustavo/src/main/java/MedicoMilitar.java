public class MedicoMilitar extends Soldado implements Curar
{
    private int anosExperiencia;
    private int capacidadeEmergencia = 0;
    private boolean possuiItemEspecial;

    public MedicoMilitar(String nome, long cpf, int anosExperiencia, int capacidadeEmergencia, boolean possuiItemEspecial) 
    {
        super(nome, cpf);
        //TODO Auto-generated constructor stub
        this.anosExperiencia = anosExperiencia;
        this.capacidadeEmergencia = capacidadeEmergencia;
        this.possuiItemEspecial = possuiItemEspecial;
    }

    @Override
    public void usandoItem() 
    {
        // TODO Auto-generated method stub
        if(possuiItemEspecial)
        {
            System.out.println(getNome() + " utilizando item especial " + getItemespec().tipo);
            capacidadeEmergencia = capacidadeEmergencia + 100;
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
        System.out.println("Tempo de experiência do médico militar: " + anosExperiencia);
        System.out.println("Capacidade de emergência do médico militar: " + capacidadeEmergencia);
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
    public void curar() 
    {
        // TODO Auto-generated method stub
        if(capacidadeEmergencia > 920)
        {
            System.out.println(getNome() + " pode curar outra pessoa!");
        }

        else
        {
            System.out.println(getNome() + " não pode curar outra pessoa!");
        }
    }
}