import java.util.Scanner;

public class Principal {
	public static void main(String[] args) {
		int vida, rp;
		boolean fl = false;
		vida = 0;
		Scanner sc = new Scanner(System.in);
		do {
			vida ++;
			System.out.println("Vida: " + vida + "\t ¿Cual es tu numero secreto? ");
			rp = sc.nextInt();
			if (rp == 1234)
				fl = true;
		} while (vida < 3 && !fl );
		if (fl == true) {
			System.out.println("Adivinaste!!!");
			Regalo regaloGanador = new Regalo();
			System.out.println(regaloGanador.elegir(vida));
		} else {
			System.out.println("Ups... Perdiste.");
		}
		sc.close();
	}
}