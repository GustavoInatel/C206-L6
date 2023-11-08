
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.util.ArrayList;

public class Arquivo {

    // Configurando o método de escrever no Arquivo
    public void escrever(Produto produto) {

        // Criando as estruturas que permitirão escrever o arquivo
        OutputStream os = null;
        OutputStreamWriter osw = null;
        BufferedWriter bw = null;

        // try catch para possíveis erros
        try {

            // Informamos o nome do arquivo onde queremos armazernar nossas informações
            os = new FileOutputStream("Produtos.txt", true);
            // Ponte que transforma de stream para caracteres para stream de bytes
            osw = new OutputStreamWriter(os);
            // Em bw escreveremos a informação que queremos salvar no nosso txt
            bw = new BufferedWriter(osw);

            // Escrevendo uma linha referência
            bw.write("--- Produto ---");
            bw.newLine();
            // Pegando os dados do Produto e escrevendo no arquivo
            bw.write(produto.getNome() + "\n");
            bw.write(produto.getPreco() + "\n");
            bw.write(produto.getTipo() + "\n");

        } catch (Exception e) {
        } finally {
            try {
                bw.close();
            } catch (Exception e) {
            }
        }

    }

    public ArrayList<Produto> ler() {

        // Classes básias para realizar a leitura de dados de um arquivo
        InputStream is = null;
        InputStreamReader isr = null;
        BufferedReader br = null;

        // Variável auxiliar para ler as informações
        String linhaLer;

        // Array que vai armazer os Produto encontrados no arquivo
        ArrayList<Produto> arrayProdutos = new ArrayList<>();

        try {

            is = new FileInputStream("Produtos.txt");
            isr = new InputStreamReader(is);
            br = new BufferedReader(isr);

            linhaLer = br.readLine(); // Coloca o cursor no inicio do arquivo txt

            // Enquanto tiver informações no txt seguimos lendo as informações
            while (linhaLer != null) {

                // Verificando se a string encontrou a flag
                if (linhaLer.contains("--- Produto ---")) {

                    // Variavel auxiliar de Produto, que servirá para salver posteriormente o
                    // Produto do arquivo
                    Produto aux = new Produto();

                    // Preenchendo as informações do Produto
                    aux.setNome(br.readLine());
                    aux.setPreco(Double.parseDouble(br.readLine()));
                    aux.setTipo(br.readLine());

                    // Colocando o produto no arraylist
                    arrayProdutos.add(aux);
                }

                // Voltando a variável novamente ao inicio do arquivo
                linhaLer = br.readLine();
            }

        } catch (Exception e) {
            System.out.println(e);

        } finally {
            try {
                br.close();
            } catch (Exception e) {
                System.out.println(e);
            }
        }

        // Retornando o arraylist para a main
        return arrayProdutos;
    }
}