import java.util.Scanner;

public class Ciutats1 {

	private static Scanner teclado;

	public static void main(String[] args) {

		String ciudad1 = null;
		String ciudad2 = null;
		String ciudad3 = null;
		String ciudad4 = null;
		String ciudad5 = null;
		String ciudad6 = null;

        teclado = new Scanner(System.in);
        System.out.print("Introduzca ciudad: ");
        ciudad1 = teclado.nextLine();
        ciudad2 = teclado.nextLine();
        ciudad3 = teclado.nextLine();
        ciudad4 = teclado.nextLine();
        ciudad5 = teclado.nextLine();
        ciudad6 = teclado.nextLine();
        System.out.println(ciudad1);
        System.out.println(ciudad2);
        System.out.println(ciudad3);
        System.out.println(ciudad4);
        System.out.println(ciudad5);
        System.out.println(ciudad6);

	}

}
