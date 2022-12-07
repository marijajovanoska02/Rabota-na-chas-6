package zadacha2;
import ava.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		
		List<String> drzavi = new ArrayList<>();

		drzavi.add("Makedonija");
		drzavi.add("Germanija");
		drzavi.add("Portugalija");

		System.out.println("Golemina na listata: " + drzavi.size());

		if (drzavi.size() == 3) {
			drzavi.add("Srbija");
			drzavi.add("Hrvatska");
			System.out.println("Golemina na listata: " + drzavi.size());
			System.out.println("Elementi na listata se: " + drzavi);
		} else 
			System.out.println("Elementi na listata se: " + drzavi);

	}

}
