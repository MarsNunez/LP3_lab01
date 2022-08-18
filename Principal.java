import java.util.Scanner;

public class Principal {
	public static void main(String[] args) {
		int vida, rp;
		boolean fl = false;
		vida = 0;
		Scanner sc = new Scanner(System.in);
		do {
			vida ++;
			System.out.println("Life(s): " + vida + "\t ¿What's your magic number mate? ");
			rp = sc.nextInt();
			if (rp == 1234)
				fl = true;
		} while (vida < 3 && !fl );
		if (fl == true) {
			System.out.println("You guess it!!!");
		} else {
			System.out.println("Ups... You lose.");
		}
		sc.close();
	}
}

