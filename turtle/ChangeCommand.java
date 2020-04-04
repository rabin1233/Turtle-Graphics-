package turtle;

import mvc.*;

public class ChangeCommand extends Command{
	
	public ChangeCommand(Model model) {
		super(model);
	}
	
	public void execute() {
		Turtle light = (Turtle)model;
		light.changed();
	}
}