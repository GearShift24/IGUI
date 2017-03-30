package inherit.view;

import javax.swing.JFrame;
import inherit.controller.InheritController;
import java.awt.Dimension;

public class InheritFrame extends JFrame
{
	private InheritController baseController;
	private InheritPanel appPanel;
	
	public InheritFrame(InheritController baseController)
	{
		super();
		this.baseController = baseController;
		appPanel = new InheritPanel(baseController);
		
		setupFrame();
	}
	
	private void setupFrame()
	{
		this.setContentPane(appPanel);
		this.setTitle("Inherit App");
		this.setSize(new Dimension(800,800));
		this.setResizable(false);
		this.setVisible(true);
	}
}
