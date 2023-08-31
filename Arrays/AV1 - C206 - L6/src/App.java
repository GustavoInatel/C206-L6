import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        
        Aldeia aldeia = new Aldeia();
        aldeia.nome = "Sunagakure";
        aldeia.qtdMoradores = 50;
        aldeia.regiao = "País do vento";

        Ninja[] ninjas = new Ninja[10];
        Scanner in = new Scanner(System.in);

        boolean flag = true;
        int opcao;

        System.out.println("-------------------------------------------------");
        System.out.println("Bem-vido ao menu. Siga as informações abaixo: ");
        System.out.println("Digite 1 para cadastrar um ninja.");
        System.out.println("Digite 2 para mostrar as informações da aldeia e seus ninjas.");
        System.out.println("Digite 3 para mostrar o ninjas de rank S.");
        System.out.println("Digite 4 para mostrar a quantidades de ninjas Gennin, Chunnin e ANBU.");
        System.out.println("Digite 5 para sair do menu.");
        System.out.println("-------------------------------------------------");
        opcao = in.nextInt();
        in.nextLine(); //tem que colocar isso, porque usaremos String depois

        int i = 0;
        while(flag)
        {
            switch(opcao)
            {
                case 1:

                    System.out.println("Digite o nome do ninja: ");
                    String nome = in.nextLine();

                    System.out.println("Digite a idade do ninja: ");
                    int idade = in.nextInt();

                    in.nextLine();
                    System.out.println("Digite o título do ninja: ");
                    String titulo = in.nextLine();

                    System.out.println("Digite o ranking do ninja:");
                    String ranking = in.nextLine();

                    Ninja ninja = new Ninja(nome, idade, titulo, ranking);
                    aldeia.adicionarNinja(ninja);
                    ninjas[i] = ninja;

                    break;

                case 2:

                    System.out.println("Mostrando informações da aldeia: ");
                    System.out.println("-------------------------------------------------");
                    aldeia.mostraInfo();
                    System.out.println("-------------------------------------------------");
                    System.out.println("Mostrando informações dos ninjas: ");
                    for (Ninja n : ninjas) 
                    {
                        if(n != null)
                        {
                            System.out.println("Nome do ninja: " + n.nome);
                            System.out.println("Idade do ninja: " + n.idade);
                            System.out.println("Título do ninja: " + n.titulo);
                            System.out.println("Ranking do ninja: " + n.ranking);
                            System.out.println("-------------------------------------------------");
                        }    
                    }

                    break;

                case 3:

                        System.out.println("Nome do(s) ninja(s) ranking S: ");
                        System.out.println("-------------------------------------------------");
                        aldeia.RankingS();
                        System.out.println("-------------------------------------------------");

                    break;

                case 4:

                        System.out.println("Mostrando as quantidades de títulos dos ninjas: ");
                        System.out.println("-------------------------------------------------");
                        aldeia.qtdTitulos();
                        System.out.println("-------------------------------------------------");

                    break;

                case 5:

                        flag = false;
                        System.out.println("Saindo do menu: ");
                        System.out.println("-------------------------------------------------");

                    break;

                default:

                    System.out.println("Por favor, insira um valor válido");
                    opcao = in.nextInt();

                    break;
            }

            if(flag != false)
            {
                System.out.println("Deseja usar o menu novamente? ");
                System.out.println("Digite 1 para cadastrar um ninja.");
                System.out.println("Digite 2 para mostrar as informações da aldeia e seus ninjas.");
                System.out.println("Digite 3 para mostrar o ninjas de rank S.");
                System.out.println("Digite 4 para mostrar a quantidades de ninjas Gennin, Chunnin e ANBU.");
                System.out.println("Digite 5 para sair do menu.");
                System.out.println("-------------------------------------------------");
                opcao = in.nextInt();
                in.nextLine(); //tem que colocar isso, porque usaremos String depois
            }

            i++;
        }
    }
}
