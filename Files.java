package aleatoriedad;

import java.io.*;
import java.util.Scanner;

public class Files {
	Scanner input=new Scanner(System.in);
	FileWriter fileWriter=null;
	PrintWriter printWriter=null;
	File userFile=null;
	
	private String username;
	private int userScore;
	
	void setUser() {
		System.out.println("Cual es el nombre del usuario?");
		//get User
		username=input.nextLine();
	}
	
	String getUser() {
		return username;
	}
	
	int getScore() {
		return userScore;
	}
	
	void setScore(int score) {
		this.userScore=score;
	}
	
	void createFile(String username) {
		
		userFile=new File(username+".txt");
		if(userFile.exists()) {
			System.out.println("File already exists\n");

		}
		else {
			try {
				userFile.createNewFile();
				setScore(0);
				String scoreStr=String.valueOf(getScore());
				writeToFile(scoreStr);
				System.out.println("File created\n");
			}
			catch(IOException e) {
				e.printStackTrace();
			}
		}
		
	}
	
	void readFile(String username) {
		//file exists
		userFile=new File(username+".txt");
		if(userFile.exists()) {
			System.out.println("File exists...\n");
			try {
				FileReader fileReader = new FileReader(userFile);
				BufferedReader bufReader = new BufferedReader(fileReader);
				//Integer.parseInt(str);
				String scorePrint = bufReader.readLine();
				int scoreSetter=Integer.parseInt(scorePrint);
				setScore(scoreSetter);
				System.out.println("User score: " + getScore());
			}catch(IOException e) {
				e.printStackTrace();
			}
			}
		else {
			System.out.println("File not found...\n");
		}
		
	}
	
	void writeToFile(String printable) {
		try {
			fileWriter = new FileWriter(this.userFile);
			printWriter = new PrintWriter(fileWriter);
			int updateValue = Integer.parseInt(printable);
			int activeScore=getScore();
			setScore(activeScore+updateValue);
			String updatedScore=String.valueOf(getScore());
			printWriter.print(updatedScore);
		} catch (IOException e) {
			e.printStackTrace();
		}finally{
			//close resources
			try {
			fileWriter.close();
			printWriter.close();
			} catch (IOException e) {
			e.printStackTrace();
			}
		}
	}
	void updateScore() {
		
	}
}//main
