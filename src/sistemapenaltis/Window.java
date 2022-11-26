package sistemapenaltis;

import java.awt.BorderLayout;

import javax.swing.JFrame;

public class Window extends JFrame{

	//Metodo construtor
	public Window() {
		setSize(850, 700);
		setTitle("Sistema de Pênaltis");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		organizeLayout();
		setVisible(true);
	}
	
	//metodo para criar e organizar os paineis
	public void organizeLayout() {
		setLayout(new BorderLayout());
		
		GameBoard board = new GameBoard();
		add(board.organizeLayout(), BorderLayout.CENTER);
	
		ScoreBoard score = new ScoreBoard(board, new Goalkeeper(board));
		add(score, BorderLayout.NORTH);
		
		Pointing point = new Pointing(board);
		add(point, BorderLayout.SOUTH);
	}
}
