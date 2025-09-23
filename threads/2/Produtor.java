import java.util.Random;

public class Produtor extends Thread {
    private final Fila fila;
    private final Random random = new Random();

    public Produtor(Fila fila) {
        this.fila = fila;
    }

    @Override
    public void run() {
        try {
            while (true) {
                int numero = 1 + random.nextInt(100);
                fila.adicionar(numero);
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            // encerra a thread ao ser interrompida
        }
    }
}

