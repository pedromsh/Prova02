package sistemapenaltis;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;

public class ScoreBoard extends JPanel{
	
	//Atributos
	private GameBoard gameBoard;
	private Goalkeeper goalkeeper;
	private FinishButton finish;
	private StartButton start;
	private NextButton next;
	
	//Metodo construtor
	public ScoreBoard(GameBoard gameBoard, Goalkeeper goalkeeper) {
		this.gameBoard = gameBoard;
		this.goalkeeper = goalkeeper;
		createButtons();
		
	}
	
	//Metodos getters e setters
	public GameBoard getGameBoard() {
		return gameBoard;
	}

	public void setGameBoard(GameBoard gameBoard) {
		this.gameBoard = gameBoard;
	}

	public Goalkeeper getGoalkeeper() {
		return goalkeeper;
	}

	public void setGoalkeeper(Goalkeeper goalkeeper) {
		this.goalkeeper = goalkeeper;
	}

	public FinishButton getFinish() {
		return finish;
	}

	public void setFinish(FinishButton finish) {
		this.finish = finish;
	}

	public StartButton getStart() {
		return start;
	}

	public void setStart(StartButton start) {
		this.start = start;
	}

	public NextButton getNext() {
		return next;
	}

	public void setNext(NextButton next) {
		this.next = next;
	}

	//Metodo para criar os botoes do painel
	public void createButtons() {
		setLayout(new FlowLayout());
		
		start = new StartButton();
		add(start.setStartButton("Iniciar", gameBoard));
		
		finish = new FinishButton();
		add(finish.setFinishButton("Terminar", gameBoard));
		
		next = new NextButton();
		add(next.setNextButton("Próximo", goalkeeper));
		
	}

}
