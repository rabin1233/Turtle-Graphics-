package turtle;

import java.awt.Color;
import java.io.Serializable;

public class point implements Serializable  {
	public Integer x, y;
	  public Color color;
	  public point(Integer x, Integer y, Color color) {
	     super();
	     this.x = x;
	     this.y = y;
	     this.color = color;
	  }
}
