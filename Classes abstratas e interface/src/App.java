public class App {
    public static void main(String[] args) throws Exception {
        
        Professor p1 = new Professor();
        p1.executaACao();

        Engenheiro e1 = new Engenheiro();
        e1.executaACao();
        e1.gerencia();
        
    }
}
