package aleatoriedad;

import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Game extends Files{
	
	
	 static void gameStart() {
		Scanner input=new Scanner(System.in);
		
		//working with files
		
		Files ob=new Files();
		System.out.println("1. Nuevo Usuario\n2. Usuario existente");
		int fileChoose=Integer.parseInt(input.nextLine());
		if(fileChoose==1) {
			ob.setUser();
			ob.createFile(ob.getUser());
		}else if(fileChoose==2) {
			ob.setUser();
			ob.readFile(ob.getUser());
		}else {
			System.out.println("Thats not an option...");
		}
		

		
		ArrayList<Humano> lst=new ArrayList<Humano>(10);
		Random rand=new Random();
		
		
		//make random
		String[] nombres= {"Jake", "Steezus", "lucas", "Paolo", "Kiki", "Jordan", "Peter", "Manuel", "Jorge", "Dany"};
		
		List<String> shuffled=Arrays.asList(nombres);
		
		Collections.shuffle(shuffled);
		
		shuffled.toArray(nombres);

	
		Humano ob1=new Humano();
		Humano ob2=new Humano();
		Humano ob3=new Humano();
		Humano ob4=new Humano();
		Humano ob5=new Humano();
		Humano ob6=new Humano();
		Humano ob7=new Humano();
		Humano ob8=new Humano();
		Humano ob9=new Humano();
		Humano ob10=new Humano();

		lst.add(ob1);
		lst.add(ob2);
		lst.add(ob3);
		lst.add(ob4);
		lst.add(ob5);
		lst.add(ob6);
		lst.add(ob7);
		lst.add(ob8);
		lst.add(ob9);
		lst.add(ob10);
		
		int k=0;
		for(Humano i:lst) {
			i.setName(nombres[k]);
			k++;
			
		}
		
		
		//No repeating characters
		for(int i=0; i<lst.size();i++) {
			for(int j=0;j<lst.size();j++) {
				if(i!=j) {
					if(lst.get(i).getAlto()==lst.get(j).getAlto() && lst.get(i).getAprobo()==lst.get(j).getAprobo() && lst.get(i).getGracioso()==lst.get(j).getGracioso() && lst.get(i).getPelon()==lst.get(j).getPelon() && lst.get(i).getStatus()==lst.get(j).getStatus()) {
						lst.get(i).setter();
						lst.get(j).setter();
					}
				}
			}
		}
		
		//get functions for all objects Humano
		ob1.getters();
		ob2.getters();
		ob3.getters();
		ob4.getters();
		ob5.getters();
		ob6.getters();
		ob7.getters();
		ob8.getters();
		ob9.getters();
		ob10.getters();
		
		//counter for COMPROBACION
		int instancesAprobo=0;
		int instancesGracioso=0;
		int instancesPelon=0;
		int instancesStatus=0;
		int instancesAlto=0;
		
		
		//COMPROBACION
		for(Humano i:lst) {
			if(i.getAprobo()==true) {
				instancesAprobo++;
			}
			if(i.getGracioso()==true) {
				instancesGracioso++;
			}
			if(i.getPelon()==true) {
				instancesPelon++;
			}
			if(i.getStatus()==true) {
				instancesStatus++;
			}
			if(i.getAlto()==true) {
				instancesAlto++;
			}
		}
		System.out.println("Aprobo: "+instancesAprobo+"\n"+"Gracioso: "+instancesGracioso+"\n"+"Pelon: "+instancesPelon+"\n"+"Status: "+instancesStatus+"\n"+"Alto: "+instancesAlto);
		
		
		System.out.println("\n\n\n\n\n\n");
		System.out.println("\t \t \t \t **********GUESSING GAME**********");
		
		//MENU 3 PREGUNTAS
		
		
		//question counter if >3 break loop
		int questionsMade=0;
		
		//choose random human from list with random pointer
		
		int ranHumanPointer=rand.nextInt(11);
		
		int times1=0;
		int times2=0;
		int times3=0;
		int times4=0;
		int times5=0;
		
		
		
		
		while(questionsMade<3) {
			
			
			System.out.println("1. Aprobo OOP? \n2. Gracioso? \n3. Pelon? \n4. Vivo? \n5. Alto? \n6. Exit");
			String choose=input.nextLine();
			int answer=Integer.parseInt(choose);
			
			if(answer!= 6) {
				switch(answer) {
				
				case 1: 
					//Makes sure the user doesnt ask the question twice
					if(times1<1) {
						if(lst.get(ranHumanPointer).getAprobo()==true) {
							//elimina true
							for(int i=0;i<lst.size();i++) {
								if(lst.get(i).getAprobo()==true) {
								}
								else{
									lst.get(i).setName("*****");
									
								}
								System.out.println(lst.get(i).getName());
							}
						}
						else {
							//elimina false
							for(int i=0; i<lst.size();i++) {
								if(lst.get(i).getAprobo()==false) {
								}
								else{
									lst.get(i).setName("*****");
									
								}
								System.out.println(lst.get(i).getName());
							}
						}
						times1++;
						questionsMade++;
						System.out.println();
					}
					else {
						System.out.println("Question already made...");
					}
					
					
					break;
				
				case 2: 
					if(times2<1) {
						if(lst.get(ranHumanPointer).getGracioso()==true) {
							
							for(int i=0;i<lst.size();i++) {
								if(lst.get(i).getGracioso()==true) {
								}
								else{
									lst.get(i).setName("*****");
								}
								System.out.println(lst.get(i).getName());
							}
						}
						else {
							for(int i=0;i<lst.size();i++) {
								if(lst.get(i).getGracioso()==false) {
								}
								else{
									lst.get(i).setName("*****");
								}
								System.out.println(lst.get(i).getName());
							}
						}
						times2++;
						questionsMade++;
						System.out.println();
					}
					else {
						System.out.println("Question already made...");
					}
					
					break;
				
				case 3: 
					if(times3<1) {
						if(lst.get(ranHumanPointer).getPelon()==true) {
							for(int i=0;i<lst.size();i++) {
								if(lst.get(i).getPelon()==true) {
								}
								else{
									lst.get(i).setName("*****");
								}
								System.out.println(lst.get(i).getName());
							}
						}
						else {
							for(int i=0;i<lst.size();i++) {
								if(lst.get(i).getPelon()==false) {
									System.out.println(lst.get(i).getName());
								}
								else{
									lst.get(i).setName("*****");
								}
								System.out.println(lst.get(i).getName());
							}
						}
						times3++;
						questionsMade++;
						System.out.println();
					}
					else {
						System.out.println("Question already made...");
					}
					
					break;
				
				case 4: 
					if(times4<1) {
						if(lst.get(ranHumanPointer).getStatus()==true) {
							for(int i=0;i<lst.size();i++) {
								if(lst.get(i).getStatus()==true) {
								}
								else{
									lst.get(i).setName("*****");
								}
								System.out.println(lst.get(i).getName());
							}
						}
						else {
							for(int i=0;i<lst.size();i++) {
								if(lst.get(i).getStatus()==false) {
									System.out.println(lst.get(i).getName());
								}
								else{
									lst.get(i).setName("*****");
									
								}
								System.out.println(lst.get(i).getName());
							}
						}
						times4++;
						questionsMade++;
						System.out.println();
					}
					else {
						System.out.println("Question already made...");
					}
					
					break;
					
				case 5:
						if(times5<1) {
							if(lst.get(ranHumanPointer).getAlto()==true) {
								for(int i=0;i<lst.size();i++) {
									if(lst.get(i).getAlto()==true) {
									}
									else{
										lst.get(i).setName("*****");
									}
									System.out.println(lst.get(i).getName());
								}
							}
							else {
								for(int i=0;i<lst.size();i++) {
									if(lst.get(i).getAlto()==false) {
										System.out.println(lst.get(i).getName());
									}
									else{
										lst.get(i).setName("*****");
										
									}
									System.out.println(lst.get(i).getName());
								}
							}
							times5++;
							questionsMade++;
							System.out.println();
							}
						else {
							System.out.println("Question already made...");
						}
					break;
					
				default: System.out.println("Not an option..."); 
				
					break;
				
				
				}
			}
			else if(answer == 6) {
				System.out.println("Exiting.....");
				break;
			}
		}//while
		
		//Final answer reveal
		System.out.println("Make a guess....\n");
		
		
		String guess=input.nextLine();
		
		if(lst.get(ranHumanPointer).getName().equals(guess)) {
			System.out.println("\nCorrect!!!");
			ob.writeToFile("1");
		}
		else {
			System.out.println("Wrong guess....");
			System.out.println("The correct guess was "+lst.get(ranHumanPointer).getName());
	}
	}
}