package turtle;

import mvc.Command;
import mvc.Model;

import javax.swing.*;

import static javax.swing.JOptionPane.showInputDialog;

public class MoveCommand extends Command{

	public MoveCommand(Model model) {
		super(model);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void execute() {
		// TODO Auto-generated method stub
		Turtle turn = (Turtle)model;
		String heading = showInputDialog(null, "How Far ?");
		int distance = 0;
		try {

			 distance = Integer.parseInt(heading);
		}catch (Exception e)
		{
			JOptionPane.showMessageDialog(null, "invalid distance, integers only");

		}

		turn.move(distance);
	}

}
