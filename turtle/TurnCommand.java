package turtle;

import mvc.Command;
import mvc.Model;

import javax.swing.*;
import java.awt.*;

public class TurnCommand extends Command{
	private JTextField loanAmt; // !! Make field private
	private Component frame;

	public String getLoanAmtText() {
		return loanAmt.getText();
	}
	public TurnCommand(Model model) {
		super(model);
		// TODO Auto-generated constructor stub
	}
		@Override
		public void execute() {
			// TODO Auto-generated method stub
			Turtle turn = (Turtle)model;
			String heading = JOptionPane.showInputDialog(frame, "enter heading");

			turn.TurnCommand(heading);
		}
}
