public final class App {

    public static void main(String[] args) 
    {
        Nave nave = new Nave("Nemesis", true);

        Jedi jedi = new Jedi("Pablo", 32, 200, false);
        Sith sith = new Sith("Mercúrio", 23, 198, true);
        Droid droid = new Droid("GP", 14, 156, false);
    
        Sabre sabre = new Sabre();

        nave.personagem[0] = jedi;
        nave.personagem[1] = sith;
        nave.personagem[2] = droid;

        nave.mostraInfo();

        System.out.println("Quantidade de personagens criados: " + Personagem.cont);
    }
}
