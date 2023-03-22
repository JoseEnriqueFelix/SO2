package tarea05;

class Productor extends Thread {

    private Buffer buffer;
    private final String letras = "abcdefghijklmnopqrstuvxyz";
    
    public Productor(Buffer buffer) {
        this.buffer = buffer;
    }
    
    public void run() {
        while (true) {
            // Obtenemos una letra al azar
            char c = letras.charAt((int) (Math.random() * letras.length()));
            // Producimos un valor
            buffer.producir(c);
            System.out.println("Depositado el caracter " + c + " del buffer");
            try {
                // Esperamos entre 0 y 4 segundos
                sleep((int) (Math.random() * 4000));
            } catch (InterruptedException e) { }
        }
    }
}
