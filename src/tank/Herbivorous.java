package tank;

public class Herbivorous extends Fish{
	
	public Herbivorous() {
		super();
	}
	
	public void hunt() {
		System.out.println(this.nome + " is hunting for food");
	}
	
	public void consume() {
		System.out.println(nome + " is eating...");
	}
}
