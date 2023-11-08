public class Jogador implements Comparable<Jogador> //implementado a interface Comparable, juntamente com seu método
{
    private String Nome;
    private int Numero;
    private String Posicão;

    public String getNome() {
        return Nome;
    }

    public int getNumero() {
        return Numero;
    }

    public String getPosicão() {
        return Posicão;
    }

    public void setNome(String nome) {
        Nome = nome;
    }

    public void setNumero(int numero) {
        Numero = numero;
    }

    public void setPosicão(String posicão) {
        Posicão = posicão;
    }

    public Jogador(String nome, int numero, String posicão) {
        Nome = nome;
        Numero = numero;
        Posicão = posicão;
    }

    public Jogador() {

    }

    @Override
    public int compareTo(Jogador o) //ordenando em ordem decrescente 
    {
        // TODO Auto-generated method stub

        return Integer.compare(o.Numero, this.Numero);
    }

}
