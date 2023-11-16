import java.io.*;
import java.util.ArrayList;

public class Arquivo {

    // Métodos que podemos realizar com o arquivo
    public void escrever(Produto produto) 
    {
        // Instanciando os objetos que permitirão a escrita de dados
        OutputStream os = null; // fluxo de entrada
        OutputStreamWriter osw = null; //leitor de fluxo de entrada
        BufferedWriter bw = null; //buffer entrada

        try {
            // Abrindo a saída de dados
            os = new FileOutputStream("Produtos.txt", true); // Nome do arquivo onde será salvo
            osw = new OutputStreamWriter(os);
            bw = new BufferedWriter(osw);


            // Flag que indica onde começa as informações do Funcionário
            bw.write("++ Produtos ++");
            bw.newLine();
            bw.write("Nome do produto: " + produto.getNome() + "\n");/*  */
            bw.write("Preço do produto: " + produto.getPreco() + "\n");/*  */
            bw.write("Tipo do produto: " + produto.getTipo() + "\n");/*  */ 
            bw.newLine();
        
           
    

            // 1. Escrita de forma estática, ou seja, direta

            /* linha="Olá mundo 3";
            bw.write("Olá mundo\n");
            bw.write("Olá mundo 2");
            bw.newLine();
            bw.write("amei demais"); */



        } catch (Exception e) {
            System.out.println("ERRO: " + e);
        } finally {
            // Fechando a entrada de dados
            try {
                bw.close();
            } catch (Exception e) {
            }
        }
    }

    // 2. Método ler


    public ArrayList<Produto> ler() {
        ArrayList<Produto> encontreiNoArquivo = new ArrayList<>();
    
        InputStream is = null;
        InputStreamReader isr = null;
        BufferedReader br = null;
        
        try 
        {
            is = new FileInputStream("Produtos.txt");
            isr = new InputStreamReader(is);
            br = new BufferedReader(isr);
    
            String linhaLer;
    
            Produto p = null;  // Variável para armazenar temporariamente o produto sendo lido
    
            while ((linhaLer = br.readLine()) != null) 
            { 
                if (linhaLer.contains("++ Produtos ++")) 
                {
                    if (p != null) 
                    {
                        encontreiNoArquivo.add(p);
                    }
                    p = new Produto();
                } 
                
                //preenchendo as informações do arquivo
                else if(linhaLer.contains("Nome do produto: ")) 
                {
                    p.setNome(linhaLer.substring("Nome do produto: ".length()));
                } 

                else if(linhaLer.startsWith("Preço do produto: "))  //esse é diferente por ser um double, e não uma string
                {
                    p.setPreco(Double.parseDouble(linhaLer.substring("Preço do produto: ".length())));
                } 
                
                else if(linhaLer.startsWith("Tipo do produto: ")) 
                {
                    p.setTipo(linhaLer.substring("Tipo do produto: ".length()));
                }
            }
    
            // Adicione o último produto lido, pois o loop termina quando não há mais linhas a serem lidas
            if (p != null) {
                encontreiNoArquivo.add(p);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (br != null) {
                    br.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    
        return encontreiNoArquivo;
    }
    
}
