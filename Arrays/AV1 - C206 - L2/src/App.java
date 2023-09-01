import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        
        Plataforma plataforma = new Plataforma("HBO");

        Serie[] series =  new Serie[5];

        Scanner in = new Scanner(System.in);
        int opcao;
        boolean flag = true;

        System.out.println("----------------------------------------------");
        System.out.println("Bem-vindo ao menu de cadastramento. Para progsseguir, siga as instruções abaixo: ");
        System.out.println("Digite 1 para cadastrar uma série");
        System.out.println("Digite 2 para mostrar informações da plataforma e suas séries");
        System.out.println("Digite 3 para mostrar o nome da série com maior número de temporadas e que já foi finalizada");
        System.out.println("Digite 4 para mostrar a porcentagem do número de séries e a média aritmética de notas das que possuem 3 ou mais temporadas");
        System.out.println("Digite 5 para sair do menu");
        System.out.println("----------------------------------------------");
        opcao = in.nextInt();

        while(opcao != 1 && opcao != 2 && opcao != 3 && opcao != 4 && opcao != 5)
        {
            System.out.println("Por favor, digite um valor válido: ");
            opcao = in.nextInt();
        }

        in.nextLine();


        int i = 0;

        while(flag)
        {
            switch(opcao)
            {
                case 1:

                    System.out.println("----------------------------------------------");
                    System.out.println("Digite o nome da série: ");
                    String nome = in.nextLine();
                    System.out.println("----------------------------------------------");

                    System.out.println("Digite a nota da série: ");
                    double nota = in.nextDouble();
                    System.out.println("----------------------------------------------");

                    System.out.println("Digite quantas temporadas a série tem: ");
                    int temporadas = in.nextInt();
                    System.out.println("----------------------------------------------");

                    System.out.println("A temporada está finalizada? Digite true para sim e false para não");
                    boolean finalizada = in.nextBoolean();
                    System.out.println("----------------------------------------------");

                    Serie serie = new Serie(nome, nota, temporadas, finalizada);
                    plataforma.addSerie(serie);
                    series[i] = serie;
                
                    break;

                case 2:

                    System.out.println("Mostrando informações da plataforma e das séries: ");
                    plataforma.mostraInfo();
                    System.out.println("----------------------------------------------");

                    System.out.println("Mostrando informações das séries: ");
                    for (Serie s : series) 
                    {
                        if(s != null)
                        {
                            s.mostraInfo();
                        }   
                    }


                    break;

                case 3:

                    System.out.println(plataforma.SerieMaisLongaFinalizada());
                    System.out.println("----------------------------------------------");

                    break;

                case 4:

                    System.out.println("Mostrando a porcentagem do número de séries e a média aritmética de notas das que possuem 3 temporadas ou mais: ");
                    plataforma.mediaPorcentagem();

                    break;

                case 5:

                    flag = false;
                    System.out.println("Saindo do menu!");
                    System.out.println("----------------------------------------------");

                    break;

                default:

                    System.out.println("Valor inválido, digite novamente: ");
                    opcao = in.nextInt();

                    break;
            }

            if(flag)
            {
                System.out.println("----------------------------------------------");
                System.out.println("Digite 1 para cadastrar uma série");
                System.out.println("Digite 2 para mostrar informações da plataforma e suas séries");
                System.out.println("Digite 3 para mostrar o nome da série com maior número de temporadas e que já foi finalizada");
                System.out.println("Digite 4 para mostrar a porcentagem do número de séries e a média aritmética de notas das que possuem 3 ou mais temporadas");
                System.out.println("Digite 5 para sair do menu");
                System.out.println("----------------------------------------------");
                opcao = in.nextInt();
                in.nextLine();
            }
            i++;
        }

    }
}
