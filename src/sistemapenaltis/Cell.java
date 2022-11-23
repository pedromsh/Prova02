package sistemapenaltis;

import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;

public class Cell extends Button implements ActionListener{

	private int x;
	private int y;
	private GoalSection section;
	private Button button;
	
	public Cell(int x, int y, GoalSection section, Button button) {
		this.x = x;
		this.y = y;
		this.section = section;
		this.button = button;
		
		JButton buttonAux = new JButton();
		buttonAux = button.createButton(null, false);
		buttonAux.addActionListener(this);
		
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
	
	public Button getButton() {
		return button;
	}

	public void setButton(Button button) {
		this.button = button;
	}

	public void actionPerformed(ActionEvent e) {
			System.out.println("oi");
	}
	
	
}
