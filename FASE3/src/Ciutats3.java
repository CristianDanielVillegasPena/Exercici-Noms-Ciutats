import java.util.ArrayList;
import java.util.Collections;

public class Ciutats3 {

	public static void main(String[] args) {
		
		String ciudad1 = "Barcelona";
		String ciudad2 = "Madrid";
		String ciudad3 = "Valencia";
		String ciudad4 = "Malaga";
		String ciudad5 = "Cadis";
		String ciudad6 = "Santander";
		String ciudad7 = "Almeria";				// Ciudad extra
		
		ArrayList<String> ciudades=new ArrayList<String> ();
		ciudades.add (ciudad1);
		ciudades.add (ciudad2);
		ciudades.add (ciudad3);
		ciudades.add (ciudad4);
		ciudades.add (ciudad5);
		ciudades.add (ciudad6);
		ciudades.add (ciudad7);
		
		Collections.sort(ciudades); 
		
		String ciudadesModi = String.join(", ", ciudades);
		
		String ciudad = ciudadesModi.replace('a','4').replace('A','4');
		
		System.out.print("Las ciudades son: " + ciudad);
	}

}
