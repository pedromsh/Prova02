package sistemapenaltis;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;

public class ScoreBoard extends JPanel{
	
	private GameBoard gameBoard;
	private Goalkeeper goalkeeper;
	private FinishButton finish;
	private StartButton start;
	private NextButton next;
	
	public ScoreBoard(GameBoard gameBoard, Goalkeeper goalkeeper) {
		this.gameBoard = gameBoard;
		this.goalkeeper = goalkeeper;
		createButtons();
		
	}
	
	public void createButtons() {
		setLayout(new FlowLayout());
		
		start = new StartButton();
		add(start.setStartButton("Iniciar", gameBoard));
		
		finish = new FinishButton();
		add(finish.setFinishButton("Terminar"));
		
		next = new NextButton();
		add(next.setNextButton("Próximo", goalkeeper));
		
	}

}
