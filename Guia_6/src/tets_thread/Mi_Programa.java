
package tets_thread;


public class Mi_Programa extends Thread {
    

    public static void main(String[] args) {
        // Crear instancias de la clase MiHilo
        MiHilo hilo1 = new MiHilo("Hilo 1");
        MiHilo hilo2 = new MiHilo("Hilo 2");
        MiHilo hilo3 = new MiHilo("Hilo 3");

        // Iniciar los hilos
        hilo1.start();
        hilo2.start();
        hilo3.start();
    }

    // Clase que extiende Thread y define el comportamiento del hilo
    static class MiHilo extends Thread {
        private String nombre;

        public MiHilo(String nombre) {
            this.nombre = nombre;
        }

        public void run() {
            for (int i = 1; i <= 5; i++) {
                System.out.println("Ejecutando " + nombre + ": " + i);

                try {
                    // Pausa el hilo durante un tiempo aleatorio
                    Thread.sleep((long) (Math.random() * 1000));
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }

            System.out.println("Finalizando " + nombre);
        }
    }
}
