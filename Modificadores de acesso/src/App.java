public class App {
    public static void main(String[] args) throws Exception {

        /* Teste t1 = new Teste();
        Teste t2 = new Teste();
        Teste t3 = new Teste(); */

        Conta[] continhas = new Conta[5];
        Conta c1 = new Conta();
        c1.nome = "Victor";
        c1.cpf = 00000;
        c1.setSaldo(100);
        
        Conta c2 = new Conta();
        c2.nome = "Pedro Braz";
        c2.cpf = 111111;
        c2.setSaldo(900);

        Conta c3 = new Conta();
        c3.nome  = "Luiz";
        c3.cpf = 33333;
        c3.setSaldo(1200);

        continhas[0] = c1;
        continhas[1] = c2;
        continhas[2] = c3;

        for (int i = 0; i < continhas.length; i++) 
        {    
            if(continhas[i] != null)
            {
                System.out.println(continhas[i].getSaldo());
            }
        }
    }
}
