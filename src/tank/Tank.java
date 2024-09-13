package tank;
import java.util.ArrayList;
import java.util.Scanner;

public class Tank {
	
	ArrayList<Organism> organisms = new ArrayList<>();
	Coordinate size;
	
	public Tank() {}

	//que código horroroso. Precisa melhorar.
	
	public void addOrganism() {
		System.out.println("""
				p - Plant
				f - Fish
				Insira (p/f): """);
		Scanner s = new Scanner(System.in);
		String awnser;
		awnser = s.nextLine();
		if(awnser.contains("p")) {
			organisms.add(new Plant());
		}
		else if (awnser.contains("p")){
			System.out.println("""
					c - Carnivorous
					h - Herbivorous
					Insira (c/h): """);
			awnser = s.nextLine();
			if(awnser.contains("c")) {
				organisms.add(new Carnivorous());
			}
			else if(awnser.contains("h")) {
				organisms.add(new Herbivorous());
			}
			else System.out.println("Valor inválido!");
		}
		else System.out.println("Valor inválido!");
		
	}
}
