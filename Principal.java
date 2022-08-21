import java.util.Scanner;

public class Principal {
	public static void main(String[] args) {
		int vida, rp, premio;
		boolean fl = false;
		vida = 0;
		premio = 1000;
		Scanner sc = new Scanner(System.in);
		do {
			vida ++;
			System.out.println("Vida(s): " + vida + "\t ¿Cual es tu numero magico? ");
			rp = sc.nextInt();
			if (rp == 1234)
				fl = true;
			else 
				premio -= 100;
		} while (vida < 3 && !fl );
		if (fl == true) {
			System.out.println("Adivinaste!, te ganaste un premio.");
			System.out.println("Te ganaste 1000$, pero por cada error que tuviste se te desconto 100$...");
			System.out.println("Tu premio total es: " + premio + "$");
		} else {
			System.out.println("Ups... Perdiste.");
		}
		sc.close();
	}
}

