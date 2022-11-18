package sistemapenaltis;

import java.awt.BorderLayout;
import java.awt.Dimension;

import javax.swing.JFrame;

public class Window extends JFrame{

	public Window() {
		setLayout(new BorderLayout());
		
		setSize(850, 700);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		ScoreBoard score = new ScoreBoard();
		score.setPreferredSize(new Dimension(850, 100));
		add(score, BorderLayout.NORTH);
		
		GameBoard board = new GameBoard();
		add(board, BorderLayout.CENTER);
		
		setVisible(true);
	}
	
//	public void layout() {
//		setLayout(new BorderLayout());
//		
//		ScoreBoard score = new ScoreBoard();
//		add(score, BorderLayout.NORTH);
//		
//		GameBoard board = new GameBoard();
//		add(board, BorderLayout.CENTER);
//	}
}
