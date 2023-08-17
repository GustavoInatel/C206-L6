import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        
        double peso;
        double altura;
        double imc;

        Scanner input = new Scanner(System.in);

        System.out.println("Por favor, informe o seu peso em quilos: " );
        peso = input.nextDouble();

        System.out.println("Por favor, informe a sua altura em metros: ");
        altura = input.nextDouble();

        imc = peso/(Math.pow(altura, 2));//math é uma classe e pow é um método

        if(imc < 18.5)
        {
            System.out.println("Você está abaixo do peso!");
        }

        if(imc > 18.5 && imc < 24.9)
        {
            System.out.println("Você possui um peso normal!");
        }

        if(imc > 25 && imc < 29.9)
        {
            System.out.println("Você está com sobrepeso!");
        }

        if(imc > 30 && imc < 34.9)
        {
            System.out.println("Você está com grau de obesidade I!");
        }
        if(imc > 35 && imc < 39.9)
        {
            System.out.println("Você está com grau de obesidade II!");
        }
        if(imc >= 40)
        {
            System.out.println("Você está com grau de obesidade III ou mórbida!");
        }
    }
}
