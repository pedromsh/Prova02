package sistemapenaltis;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

public class StartButton extends JButton implements ActionListener{
	
	//Atributos
	private GameBoard game;
	private boolean on;
	
	//Metodo para criar o botao start
	public JButton setStartButton(String text, GameBoard game) {
		JButton start = new JButton();
		start.setText(text);
		start.addActionListener(this);
		this.game = game;
		
		return start;
	}

	//Metodos getters e setters
	public GameBoard getGame() {
		return game;
	}

	public void setGame(GameBoard game) {
		this.game = game;
	}

	public boolean isOn() {
		return on;
	}

	public void setOn(boolean on) {
		this.on = on;
	}

	//Metodo do evento
	public void actionPerformed(ActionEvent e) {
		for (Cell c : game.getCells()) {
			c.setOn(true);
		}
		
	}
}
