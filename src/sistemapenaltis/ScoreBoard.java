package sistemapenaltis;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;

public class ScoreBoard extends JPanel{
	
	private GameBoard gameBoard;
	private FinishButton finish;
	
	public ScoreBoard(GameBoard gameBoard) {
		this.gameBoard = gameBoard;
		createButtons();
		
	}
	
	public void createButtons() {
		setLayout(new FlowLayout());
		
		StartButton start = new StartButton();
		add(start.setStartButton("Iniciar", gameBoard));
		
		finish = new FinishButton();
		add(finish.setFinishButton("Terminar"));
		
	}

}
