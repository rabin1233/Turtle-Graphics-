package turtle;

import mvc.AppFactory;
import mvc.AppPanel;

import javax.swing.*;
import java.awt.*;


public class TurtlePanel extends AppPanel {
	

	private JButton turn;
	private JButton move;
	private JButton clear;
	private JButton pen;
	private JButton color;
	
	
	public TurtlePanel(AppFactory factory) {
		super(factory);
		TurtleView view = new TurtleView((Turtle)model);
		//addView(view);
		this.setLayout(new GridLayout(1, 2));
		//this.setLayout(new BorderLayout());

		turn = new JButton("Turn");
		turn.addActionListener(this);
		
		
		move = new JButton("Move");
		move.addActionListener(this);
		
		clear = new JButton("Clear");
		clear.addActionListener(this);
	
		
		pen = new JButton("Pen");
		pen.addActionListener(this);
		
		color = new JButton("Color");
		color.addActionListener(this);
		
		JPanel buttonPanel = new JPanel();
		buttonPanel.setLayout(new FlowLayout());
		

		buttonPanel.add(turn);
		buttonPanel.add(move);
		buttonPanel.add(clear);
		buttonPanel.add(pen);
		buttonPanel.add(color);
		
		move.setLayout(new GridLayout(4,5));
		
		add(buttonPanel, "West");
		add(view, "East");

	}


	public static void main(String[] args) {
		AppFactory factory = new TurtleFactory();
		AppPanel panel = new TurtlePanel(factory);
		panel.display();
	}

}
