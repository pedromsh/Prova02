package sistemapenaltis;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;

public class ScoreBoard extends JPanel implements ActionListener{
	
	private GameBoard gameBoard;
	
	public ScoreBoard(GameBoard gameBoard) {
		this.gameBoard = gameBoard;
		createButtons();
		
	}
	
	public void createButtons() {
		setLayout(new FlowLayout());
		
		Button start = new Button();
		JButton startButton = start.createButton("Iniciar", true);
		add(startButton);
		startButton.addActionListener(this);
		
		Button b2 = new Button();
		add(b2.createButton("Terminar", false));
	}
	
	public void actionPerformed(ActionEvent e) {
		for (Cell c : gameBoard.getCells()) {
			c.getButton().setOn(true);
			System.out.println("clicado");
		}
	}
}
