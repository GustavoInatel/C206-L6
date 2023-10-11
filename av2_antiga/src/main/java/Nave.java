public class Nave
{
    private String nome;
    Personagem[] personagem = new Personagem[10]; //associação
    private boolean velocidadeLuz;

    public void mostraInfo()
    {
        System.out.println("Nome da nave: " + nome);
        if(velocidadeLuz)
        {
            System.out.println("A nave percorre na velocidade da luz!");
        }

        else
        {
            System.out.println("A nave não percorre na velocidade da luz!");
        }

        for (int i = 0; i < personagem.length; i++) 
        {
            if(personagem[i] != null)
            {
                if(personagem[i] instanceof Jedi)
                {
                    Jedi J = (Jedi) personagem[i];
                    J.mostraInfo();
                    J.treinarPadawan();
                    J.trocarSabre("amarelo");
                    J.usarForca();
                    System.out.println("---------------------------");
                }

                else if(personagem[i] instanceof Sith)
                {
                    Sith s = (Sith) personagem[i];
                    s.mostraInfo();
                    s.corromperJedi();
                    s.usarForca();
                    s.trocarSabre("azul");
                    System.out.println("---------------------------");
                }

                else if(personagem[i] instanceof Droid)
                {
                    Droid d = (Droid) personagem[i];
                    d.mostraInfo();
                    d.hackerSistema();
                    System.out.println("---------------------------");
                }
            }
        }
    }

    public Nave(String nome, boolean velocidadeLuz) 
    {
        this.nome = nome;
        this.velocidadeLuz = velocidadeLuz;
    }

    

}
