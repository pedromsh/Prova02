package sistemapenaltis;

import java.awt.GridLayout;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JPanel;

public class GameBoard extends JPanel{

	//Atributos
    private ArrayList<Cell> Cells;
    private int playerPoint;
	private int computerPoint;
	
	//Metodo construtor
	public GameBoard() {
		Cells = new ArrayList<Cell>();
		mapping();
	}
	
	//Metodos getters e setters
	public ArrayList<Cell> getCells() {
		return Cells;
	}

	public void setCells(ArrayList<Cell> cells) {
		Cells = cells;
	}
	
	public int getPlayerPoint() {
		return playerPoint;
	}

	public void setPlayerPoint() {
		playerPoint++;
	}

	public int getComputerPoint() {
		return computerPoint;
	}

	public void setComputerPoint() {
		computerPoint++;
	}

	//Metodo auxiliar
	public void mapping() {
		for (int i = 0; i < 9; i++) {
			auxMapping(i);
		}
	}
	
	//Metodo que cria e mapeia os botoes
	public void auxMapping(int i) {
		for(int j = 0; j < 17; j++) {
			if(j == 0 || j == 16 || i == 0)
				Cells.add(new Cell(j, i, GoalSection.OUT, new JButton(), false, this, new Goalkeeper(this)));
			else if(j == 1 || j == 15 || i == 1)
					Cells.add(new Cell(j, i, GoalSection.GOALPOST, new JButton(), false, this, new Goalkeeper(this)));
			else
				Cells.add(new Cell(j, i, GoalSection.GOAL, new JButton(), false, this, new Goalkeeper(this)));
		}
	}
	
	//Metodo para organizar o layout do painel
	public JPanel organizeLayout() {
		
		JPanel gamePanel = new JPanel();
		gamePanel.setLayout(new GridLayout(9, 17));
		for (Cell c : Cells) {
			gamePanel.add(c.getButton());
		}
		
		return gamePanel;
	}
}
