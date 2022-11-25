package sistemapenaltis;

import java.awt.FlowLayout;

import javax.swing.JLabel;
import javax.swing.JPanel;

public class Pointing extends JPanel {

	private GameBoard game;
	
	public Pointing(GameBoard game) {
		this.game = game;
		organizeLayout();
	}
	
	public void organizeLayout() {
        setLayout(new FlowLayout());
		
		JLabel player = new JLabel("Jogador: " + game.getPlayerPoint());
		add(player);
		
		JLabel computer = new JLabel("Computador: " + game.getComputerPoint());
		add(computer);
	}
	
}
