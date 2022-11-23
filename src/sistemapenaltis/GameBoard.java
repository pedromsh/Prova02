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
	
	public ArrayList<Cell> getCells() {
		return Cells;
	}

	public void setCells(ArrayList<Cell> cells) {
		Cells = cells;
	}
	
	public void mapping() {
		for(int i = 0; i < 9; i++) {
			auxMapping(i);
		}
	}
	
	public void auxMapping(int i) {
		for(int j = 0; j < 17; j++) {
			if(j == 0 || j == 16 || i == 0)
				Cells.add(new Cell(j, i, GoalSection.OUT, new Button().createButton(null, false), false));
			else if(j == 1 || j == 15 || i == 1)
					Cells.add(new Cell(j, i, GoalSection.GOALPOST, new Button().createButton(null, false), false));
			else
				Cells.add(new Cell(j, i, GoalSection.GOAL, new Button().createButton(null, false), false));
		}
	}
	
	public JPanel organizeLayout() {
		
		JPanel gamePanel = new JPanel();
		gamePanel.setLayout(new GridLayout(9, 17));
		for (Cell c : Cells) {
			gamePanel.add(c.createButton(null, false));
		}
		
		return gamePanel;
	}
}
