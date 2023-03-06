package aleatoriedad;

public class Humano extends Persona{
	
	public Humano(){
		
		super.setAprobo();
		super.setGracioso();
		super.setPelon();
		super.setStatus();
		super.setAlto();
	}
	
	void setter() {
		super.setAprobo();
		super.setAlto();
		super.setGracioso();
		super.setPelon();
		super.setStatus();
	}

	void getters() {
		System.out.println(super.getName());
		System.out.println(super.getAprobo());
		System.out.println(super.getGracioso());
		System.out.println(super.getPelon());
		System.out.println(super.getStatus());
		System.out.println(super.getAlto());
		System.out.println();
	}
	
}
