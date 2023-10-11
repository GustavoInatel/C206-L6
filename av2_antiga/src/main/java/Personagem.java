public abstract class Personagem 
{
    static int cont = 0;
    private String nome;
    private int id;
    private int poder;

    public void mostraInfo()
    {
        System.out.println("Nome do personagem: "+this.nome);
        System.out.println("ID do personagem: "+this.id);
        System.out.println("Poder do personagem: "+this.poder);
    }

    public abstract void travarBatalha();

    public Personagem(String nome, int id, int poder) 
    {
        this.nome = nome;
        this.id = id;
        this.poder = poder;
    }

    public static int getCont() {
        return cont;
    }

    public static void setCont(int cont) {
        Personagem.cont = cont;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getPoder() {
        return poder;
    }

    public void setPoder(int poder) {
        this.poder = poder;
    }

    

}
