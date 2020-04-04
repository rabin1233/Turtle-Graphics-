package turtle;

import mvc.AppFactory;
import mvc.Command;
import mvc.Model;

import javax.swing.*;

public class TurtleFactory implements AppFactory {


	public Model makeModel() {

		return new Turtle();
	}
	

	 public String[] getEditCommands() {
		 return new String[] {"Turn" , "Move" , "Clear", "Pen", "Color" }; }
	 

	public Command makeEditCommand(Model model, String type) {


		if (type == "Turn")
			return new TurnCommand(model);

			if (type == "Move")
				return new MoveCommand(model);


			if (type == "Clear")
			{
				JOptionPane.showMessageDialog(null, "All lines are cleared");

				return new ClearCommand(model);}


			if (type == "Pen")
				return new PenCommand(model);


			if (type == "Color")
			{
				return new ColorCommand(model);

			}
			return null;

	}
	public String getTitle() { return "Turtle Graphics"; }

	public String[] getHelp() {
		return new String[] {"click Change to cycle through colors"};
	}

	public String about() {
		return "Turtle Grapchics version 1.0. Copyright 2020 by Cyberdellic Designs";
	}

}