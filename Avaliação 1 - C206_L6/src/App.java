import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        
        Bruxo[] bruxos = new Bruxo[5]; //array de bruxos

        Escola escola = new Escola("Hogwards", "Chirstopher");

        Scanner in = new Scanner(System.in);

        int opcao;
        boolean flag = true; //vai ser uma flag para rodar o while, ou seja, vai ser uma condição de parada do while
        System.out.println("----------------------------------------------------------------------------");
        System.out.println("Bem-vindo ao menu. Para prosseguir, siga as instruções abaixo:");
        System.out.println("Digite 1 para adicionar um bruxo na escola");
        System.out.println("Digite 2 para mostrar as informações da escola e de seus bruxos");
        System.out.println("Digite 3 para mostrar os jogadores que jogam quadribol");
        System.out.println("Digite 4 para mostrar a quantidade de bruxos que tem a Varinha de Cerejeira");
        System.out.println("Digite 5 para sair do menu");
        System.out.println("----------------------------------------------------------------------------");
        opcao = in.nextInt();

        while(opcao != 1 && opcao != 2 && opcao != 3 && opcao != 4 && opcao != 5)
        {
            System.out.println("Por favor, digite um valor válido!");
            opcao = in.nextInt();
        }

        in.nextLine(); //to dando esse comando porque agora vou trocar de números para String. Se não fizer isso, ele vai pular a entrada das String e só vai pegar da última

        int i = 0;
        while(flag)
        {
            switch (opcao) 
            {
                case 1:

                    System.out.println("Digite o nome do bruxo: ");
                    String Nome = in.nextLine();
                    System.out.println("----------------------------------------------------------------------------");

                    System.out.println("Digite o nome da casa do bruxo: ");
                    String nomeCasa = in.nextLine();
                    System.out.println("----------------------------------------------------------------------------");

                    System.out.println("Qual varinha o bruxo tem? ");
                    String varinhaNome = in.nextLine();
                    System.out.println("----------------------------------------------------------------------------");

                    System.out.println("O bruxo joga quadribol? Digite true para sim e false para não");
                    boolean Quadribol = in.nextBoolean();
                    System.out.println("----------------------------------------------------------------------------");

                    Bruxo bruxo = new Bruxo(Nome, nomeCasa, varinhaNome, Quadribol);
                    escola.adicionarBruxo(bruxo);
                    bruxos[i] = bruxo; //eu to usando isso porque se não fizer assim, não mostra nada. Ele precisa ter acesso ao objeto pra mostrá-lo

                    break;

                case 2:

                    System.out.println("Mostrando as informações da escola: ");
                    System.out.println("----------------------------------------------------------------------------");
                    escola.mostraInfo();
                    System.out.println("----------------------------------------------------------------------------");
                    System.out.println("Mostrando as informações dos bruxos: ");
                    System.out.println("----------------------------------------------------------------------------");

                    for (Bruxo bruxao : bruxos) 
                    {
                        if(bruxao != null)
                        {
                            bruxao.mostraInfo();
                        }   
                    }

                    break;

                case 3:

                    System.out.println("Os jogadores que jogam Quadribol são: ");
                    escola.jogadoresQua(); //mostrando a quantidade de jogadores que jogam quadribol
                    System.out.println("----------------------------------------------------------------------------");

                    break;

                case 4:

                    escola.varinhaCerejeira(); //mostrando a quantidade de bruxos que 

                    break;

                case 5:

                    flag = false;
                    System.out.println("Saindo do menu...");
                    System.out.println("----------------------------------------------------------------------------");

                    break;
            
                default:

                    System.out.println("Digite um valor válido!");
                    opcao = in.nextInt();

                    break;
            }

            if(flag == true) //aqui é pra quando eu for usar o menu de novo. Se eu não for usar mais o menu e tive apertado 5, ele não vai mais mostrar essa mensagem
            {
                System.out.println("Digite 1 para adicionar um bruxo na escola");
                System.out.println("Digite 2 para mostrar as informações da escola e de seus bruxos");
                System.out.println("Digite 3 para mostrar os jogadores que jogam quadribol");
                System.out.println("Digite 4 para mostrar a quantidade de bruxos que tem a Varinha de Cerejeira");
                System.out.println("Digite 5 para sair do menu");
                System.out.println("----------------------------------------------------------------------------");
                opcao = in.nextInt();
                in.nextLine(); //mesma coisa, é por causa da quebra de linha
            }
            i++; //incrementando o contador que tinha feito pro while
        }

    }
}
