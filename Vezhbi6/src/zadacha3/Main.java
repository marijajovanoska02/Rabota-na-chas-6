package zadacha3;
import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		
		List<String> smerovi = new ArrayList<>();

		smerovi.add("INKI");
		smerovi.add("IKT");
		smerovi.add(2, "VIIK");

		System.out.println("Elementi na listata se: " + smerovi);

	}

}
