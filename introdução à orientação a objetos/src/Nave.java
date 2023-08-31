public class Nave {
    
    String nome;
    int velocidade;
    Arma arma;

    public void mostraInfo()
    {
        System.out.println("Nome da nave: " + nome);
        System.out.println("Velocidade da nave: " + velocidade);
    }

    /* 
    public void addArma(Arma arma)
    {
        System.out.println("Arma adicionada!");
        this.arma = arma; //agregação 
    }
    */
    
    public Nave()
    {
        arma = new Arma(); //composição
    }

   /* public Nave(String nome, int velocidade, String tipo, int poder) //jeito diferente de mexer com composição
    {
         this.nome = nome;
         this.velocidade = velocidade;
         this.arma = new Arma("Fogo", 20);

    }
    */

}
