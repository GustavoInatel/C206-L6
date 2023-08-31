import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        // array primitivo
        // int[] numeros = {1, 3, 45, 56, 67, 90};

        // System.out.println(numeros[6]); //vai dar erro, pois o array vai de 0 a 5
        /*
         * System.out.println(numeros[4]);
         * 
         * for (int i = 0; i < numeros.length; i++)
         * {
         * System.out.println(numeros[i]);
         * }
         */

        /*
         * Conta[] continhas = new Conta[5]; //array do tipo conta
         * Conta c1 = new Conta("Luis", 1040.40);
         * continhas[1] = new Conta("Victor", 100.35); //primeira forma
         * continhas[0] = c1;
         */ // segunda forma

        /*
         * for (Conta c : continhas)
         * {
         * if(c != null)
         * {
         * System.out.println(c.dono);
         * }
         * }
         * 
         * for (int i = 0; i < continhas.length; i++)
         * {
         * if(continhas[i] != null)
         * {
         * System.out.println(continhas[i].dono);
         * }
         * }
         */

        /*
         * for (int i = 0; i < continhas.length; i++)
         * {
         * if(continhas[i] == null)
         * {
         * continhas[i] = c1;
         * }
         * }
         */

        Escola escola = new Escola();
        escola.nome = "Rochel Coc";
        escola.email = "rochelcoc@gmail.com";
        escola.numTelefone = 34413456;
        escola.endereco = "Rua Treze de Maio";

        Estudante[] estudantes = new Estudante[301];

        Scanner in = new Scanner(System.in);

        String resposta;
        int opcao = 0;
        System.out.println("Deseja cadastrar um estudante? Digite sua resposta: ");
        resposta = in.nextLine().toLowerCase();

        while(!(resposta.equals("sim") || resposta.equals("nao")))
        {
            System.out.println("Digite uma resposta válida!");
            resposta = in.nextLine().toLowerCase();
        }

        if (resposta.equals("sim")) {
            System.out.println("Você chegou ao menu. Siga as instruções abaixo:");
            System.out.println("------------------------------------------------------");
            System.out.println("Digite 1 para cadastrar um estudante");
            System.out.println("Digite 2 para  mostrar as informações do estudante");
            System.out.println("Digite 3 para mostrar a quantidade de aluno em cada ano");
            System.out.println("------------------------------------------------------");
            opcao = in.nextInt();
            in.nextLine(); // consumindo a quebra de linha da entrada de int
        }

        int i = 0;
        if (opcao == 2 || opcao == 3 && i == 0) //aqui é pra quando eu quiser informações dos estudantes, só que nenhum ainda foi cadastrado
        {
            System.out.println("Nenhum estudante ainda foi cadastrado!");
        }

        if (opcao != 1 && opcao != 2 && opcao != 3)  //aqui é pra eu inserir valores do menu
        {
            System.out.println("Insira um valor válido!");
        }

        if(opcao == 1)
        {
            while (resposta.equals("sim") && i < estudantes.length) 
            {
                switch (opcao) {

                    case 1:

                        System.out.println("Digite o nome do estudante: ");
                        String nome = in.nextLine();

                        System.out.println("Digite a idade do aluno: ");
                        int idade = in.nextInt();

                        in.nextLine();
                        System.out.println("Digie o ano do aluno: ");
                        String ano = in.nextLine();

                        Estudante estudante = new Estudante(nome, idade, ano);
                        escola.addEstudante(estudante);
                        estudantes[i] = estudante;

                        break;

                    case 2:

                        System.out.println("------------------------------------------------------");
                        System.out.println("Mostrando as informações dos estudantes: ");
                        for (Estudante es : estudantes) 
                        {
                            if(es != null)
                            {
                                System.out.println("Nome: " + es.nome + ", idade: " + es.idade + " e ano: " + es.ano);
                            }
                        }

                        break;

                    case 3:
            
                        escola.qtdEstudantesPorAno(); //pega a quantidade de alunos por ano

                        break;

                    default:

                        System.out.println("Digite um resposta válida!");

                        break;
                }

                System.out.println("------------------------------------------------------");
                System.out.println("Caso queira sair do menu, digite não. Se quiser continuar, digite sim");
                resposta = in.nextLine().toLowerCase();

                while(!(resposta.equals("sim") || resposta.equals("nao")))
                {
                     System.out.println("Digite uma resposta válida!");
                     resposta = in.nextLine().toLowerCase();
                }

                if(resposta.equals( "sim"))
                {
                    System.out.println("Digite 1 para cadastrar um estudante");
                    System.out.println("Digite 2 para  mostrar as informações dos estudantes");
                    System.out.println("Digite 3 para mostrar a quantidade de aluno em cada ano");
                    System.out.println("------------------------------------------------------");
                    opcao = in.nextInt();
                    in.nextLine();
                }
                
                i++;

                if (i >= estudantes.length) 
                {
                    System.out.println("Número máximo de estudantes registrados!");
                }
            }
        }
    }
}