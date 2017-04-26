package inherit.controller;
import inherit.view.InheritFrame;
import java.util.ArrayList;
import inherit.model.*;

public class InheritController 
{
	private InheritFrame appFrame;
	private ArrayList<IsABadMovie> myList;
	
	private void setupList()
	{
		myList.add(new StarWars());
		myList.add(new Poop());
	}
	
	
	public String doListStuff()
	{
		String displayResults = "";
		for(IsABadMovie currentBad : myList)
		{
			//CALL METHODS HERE
			displayResults += "nicholas cage is here?" + currentBad.containsNicholasCage();
			displayResults += "\n";
			
			if(currentBad instanceof StarWars)
			{
				displayResults += "Star wars is a movie \n";
			}
			
			displayResults += currentBad.hasOrangeLookingPeople("yoda");
			displayResults += "\n";
			
			displayResults += "it cost bout " + currentBad.budgetAmount();
			displayResults += "\n";
			
			currentBad.badGraphicsWithHorribleCGAparent();
				
			
		}
		
		return displayResults;
	}
	
	
	public InheritController()
	{
		appFrame = new InheritFrame(this);
	}
	
	public void start()
	{
		setupList();
	}
}
