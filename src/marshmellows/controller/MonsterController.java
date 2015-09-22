package marshmellows.controller;

import marshmellows.model.MarshmellowMonster;
import marshmellows.view.MarshmellowOutput;
import java.util.Scanner;

public class MonsterController
{
	private MarshmellowMonster tristanMonster;
	private MarshmellowMonster userMonster;
	private MarshmellowOutput myOutput;
	private Scanner monsterScanner;
	
	public MonsterController()
	{
		int eyes = 2;
		double legs = 2.5;
		double hair = .6;
		int noses = 1;
		boolean hasBellyButton = true;
		String name = "Dr.VanNostran";
		String biography = "My monster grew up in a village outside of Atlantis";
		
		monsterScanner = new Scanner(System.in);
		myOutput = new MarshmellowOutput();
		tristanMonster = new MarshmellowMonster(name, eyes, noses, hair, legs, hasBellyButton);
	}
	
	public void start()
	{
		myOutput.displayMonsterConsole(tristanMonster.toString());
		myOutput.displayMonsterGUI(tristanMonster.toString());
		myOutput.displayGUI(tristanMonster.toString());
		myOutput.displayTristanGUI(tristanMonster.toString());
		//makeUserMonster();
		myOutput.displayMonsterGUI("New Monster info" + userMonster.toString());
	}
	
	private void askQuestions()
	{
		//NAME
		System.out.println("Type in a better name for the monster");
		String betterMonsterName = monsterScanner.next();
		tristanMonster.setMonsterName(betterMonsterName);
		
		//EYES
		System.out.println("Type in a different number of eyes");
		int betterMonsterEyes = monsterScanner.nextInt();
		tristanMonster.setMonsterEyes(betterMonsterEyes);
		
		//NOSES
		System.out.println("Type in a different number of noses");
		int betterMonsterNoses = monsterScanner.nextInt();
		tristanMonster.setMonsterNoses(betterMonsterNoses);
		
		//HAIR
		System.out.println("Type in a different number of hair");
		double betterMonsterHair = monsterScanner.nextDouble();
		tristanMonster.setMonsterHair(betterMonsterHair);
		
		//LEGS
		System.out.println("Type in a different number of Legs");
		double betterMonsterLegs = monsterScanner.nextDouble();
		tristanMonster.setMonsterLegs(betterMonsterLegs);
		
		//BELLY BUTTON
		System.out.println("Does he have a belly button?");
		boolean betterMonsterBellyButton = monsterScanner.nextBoolean();
		
		
		
	}
	
	/**
	 * This method will get the information to create a instance of a MarshmellowMonster.
	 */
	private void makeUserMonster()
	{
		//Step one: Get Variables
		String userName;
		int userEyes;
		int userNoseCount;
		double userHair;
		double userLegs;
		boolean userBellyButton;
		
		//Step two: Define variables by using scanner to get user input.
		
		//Asking for user name
		System.out.println("Type in your name for your monster.");
		userName = monsterScanner.nextLine();
		
		//Asking for user eyes
		System.out.println("Type in the number of eyes for your monster");
		userEyes = monsterScanner.nextInt();
		
		//Asking for user nose count
		System.out.println("Type in the number of noses for your monster");
		userNoseCount = monsterScanner.nextInt();
		
		//Asking for user hair
		System.out.println("Type in the number of hairs for your monster");
		userHair = monsterScanner.nextDouble();
		
		//Asking for user legs
		System.out.println("Type in the number of legs for your monster");
		userLegs = monsterScanner.nextDouble();
		
		//Asking if user wants belly button or not
		System.out.println("Do you want your monster to have a belly button?");
		userBellyButton = monsterScanner.nextBoolean();
		
		
		//Step three: Make a monster - use the Constructor!!
		userMonster = new MarshmellowMonster(userName, userEyes, userNoseCount, userHair, userLegs, userBellyButton);
		
	}

} 






