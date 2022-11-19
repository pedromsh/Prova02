package sistemapenaltis;

import java.awt.BorderLayout;

import javax.swing.JFrame;

public class Window extends JFrame{

	public Window() {
		setSize(850, 700);
		setTitle("Sistema de Pênaltis");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		organizeLayout();
		setVisible(true);
	}
	
	public void organizeLayout() {
		setLayout(new BorderLayout());
		
		ScoreBoard score = new ScoreBoard();
		add(score, BorderLayout.NORTH);
		
		GameBoard board = new GameBoard();
		add(board.organizeLayout(), BorderLayout.SOUTH);
	}
}
