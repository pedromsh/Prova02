package sistemapenaltis;

import java.awt.FlowLayout;

import javax.swing.JPanel;

public class ScoreBoard extends JPanel{
	
	public ScoreBoard() {
		setLayout(new FlowLayout());
		
		MenuButton b1 = new MenuButton("Iniciar");
		MenuButton b2 = new MenuButton("Finalizar");
		add(b1);
		add(b2);
		
	}
}
