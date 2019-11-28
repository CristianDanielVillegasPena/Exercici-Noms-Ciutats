import java.util.ArrayList;
import java.util.Collections;

public class Ciutats2 {

	public static void main(String[] args) {
		
		String ciudad1 = "Barcelona";
		String ciudad2 = "Madrid";
		String ciudad3 = "Valencia";
		String ciudad4 = "Malaga";
		String ciudad5 = "Cadis";
		String ciudad6 = "Santander";
		
		ArrayList<String> ciudades=new ArrayList<String> ();
		ciudades.add (ciudad1);
		ciudades.add (ciudad2);
		ciudades.add (ciudad3);
		ciudades.add (ciudad4);
		ciudades.add (ciudad5);
		ciudades.add (ciudad6);
		
		Collections.sort(ciudades); 
		
		System.out.print("Las ciudades son: ");
		for (String ciudad : ciudades) {
			System.out.print(ciudad+",");
		}

		// System.out.println("Las ciudades son: " + ciudades);    //----por si lo quieres con corchetes :)

	}

}
