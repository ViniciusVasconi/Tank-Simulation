package tank;

public class Carnivorous extends Fish{
	
	int damage;
	
	public Carnivorous() {
		super();
		this.damage = (int) (Organism.MAX_DAMAGE*Math.random());	// random damage in instantiation 
	}
	
	public void hunt() {
		System.out.println(this.nome + " is hunting for food");
	}
	
	public void consume() {
		System.out.println(nome + " is eating...");
	}
}
