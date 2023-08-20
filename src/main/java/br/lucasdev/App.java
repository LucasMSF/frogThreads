package br.lucasdev;


/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) throws InterruptedException {
        int totalJumps = 100;
        System.out.printf("Corrida de %d pulos iniciada! \n\n", totalJumps);

        Thread.sleep(2000);

        new Thread(new Frog("Rogerinho", totalJumps)).start();
        new Thread(new Frog("Cláudio", totalJumps)).start();
        new Thread(new Frog("Marquinhos", totalJumps)).start();
        new Thread(new Frog("Otávio", totalJumps)).start();

    }
}
