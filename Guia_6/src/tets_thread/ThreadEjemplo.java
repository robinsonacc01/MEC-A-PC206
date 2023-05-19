
package tets_thread;

import java.lang.Thread;

public class ThreadEjemplo extends Thread {
    
    
    
    
public class DosHilos extends Thread{




@override
public void run(){
	for(int i = 0; i < 10; i++){
		System.out.println(“Hilo nuevo”);
   	}
}


Crear una instancia de la nueva clase.

DosHilos dh = new DosHilos();

Invocar el método start() en la instancia para iniciar el hilo.

dh.start();

Código completo:

public class TwoThread extends Thread {
	public void run() {
		for ( int i = 0; i < 10; i++ ) {
			System.out.println(“Hilo nuevo”);
		}
	}

	public static void main(String[] args) {
		TwoThread tt = new TwoThread();
		tt.start();

		for ( int i = 0; i < 10; i++ ) {
			System.out.println(“Hilo principal”);
		}


