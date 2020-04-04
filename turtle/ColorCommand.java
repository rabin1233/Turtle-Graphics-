package turtle;

import mvc.Command;
import mvc.Model;

public class ColorCommand extends Command {
    public ColorCommand(Model model) {
        super(model);
        // TODO Auto-generated constructor stub

    }
    @Override
    public void execute() {
        // TODO Auto-generated method stub
        Turtle turn = (Turtle)model;
        turn.setColor();

    }
}
