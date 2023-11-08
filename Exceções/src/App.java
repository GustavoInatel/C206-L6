public class App {
    public static void main(String[] args) throws Exception {
        
        Animal[] animais = new Animal[10];

        Animal a1 = new Animal("Peppga", 15, "Porco");
        Animal a2 = new Animal("Horse", 10, "Cavalo");
        Animal a3 = new Animal("Tobby", 8, "Cachorro");

        animais[0] = a1;
        animais[1] = a2;
        animais[2] = a3;

        try
        {
            for (int i = 0; i < animais.length; i++) 
            {
                System.out.println(animais[i].nome);    
                System.out.println(animais[i].idade);    
                System.out.println(animais[i].raca);    
            }
        }

        catch(Exception e)
        {
            System.out.println("Tem posições vazias no seu array");
        }
    }
}
