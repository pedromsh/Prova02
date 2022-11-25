package sistemapenaltis;

import java.awt.GridLayout;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JPanel;

public class GameBoard extends JPanel{

    private ArrayList<Cell> Cells;
    private int playerPoint;
	private int computerPoint;
	
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
	
	// retorna pontuacao do jogador
	public int getPlayerPoint() {
		return playerPoint;
	}

	// conta mais um ponto pro jogador
	public void setPlayerPoint() {
		playerPoint++;
	}

	// retorna pontuacao do computador
	public int getComputerPoint() {
		return computerPoint;
	}

	// conta mais um ponto para o computador
	public void setComputerPoint() {
		computerPoint++;
	}

	public void mapping() {
		for (int i = 0; i < 9; i++) {
			auxMapping(i);
		}
	}
	
	public void auxMapping(int i) {
		for(int j = 0; j < 17; j++) {
			if(j == 0 || j == 16 || i == 0)
				Cells.add(new Cell(j, i, GoalSection.OUT, new JButton(), false, false, this, new Goalkeeper(this)));
			else if(j == 1 || j == 15 || i == 1)
					Cells.add(new Cell(j, i, GoalSection.GOALPOST, new JButton(), false, false, this, new Goalkeeper(this)));
			else
				Cells.add(new Cell(j, i, GoalSection.GOAL, new JButton(), false, false, this, new Goalkeeper(this)));
		}
	}
	
	public JPanel organizeLayout() {
		
		JPanel gamePanel = new JPanel();
		gamePanel.setLayout(new GridLayout(9, 17));
		for (Cell c : Cells) {
			gamePanel.add(c.getButton());
		}
		
		return gamePanel;
	}
}
