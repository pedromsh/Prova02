package sistemapenaltis;

import java.awt.GridLayout;
import java.util.ArrayList;

import javax.swing.JPanel;

public class GameBoard extends JPanel{

	private ArrayList<Cell> Cells;
	
	public GameBoard() {
		Cells = new ArrayList<Cell>();
		mapping();
	}
	
	public void mapping() {
		for(int i = 0; i < 9; i++) {
			auxMapping(i);
		}
	}
	
	public void auxMapping(int i) {
		for(int j = 0; j < 17; j++) {
			if(j == 0 || j == 16 || i == 0)
				Cells.add(new Cell(j, i, GoalSection.OUT));
			else if(j == 1 || j == 15 || i == 1)
					Cells.add(new Cell(j, i, GoalSection.GOALPOST));
			else
				Cells.add(new Cell(j, i, GoalSection.GOAL));
		}
	}
	
	public JPanel organizeLayout() {
		setLayout(new GridLayout(9, 18));
		JPanel gamePanel = new JPanel();
		
		for (Cell c : Cells) {
			gamePanel.add(c);
		}
		
		return gamePanel;
	}
}
