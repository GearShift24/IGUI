package inherit.model;
import javax.swing.JOptionPane;

public class StarWars implements IsABadMovie
{


	public boolean containsNicholasCage() 
	{
		return false;
	}


	public String hasOrangeLookingPeople(String name)
	{
		if(name.equals("yoda"))
				{
					name = "yodaaaaaa";
				}
		else
		{
			name = "Your favorite character is a failulre";
		}
		
		return name;
	}


	public int budgetAmount() 
	{
		
		int budgetAmount = 1000000;
		
		return budgetAmount;
	}


	public void badGraphicsWithHorribleCGAparent() 
	{
	
		
		JOptionPane.showMessageDialog(null, "boi, ALL MOVIE HAVE BAD CG even ster wers!");

	}

}
