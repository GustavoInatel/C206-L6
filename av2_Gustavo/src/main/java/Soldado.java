public abstract class Soldado 
{
    static int qtdSoldado;
    private String nome;
    private long cpf;
    private ItemEspecial itemespec;

    public void mostraInfo()
    {
        System.out.println("Nome do soldado: " + nome);
        System.out.println("CPF do soldado: " + cpf);
        System.out.println();
    }

    public abstract void usandoItem();

    public Soldado(String nome, long cpf) 
    {
        this.nome = nome;
        this.cpf = cpf;
        this.itemespec = new ItemEspecial();
        this.itemespec.tipo = "Granada";
        qtdSoldado++;
    }

    public static int getQtdSoldado() {
        return qtdSoldado;
    }

    public String getNome() {
        return nome;
    }

    public long getCpf() {
        return cpf;
    }

    public ItemEspecial getItemespec() {
        return itemespec;
    }

    

    

    
}
