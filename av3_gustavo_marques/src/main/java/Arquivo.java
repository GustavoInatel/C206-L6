import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.util.ArrayList;

public class Arquivo {

    // Métodos que podemos realizar com o arquivo
    public void escrever(Jogador jogador) {
        // Instanciando os objetos que permitirão a escrita de dados
        OutputStream os = null; // fluxo de entrada
        OutputStreamWriter osw = null; // leitor de fluxo de entrada
        BufferedWriter bw = null; // buffer entrada

        try {
            // Abrindo a saída de dados
            os = new FileOutputStream("Jogadores.txt", true); // Nome do arquivo onde será salvo
            osw = new OutputStreamWriter(os);
            bw = new BufferedWriter(osw);

            // Flag que indica onde começa as informações do Funcionário
            bw.write("++ Jogadores ++");
            bw.newLine();
            bw.write("Nome do jogador: " + jogador.getNome() + "\n");/*  */
            bw.write("Número do jogador: " + jogador.getNumero() + "\n");/*  */
            bw.write("Posição do jogador: " + jogador.getPosicão() + "\n");/*  */
            bw.newLine();

            // 1. Escrita de forma estática, ou seja, direta

            /*
             * linha="Olá mundo 3";
             * bw.write("Olá mundo\n");
             * bw.write("Olá mundo 2");
             * bw.newLine();
             * bw.write("amei demais");
             */

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

    public ArrayList<Jogador> ler() {
        ArrayList<Jogador> encontreiNoArquivo = new ArrayList<>();

        InputStream is = null;
        InputStreamReader isr = null;
        BufferedReader br = null;

        try {
            is = new FileInputStream("Jogadores.txt");
            isr = new InputStreamReader(is);
            br = new BufferedReader(isr);

            String linhaLer;

            Jogador j = null; // Variável para armazenar temporariamente o produto sendo lido

            while ((linhaLer = br.readLine()) != null) {
                if (linhaLer.contains("++ Jogadores ++")) {
                    if (j != null) {
                        encontreiNoArquivo.add(j);
                    }
                    j = new Jogador();
                }

                // preenchendo as informações do arquivo
                else if (linhaLer.contains("Nome do jogador: ")) {
                    j.setNome(linhaLer.substring("Nome do jogador: ".length()));
                }

                else if (linhaLer.startsWith("Número do jogador: ")) {
                    j.setNumero(Integer.parseInt(linhaLer.substring("Número do jogador: ".length())));
                }

                else if (linhaLer.startsWith("Posição do jogador: ")) {
                    j.setPosicão(linhaLer.substring("Posição do jogador: ".length()));
                }
            }

            // Adicione o último jogador lido, pois o loop termina quando não há mais linhas
            // a serem lidas
            if (j != null) {
                encontreiNoArquivo.add(j);
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
