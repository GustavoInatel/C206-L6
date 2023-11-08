public class ThreadContadora extends Thread
{
    
    String nome;
    int intervalo;

    public ThreadContadora(String nome, int intervalo) 
    {
        this.nome = nome;
        this.intervalo = intervalo;
    }

    @Override
    public void run() {
        // TODO Auto-generated method stub
        for (int i = 0; i < 10; i++) 
        {
            System.out.println(this.nome + " - " + i);

            try 
            {
                Thread.sleep(this.intervalo);
            } catch (InterruptedException e) 
            {
                // TODO: handle exception
                System.out.println(e);
            }
        }
        
    }

    
}
