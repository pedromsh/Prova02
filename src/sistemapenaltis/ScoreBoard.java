package sistemapenaltis;

import java.awt.Color;

import javax.swing.JLabel;
import javax.swing.JPanel;

public class ScoreBoard extends JPanel{

	private JLabel label;
	
	public ScoreBoard() {
		createButtons();
		
	}
	
	public void createButtons() {
		Button b1 = new Button("Iniciar");
		add(b1);
		
		Button b2 = new Button("Terminar");
		add(b2);
	}
}
