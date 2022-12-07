package zadacha4;
import java.util.ArrayList;
import java.util.List;
import java.util.*;

public class Main {

	public static void main(String[] args) {
		
		List<Integer> celiBroevi = new ArrayList<>();

		celiBroevi.add(5);
		celiBroevi.add(9);
		celiBroevi.add(8);
		celiBroevi.add(7);
		celiBroevi.add(6);

		Collections.sort(celiBroevi);

		System.out.println("Elementi na listata se: " + celiBroevi);

	}

}
