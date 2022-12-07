package zadacha9;
import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		
		List<Fakultet> fakulteti = new ArrayList<Fakultet>();

		fakulteti.add(new Fakultet ("FIKT", 2, 1000));
		fakulteti.add(new Fakultet ("Veterinren", 2, 100));
		fakulteti.add(new Fakultet ("Zemjodelski", 4,1890));
		fakulteti.add(new Fakultet ("Ekonomski", 7, 200));
		fakulteti.add(new Fakultet ("Praven", 5, 400));

		System.out.println("Elementi na listat se: ");
		for (int i=0; i<fakulteti.size(); i++) {
			System.out.print("Fakultet: " + fakulteti.get(i).getIme());
			System.out.print("|| Broj na smerovi: " + fakulteti.get(i).getBrNaSmerovi());
			System.out.println("|| Broj na studenti: " + fakulteti.get(i).getVkStudenti());
		
		}
	}
}


