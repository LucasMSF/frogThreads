package br.lucasdev;


import java.util.Random;

public class Frog implements Runnable {
    private final String name;
    private final int totalJumps;

    public Frog(String name, int totalJumps) {
        this.name = name;
        this.totalJumps = totalJumps;
    }

    @Override
    public void run() {
        int totalJumps = 0;
        Random random = new Random();

        try {
            Thread.sleep(random.nextInt(5000 - 1000) + 1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        while(totalJumps < this.totalJumps) {
            totalJumps++;
        }

        System.out.printf("O sapo %s finalizou a corrida. \n", this.name);
    }
}
