package turtle;

import mvc.Model;

import javax.swing.*;
import java.awt.*;
import java.io.Serializable;
import java.util.ArrayList;

public class Turtle extends Model  {

    private static final long serialVersionUID = 1L;
    private Color color = Color.blue;
    //    private Color color = new Color(238, 238,238);
    public static Integer WORLD_SIZE = 250; //HEIGHT AND WIDTH

    public static Integer TURTLE_SIZE = 7;  //diameter of turtle
    public static Integer CRUMB_SIZE = 5;    //diameter of point by the turtle
    public int x_pos = 100;

    public int y_pos = 100;

    public boolean penPos = true;
    private Direction direction = Direction.E;
    public final ArrayList<Line> lines = new ArrayList<Line>();

    public Turtle(){
        changed();
    }
    public boolean init = true;
    public void clear() {
        lines.clear();
        changed();

    }

    enum Direction {
        N, S, W, E
    }

    class Line implements Serializable {
        int x1;
        int x2;
        int y1;
        int y2;
        Color color;
        Line(int x1, int y1, int x2, int y2 , Color color) {
            this.x1 = x1;
            this.x2 = x2;
            this.y1 = y1;
            this.y2 = y2;
            this.color = color;
        }
    }

    public Color getColor() {
        return color;
    }

    public void setColor() {

        color = JColorChooser.showDialog(null, "Choose a color", getColor());
        changed();
    }

    public String toString() {
        return "stopLight.color =" + color;
    }


    public void TurnCommand(String new_head) {
        new_head = new_head.toLowerCase();
        switch (new_head) {
            case "east":
                direction = Direction.E;
                break;
            case "west":
                direction = Direction.W;
                break;
            case "north":
                direction = Direction.N;

                break;
            case "south":
                direction = Direction.S;
                break;
            default:
                JOptionPane.showMessageDialog(null, "Invalid new direction\nNothing changed");
                break;
        }
        changed();

    }

    // place pen onto canvas
    public void togglePen() {
//
        penPos = !penPos;
        if(penPos)
            JOptionPane.showMessageDialog(null, "Pen is now Down");
        else
            JOptionPane.showMessageDialog(null, "Pen is now Up");
        changed();

    }


    // turn E from current position
    private void goEast(int amount) {
//
        x_pos = Math.min(220, x_pos + amount);

    }

    // turn W from current position
    private void goWest(int amount) {
        x_pos = Math.max(0, x_pos - amount);

    }

    // draw forward a certain amount
    private void goNorth(int amount) {
        y_pos = Math.max(0, y_pos - amount);

    }

    // draw backwards a certain amount
    private void goSouth(int amount) {

        y_pos = Math.min(220, y_pos + amount);
    }

    public void move(int amount) {

        int old_x = x_pos;
        int old_y = y_pos;
        int x_num = 0;
        int y_num = 0;
        switch (direction) {
            case N:
                goNorth(amount);
                y_num = 7;
                break;
            case S:
                y_num = 7;
                goSouth(amount);
                break;
            case W:
                x_num = 7;
                goWest(amount);
                break;
            case E:
                x_num = 7;
                goEast(amount);
                break;
        }

        if (penPos) {
            Line nline = new Line(old_x, old_y, x_pos, y_pos, color);

            lines.add(nline);
        }
        changed();

    }

}

