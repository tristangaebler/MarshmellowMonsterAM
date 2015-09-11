package marshmellows.model;

public class MarshmellowMonster
{
	private String monsterName;
	private int monsterEyes;
	private int monsterNoses;
	private double monsterHair;
	private double monsterLegs;
	private boolean monsterBellyButton;
	
	private MarshmellowMonster() 
	{
		
	}
	
	public MarshmellowMonster(String monsterName, int monsterEyes, int monsterNoses, double monsterHair, double monsterLegs, boolean monsterBellyButton)
	{
		this.monsterName = monsterName;
		this.monsterEyes = monsterEyes;
		this.monsterNoses = monsterNoses;
		this.monsterHair = monsterHair;
		this.monsterLegs = monsterLegs;
		this.monsterBellyButton = monsterBellyButton;
	}
	
	public String toString()
	{
		String monster = "This monster has" + monsterEyes + "eyes, and its' name is " + monsterName;
		
		return monster;
	}
}






