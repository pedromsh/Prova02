package sistemapenaltis;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

public class StartButton extends JButton implements ActionListener{
	private GameBoard game;
	private boolean on;
	
	public JButton setStartButton(String text, GameBoard game) {
		JButton start = new JButton();
		start.setText(text);
		start.addActionListener(this);
		this.game = game;
		
		return start;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		for (Cell c : game.getCells()) {
			c.setOn(true);
		}
		System.out.println("clicado");
		
	}
}
