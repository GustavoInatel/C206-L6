import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {

        // introdução java
        // variáveis
        int valor;
        double peso;

        // constante
        int idade = 20;

        // String não é um tipo, é uma classe, pois começa com letra maiúscula, assim
        // como outras classes
        String nome = "Silas";
        System.out.println(nome);

        double altura1 = 1.70;
        float altura2;

        altura2 = (float) altura1; // casting

        Scanner in = new Scanner(System.in); // entrada de dados

        System.out.println("Entre com sua idade: ");
        idade = in.nextInt();

        System.out.println("Entre com o seu peso: ");
        peso = in.nextDouble();

        in.nextLine();// tenho que botar isso, porque digitei um número antes e tenho que digitar uma String logo depois

        System.out.println("Entre com o seu nome: ");
        String nomealuno = in.nextLine();

        // variável para if else
        int deposito = 100;
        int transferencia = 100;
        int saldo = deposito + transferencia;

        if (saldo >= 200) {
            System.out.println("Você consegue comprar!");
        } else {
            System.out.println("Falta dinheiro!");
        }

        // contagem de 1 até 10
        for (int i = 0; i < 10; i++) {
            System.out.println(i + 1);
        }
    }
}
