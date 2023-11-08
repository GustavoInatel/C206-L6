public final class App {
     public static void main(String[] args) 
    {
        Exercito exercito = new Exercito("Exército Brasileiro");

        Sargento sargento = new Sargento("Marques", 87656545477L, "Mecânico de Aviônicos", 500, true);
        Oficial oficial = new Oficial("Souza", 17356525477L, "Tenente-Coronel", false);
        MedicoMilitar medicoMilitar = new MedicoMilitar("Pereira", 78645632145L, 10, 300, true);

        exercito.addSoldado(sargento);
        exercito.addSoldado(oficial);
        exercito.addSoldado(medicoMilitar);

        exercito.mostraInfo();
        System.out.println("Quantidade de soldados: " + Soldado.qtdSoldado);

    

    }
}
