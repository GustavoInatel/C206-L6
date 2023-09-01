import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        
        Equipe equipe = new Equipe("Homem de ferro");

        Heroi[] heroi = new Heroi[10];

        Scanner in = new Scanner(System.in);
        int opcao;
        boolean flag = true;

        System.out.println("---------------------------------------------");
        System.out.println("Seja bem-vindo(a) ao menu de cadastro de herois. Para prosseguir, siga as informações abaixo: ");
        System.out.println("Digie 1 para adicionar um novo heroi");
        System.out.println("Digite 2 para mostrar as informações da equipe e de seus herois");
        System.out.println("Digite 3 para mostrar o heroi mais forte");
        System.out.println("Digite 4 para calcular a porcentagem de herois que podem voar");
        System.out.println("Digite 5 para sair do menu");
        System.out.println("---------------------------------------------");
        opcao = in.nextInt();

        while(opcao != 1 && opcao != 2 && opcao != 3 && opcao != 4 && opcao != 5)
        {
            System.out.println("Por favor, insira um valor válido");
            opcao = in.nextInt();
        }

        in.nextLine();
        
        int i = 0;
        while(flag)
        {
            switch(opcao)
            {
                case 1:

                    System.out.println("---------------------------------------------");
                    System.out.println("Digite o nome do heroi: ");
                    String nome = in.nextLine();

                    System.out.println("Digite a quantidade de poder do heroi: ");
                    float poderdoheroi = in.nextInt();

                    System.out.println("O heroi pode voar? Digite true para sim e false para não");
                    boolean podeVoar = in.nextBoolean();

                    Heroi heroizinho = new Heroi(nome, poderdoheroi, podeVoar);
                    equipe.adicionarHeroi(heroizinho);
                    heroi[i] = heroizinho;

                    break;

                case 2:

                    System.out.println("---------------------------------------------");
                    System.out.println("Mostrando informações da equipe e dos herois: ");
                    System.out.println();
                    equipe.mostraInfo(); //mostra as informações da equipe e dos herois
                    System.out.println("---------------------------------------------");

                    break;

                case 3:

                    System.out.println("---------------------------------------------");
                    System.out.println("Mostrando o nome do heroi mais forte: ");
                    System.out.println();
                    equipe.mostraMaisForte(); //mostra o heroi mais forte
                    System.out.println("---------------------------------------------");

                    break;

                case 4:

                    System.out.println("---------------------------------------------");
                    System.out.println("Mostrando a porcentagem de herois que podem voar: ");
                    System.out.println();
                    equipe.calculaVoadores();
                    System.out.println("---------------------------------------------");

                    break;

                case 5:

                    flag = false;
                    System.out.println("Saindo do menu!");
                    System.out.println("---------------------------------------------");

                    break;

                default:

                    System.out.println("Insira um valor válido: ");
                    opcao = in.nextInt();

                    break;
            }

            if(flag)
            {
                System.out.println("---------------------------------------------");
                System.out.println("Digie 1 para adicionar um novo heroi");
                System.out.println("Digite 2 para mostrar as informações da equipe e de seus herois");
                System.out.println("Digite 3 para mostrar o heroi mais forte");
                System.out.println("Digite 4 para calcular a porcentagem de herois que podem voar");
                System.out.println("Digite 5 para sair do menu");
                System.out.println("---------------------------------------------");
                opcao = in.nextInt();
                in.nextLine();
            }

            i++;

        }
    }
}
