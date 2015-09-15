package marshmellows.controller;

import marshmellows.model.MarshmellowMonster;
import marshmellows.view.MarshmellowOutput;

public class MonsterController
{
	private MarshmellowMonster tristanMonster;
	private MarshmellowOutput myOutput;
	
	public MonsterController()
	{
		int eyes = 2;
		double legs = 2.5;
		double hair = .6;
		int noses = 1;
		boolean hasBellyButton = true;
		String name = "Dr.VanNostran";
		String biography = "My monster grew up in a village outside of Atlantis";
		
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
		
	}
}






