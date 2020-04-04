package turtle;

import mvc.*;

public class ClearCommand extends Command {

	public ClearCommand(Model model) {
		super(model);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void execute() {
		// TODO Auto-generated method stub
		Turtle turtle = (Turtle) model;
		turtle.clear();
	}

}
