public class App {
    public static void main(String[] args) throws Exception {
        
        ThreadContadora tc1 = new ThreadContadora("Thread 1", 500);
        ThreadContadora tc2 = new ThreadContadora("Thread 2", 1000);
        ThreadContadora tc3 = new ThreadContadora("Thread 3", 2000);
/* 
//esse é o usando interface
        Thread t1 = new Thread(tc1);
        Thread t2 = new Thread(tc2);
        Thread t3 = new Thread(tc3);
 */
        tc1.start();
        tc2.start();
        tc3.start();
    }
}
