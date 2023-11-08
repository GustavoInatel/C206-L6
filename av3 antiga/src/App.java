import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception 
    {
        boolean flag = true;

        Scanner sc = new Scanner(System.in);
        Arquivo arquivo = new Arquivo();
        List<Produto> p1 = new ArrayList<>();


        while(flag)
        {

            System.out.println("--- MENU ---");
            System.out.println("1 - Adicionar Produto no Arquivo");
            System.out.println("2 - Mostrar informações do Arquivo");
            System.out.println("3 - Ordenar produto em ordem decrescente de preço");
            System.out.println("4 - Quantidade de produtos de cada tipo");
            System.out.println("5 - Sair do Menu");
            System.out.println();
            int opcao = sc.nextInt(); 
            
            switch (opcao) 
            {
                case 1:
                    
                    sc.nextLine();
                    System.out.println("Digite o nome do produto: ");
                    String nome = sc.nextLine();
                    System.out.println();

                    try 
                    {
                        System.out.println("Digite o preço do produto");
                        double preco = sc.nextDouble();
                        System.out.println();

                        if(preco < 0)
                        {
                            throw new InfoInvalidaException("Preço inválido");
                        }   
                        else
                        {

                        }

                        sc.nextLine();
                        System.out.println("Digite o tipo do produto: ");
                        String tipo = sc.nextLine();

                        System.out.println();

                        Produto produto = new Produto(nome, preco, tipo);
                        p1.add(produto);
                        arquivo.escrever(produto);
                        System.out.println("Produto adicionado e cadastrado com sucesso!");

                    } catch (InfoInvalidaException e) 
                    {
                        // TODO: handle exception
                        System.out.println("Preço menor que 0 não existe, digite outro: ");
                        break;
                    }

                    break;

                case 2:

                    p1 = arquivo.ler();

                    System.out.println("Mostrando informações do produto...");
                    System.out.println();

                    for (Produto product : p1)
                    {
                        System.out.println("Nome do produto: " + product.getNome());
                        System.out.println("Preço do produto: " + product.getPreco()); 
                        System.out.println("Tipo do produto: " + product.getTipo());    
                        System.out.println("-------------------------------------");   
                    }
                    break;

                case 3:

                    Collections.sort(p1);

                    System.out.println("Mostrando informações do produto ordenado por preço: ");
                    System.out.println();

                    for (int i = 0; i < p1.size(); i++) 
                    {
                        System.out.println("Nome do produto: " + p1.get(i).getNome());
                        System.out.println("Preço do produto: " + p1.get(i).getPreco()); 
                        System.out.println("Tipo do produto: " + p1.get(i).getTipo());    
                        System.out.println("-------------------------------------");   
                    }  System.out.println("-------------------------------------");      
                    
                    break;

                case 4:

                    int comida = 0, higiene = 0, decoracao = 0;
                    for (int i = 0; i < p1.size(); i++) 
                    {
                        
                        if(p1.get(i).getTipo().equalsIgnoreCase("Comida"))
                        {
                            comida++;
                        }

                        if(p1.get(i).getTipo().equalsIgnoreCase("Higiene"))
                        {
                            higiene++;
                        }

                        if(p1.get(i).getTipo().equalsIgnoreCase("Decoracao"))
                        {
                            decoracao++;
                        }

                    }

                    System.out.println("Quantidade de alimentos: " + comida);
                    System.out.println("Quantidade de produtos de higiene: " + higiene);
                    System.out.println("Quantidade de produtos de decoração: " + decoracao);
                    break;

                case 5:

                    flag = false;
                    break;
            
                default:

                    System.err.println("Digite um valor válido: ");
                    opcao = sc.nextInt();
                    break;
            }
        }
    }
}
