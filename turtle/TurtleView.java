package turtle;

import mvc.View;

import java.awt.*;

public class TurtleView extends View {


    public TurtleView(Turtle light) {
        super(light);

    }

    public void paintComponent(Graphics gc) {
        Turtle light = (Turtle) model;
        Graphics2D g2 = (Graphics2D) gc;
        if(light.init)
        {
            light.init = false;
            g2.clearRect(0,0,500,500);
        }
        g2.setStroke(new BasicStroke(6));
//        g2.drawLine(light.x_pos, light.y_pos, light.x_pos - 50, light.y_pos);
        Color oldColor = g2.getColor();

        for(final Turtle.Line l : light.lines)
        {
            g2.setColor(l.color);
            g2.drawLine(l.x1 , l.y1 , l.x2 , l.y2);
        }
        g2.setColor(light.getColor());
        g2.fillOval(light.x_pos, light.y_pos, 15, 15);
		g2.setColor(oldColor);
    }

}
