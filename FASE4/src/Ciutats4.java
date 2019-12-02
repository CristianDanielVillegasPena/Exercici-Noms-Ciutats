import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;

public class Ciutats4 {

	public static void main(String[] args) {

		String ciudad = "Barcelona " + "Madrid " + "Valencia " + "Malaga " + "Cadis " + "Santander ";

		char[] ciudades = ciudad.toCharArray();
		List<Character> todas = new ArrayList<>();

		for (char c : ciudades)
			todas.add(c);

		Collections.reverse(todas);
		ListIterator<Character> reves = todas.listIterator();
		while (reves.hasNext())
			System.out.print(reves.next());

		// El resultado es lo que pides, pero la manera de hacerlo creo que no es del
		// todo correcta (aunque se que hay 100 maneras de hacerlo)

	}

}
