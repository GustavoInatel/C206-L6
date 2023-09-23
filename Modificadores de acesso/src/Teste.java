public class Teste {
    public static int qtd; //é um atributo da clase. É como se o valor ficasse saldo na classe toda vez que eu usasse o atributo

    public Teste()
    {
        qtd++;
        System.out.println("Criados " + qtd + " testes");
    }
}
