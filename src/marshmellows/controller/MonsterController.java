package marshmellows.controller;

import marshmellows.model.MarshmellowMonster;
import marshmellows.view.MarshmellowOutput;
import java.util.Scanner;

public class MonsterController
{
	private MarshmellowMonster tristanMonster;
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
		tristanMonster = new MarshmellowMonster(biography, name, eyes, noses, hair, legs, hasBellyButton);
	}
	
	public void start()
	{
		myOutput.displayMonsterInfo(tristanMonster.toString());
		askQuestions();
		myOutput.displayMonsterInfo("New Monster info" + tristanMonster.toString());
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
}






