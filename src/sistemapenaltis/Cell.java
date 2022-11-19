package sistemapenaltis;

import javax.swing.JButton;

public class Cell extends JButton{

	private int x;
	private int y;
	private GoalSection section;
	
	public Cell(int x, int y, GoalSection section) {
		this.x = x;
		this.y = y;
		this.section = section;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}
	
	
}
