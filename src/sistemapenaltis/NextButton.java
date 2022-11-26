package sistemapenaltis;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

public class NextButton extends JButton implements ActionListener{

	//Atributos
	private Goalkeeper goalkeeper;
	private GameBoard game;
	
	public JButton setNextButton(String text, Goalkeeper goalkeeper) {
		JButton next = new JButton();
		next.setText(text);
		next.addActionListener(this);
		this.goalkeeper = goalkeeper;
		this.game = goalkeeper.getGame();
		
		return next;
	}

	//Metodos getters e setters
	public Goalkeeper getGoalkeeper() {
		return goalkeeper;
	}

	public void setGoalkeeper(Goalkeeper goalkeeper) {
		this.goalkeeper = goalkeeper;
	}

	public GameBoard getGame() {
		return game;
	}

	public void setGame(GameBoard game) {
		this.game = game;
	}

	//Metodo do evento
	public void actionPerformed(ActionEvent e) {
		goalkeeper.reset();
	}
}
