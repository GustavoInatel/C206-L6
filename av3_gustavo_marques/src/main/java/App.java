import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner in = new Scanner(System.in); //importando scanner para fazer entrada de dados
        Arquivo arquivo = new Arquivo(); //criando um objeto de arquivo para poder escrever e ler no arquivo
        List<Jogador> player = new ArrayList<>(); //criando um arraylist para armazenar as informações dos jogadores 

        boolean flag = true; //flag para sair do while

        while (flag) 
        {
            System.out.println("*** Bem-Vindo(a) ao Menu! ***");
            System.out.println("Digite 1 para salvar as informações do jogador no arquivo txt");
            System.out.println("Digite 2 para mostrar as informações dos jogadores salvos no arquivo txt");
            System.out.println("Digite 3 para ordenar os jogadores em ordem decrescente em relação ao número");
            System.out.println("Digite 4 para mostrar a quantidade de jogadores existentes em cada posição");
            System.out.println("Digite 5 para sair do menu");
            System.out.println();
            int opcao = in.nextInt(); //opção que o usuário vai digitar

            switch (opcao) 
            {

                case 1:

                    //entrando com as informações de cada jogador
                    System.out.println("Digite o nome do jogador: ");
                    in.nextLine();
                    String Nome = in.nextLine();
                    System.out.println();

                    //usando o try-catch para tratar da exceção
                    try 
                    {
                        System.out.println("Digite o número da camisa do jogador: ");
                        int Numero = in.nextInt();
                        System.out.println();

                        if (Numero <= 0) //caso o número da camiseta seja menor ou igual a 0, o terminal vai reportar o erro usando a mensagem do catch
                        {
                            throw new InfoInvalidaException("Número inválido!");
                        }

                        else 
                        {

                        }

                        System.out.println("Digite a posição do jogador: ");
                        in.nextLine();
                        String Posicao = in.nextLine();

                        Jogador jogador = new Jogador(Nome, Numero, Posicao); //colocando os atributos no objeto de jogador
                        player.add(jogador); //adicionando o objeto ao arraylist
                        arquivo.escrever(jogador); //usando o método de escrever do arquivo pegando as informações do arraylist

                        System.out.println("Jogador adicionado com sucesso!"); //deu tudo certo
                    }

                    catch (InfoInvalidaException e) //se entrou aqui, é porque foi inserido um número menor ou igual a 0
                    {
                        System.out.println("Número menor ou igual a zero, digite um número maior: ");
                        System.out.println();
                        break;
                    }

                    System.out.println();

                    break;

                case 2:

                    //usando o método ler da classe arquivo para ler o arraylist e mostrar pelo terminal
                    player = arquivo.ler();

                    System.out.println("Mostrando as informações do jogador: ");
                    System.out.println("--------------------------------------");

                    //iterando o arraylist e mostrando as informações
                    for (Jogador j : player) 
                    {
                        System.out.println("Nome do jogador: " + j.getNome());
                        System.out.println("Número da camisa do jogador: " + j.getNumero());
                        System.out.println("Posição do jogador: " + j.getPosicão());
                        System.out.println();
                    }

                    System.out.println();

                    break;

                case 3:

                    //ordenando os objetos de jogador usando o atributo "Numero" de cada um por ordem decrescente
                    Collections.sort(player);

                    System.out.println("Mostrando informações dos jogadores ordenados em ordem decrescente");
                    System.out.println("-----------------------------------------");

                    //iterando o arraylist e mostrando as informações
                    for (Jogador j : player) {
                        System.out.println("Nome do jogador: " + j.getNome());
                        System.out.println("Número da camisa do jogador: " + j.getNumero());
                        System.out.println("Posição do jogador: " + j.getPosicão());
                        System.out.println();
                    }

                    System.out.println();

                    break;

                case 4:

                    //contando os tipos de cada e mostrando no terminal
                    int goleiro = 0, atacante = 0, zagueiro = 0;

                    for (int i = 0; i < player.size(); i++) {
                        if (player.get(i).getPosicão().equalsIgnoreCase("Goleiro")) {
                            goleiro++;
                        }
                        if (player.get(i).getPosicão().equalsIgnoreCase("Atacante")) {
                            atacante++;
                        }
                        if (player.get(i).getPosicão().equalsIgnoreCase("Zagueiro")) {
                            zagueiro++;
                        }
                    }

                    System.out.println("Quantidade de goleiros no time: " + goleiro);
                    System.out.println("Quantidade de atacantes no time: " + atacante);
                    System.out.println("Quantidade de zagueiros no time: " + zagueiro);

                    break;

                case 5:

                    //saindo do while, caso o usuário tenha digitado 5
                    flag = false; // saindo do menu
                    break;

                default:

                    System.out.println("Digite um valor válido: "); // caso alguém insira qualquer outro falor diferente
                                                                    // de 1, 2, 3, 4 e 5
                    opcao = in.nextInt();
                    break;
            }
        }

    }
}
