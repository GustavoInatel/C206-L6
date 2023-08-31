public class App {
    public static void main(String[] args) throws Exception {

        Funcionário funcionario1 = new Funcionário("Marcelo", 21, 300, 11111);
        Funcionário funcionario2 = new Funcionário("Luiz", 20, 500, 22222222);

        /*
        funcionario1.nome = "Marcelo";
        funcionario1.cpf = 1111111111;
        funcionario1.idade = 21;
        funcionario1.salario = 300;

        funcionario2.nome = "Luis";
        funcionario2.cpf = 000000;
        funcionario2.idade = 20;
        funcionario2.salario = 500;
        */

        funcionario1.tirarFerias("Dezembro ", 2);
        System.out.println("O salário sem décimo terceiro é de : " + funcionario1.salarioAnual());
        System.out.println("O salário com décimo terceiro é de: " + funcionario1.salarioAnual(300));


        /*
        Nave nave = new Nave();
        nave.nome = "Xwing";
        nave.velocidade = 200;

        Arma armadanave = new Arma();
        armadanave.tipo = "Fogo";
        armadanave.poder = 20;

        /*
        System.out.println(nave.arma);
        nave.addArma(armadanave);
        System.out.println(nave.arma.tipo);
         

         System.out.println(nave.arma.tipo); 
         */

         //esse  é um dos tipos de composição, onde o construtor da classe do objeto todo recebe também os atributos da classe do objeto parte como parâmetros
         

    }
}
