package inherit.view;
import javax.swing.*;
import inherit.controller.InheritController;
import java.awt.Color;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class InheritPanel extends JPanel
{
	private SpringLayout baseLayout;
	private InheritController baseController;
		
	private JButton button1;
	private JButton button2;
	
	public InheritPanel(InheritController baseController)
	{
		this.baseController = baseController;
		this.baseLayout = new SpringLayout();
		
		this.button1 = new JButton("button 1");
		this.button2 = new JButton("button 2");
	
		
		setupPanel();
		setupLayout();
		setupListeners();	
	}
	
	public void setupPanel()
	{
		this.setBackground(Color.ORANGE);
		this.setLayout(baseLayout);
		
		this.add(button1);
		this.add(button2);
	}
	
	private void setupLayout()
	{
		baseLayout.putConstraint(SpringLayout.NORTH, button2, 0, SpringLayout.NORTH, button1);
		baseLayout.putConstraint(SpringLayout.EAST, button2, -33, SpringLayout.EAST, this);
		baseLayout.putConstraint(SpringLayout.NORTH, button1, 54, SpringLayout.NORTH, this);
		baseLayout.putConstraint(SpringLayout.WEST, button1, 24, SpringLayout.WEST, this);
	}
	
	private void setupListeners()
	{
		
	}
}
