package turtle;

import mvc.*;

public class PenCommand extends Command {

	public PenCommand(Model model) {
		super(model);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void execute() {
		// TODO Auto-generated method stub
		Turtle turn = (Turtle)model;
		turn.togglePen();
	}

}
