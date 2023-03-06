package aleatoriedad;
import java.util.Random;
import java.util.Stack;

abstract class Persona {
	
	//attributes
	private String name;
	private boolean status;
	private boolean aprobo;
	private boolean pelon;
	private boolean gracioso;
	private boolean alto;
	
	//random
	Random rand=new Random();
	//TODO OPTIMIZE WITH A STACK
	Stack<Integer> choice=new Stack<Integer>();
	
	// 4 attributes each 40 total	20/20 if the chance is 50%
	
	public void setName(String name) {
		this.name=name;
	}
	public String getName() {
		return name;
	}
	public void setStatus() {
		int choice=rand.nextInt(2);
		if(choice==1) {
			status=true;
		}
		else {
			status=false;
		}
	}
	public boolean getStatus() {
		return status;
	}
	public void setAprobo() {
		int choice=rand.nextInt(2);
		if(choice==1) {
			aprobo=true;
		}
		else {
			aprobo=false;
		}
	}
	public boolean getAprobo() {
		return aprobo;
	}
	public void setPelon() {
		int choice=rand.nextInt(2);
		if(choice==1) {
			pelon=true;
		}
		else {
			pelon=false;
		}
	}
	public boolean getPelon() {
		return pelon;
	}
	public void setGracioso() {
		int choice=rand.nextInt(2);
		if(choice==1) {
			gracioso=true;
		}
		else {
			gracioso=false;
		}
	}
	public boolean getGracioso() {
		return gracioso;
	}
	public void setAlto() {
		int choice=rand.nextInt(2);
		if(choice==1) {
			alto=true;
		}
		else {
			alto=false;
		}
	}
	public boolean getAlto() {
		return alto;
	}
}
