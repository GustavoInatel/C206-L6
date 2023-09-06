public class Escola {

    //atributos da classe Escola
    String Nome;
    String Diretor;
    Bruxo[] bruxos = new Bruxo[5];

    //adiciona o bruxo em um array
    public void adicionarBruxo(Bruxo b) 
    {
        for (int i = 0; i < bruxos.length; i++) //usando um for para verificar no array se as posições dele estão vazias para eu ocupá-las
        {
            if(bruxos[i] == null)
            {
                bruxos[i] = b; //aqui eu to adicionando o objeto da main(por meio do parâmetro Bruxo b) e guardando ele em uma posição do array
                break; //aqui eu tenho que dar um break porque vou adicionar só um bruxo. Quando eu quiser adicionar outro bruxo, eu chamo o método de novo
                //obs: se eu não der um break, basicamente eu vou adicioanar o mesmo bruxo em todas as posições do array
            }
        }
    }

    //mostra as informações da escola
    public void mostraInfo()
    {
        System.out.println("Nome da escola: " + Nome);
        System.out.println("Nome do diretor da escola: " + Diretor);
    }

    //mostra os jogadores qe joga quadribol
    public void jogadoresQua()
    {
        for (Bruxo bru : bruxos) //for each
        {
            if(bru != null)
            {
                if(bru.Quadribol == true)
                {
                    System.out.println(bru.Nome); //aqui eu to mostrando os jogadores que jogam quadribol
                }
            }    
        }

        
    }

    //mostra a quantidade de bruxos que tem a varinha cerejeira
    public void varinhaCerejeira()
    {
        int varinhacer = 0; //contador de varinhas de cerejeira

        for (int i = 0; i < bruxos.length; i++) 
        {
            if(bruxos[i] != null)
            {
                if(bruxos[i].Varinha.equals("Varinha de Cerejeira"))
                {
                    varinhacer++; //aqui eu to contando quantos jogadores jogam quadribol
                }
            }        
        }

        System.out.println("A quantidade de bruxos que tem a varinha cerejeira é de: " + varinhacer);
    }

    //construtor de Escola. Toda instância feita de Escola, eu venho ao mesmo instante ao construtor
    public Escola(String nome, String diretor) 
    {
        this.Nome = nome;
        this.Diretor = diretor;
    }   
}
