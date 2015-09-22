package marshmellows.view;

import javax.swing.JOptionPane;

public class MarshmellowOutput
{
	public void displayMonsterConsole(String info)
	{
		System.out.println("My monster info is :" + info);
	}
	
	public void displayMonsterGUI(String info)
	{
		JOptionPane.showMessageDialog(null, "My monster information is:" + info);
	}
	
	public void displayGUI(String info)
	{
		JOptionPane.showMessageDialog(null, "Error: no computer found.");
	}
	
	public void displayTristanGUI(String info)
	{
		JOptionPane.showMessageDialog(null, "Erro: no Jake found");
	}
}
