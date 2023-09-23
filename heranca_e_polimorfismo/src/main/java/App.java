public final class App {

    public static void main(String[] args) 
    {
        Pokemon pikachu = new Pikachu("Pikachu", "Elétrico", 20, 10);
        Pokemon squirtle = new Squirtle("Squirtle", "Água", 15);
        Pokemon bulbassaur = new Bulbassaur("Bulbassaur", "Água", 10);

        pikachu.mostraInfo();
        squirtle.mostraInfo();
        bulbassaur.mostraInfo();

        pikachu.atacar();
        squirtle.atacar();
        bulbassaur.atacar();

        System.out.println("Quantidade de pokemons: " + Pokemon.qtdPokemon);
    }
}
