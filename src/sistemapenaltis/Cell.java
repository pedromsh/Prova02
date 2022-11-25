package sistemapenaltis;

import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JOptionPane;

public class Cell extends Button implements ActionListener{

	private int x;
	private int y;
	private GoalSection section;
	private JButton button;
	private boolean defenseArea;
	private GameBoard game;
//	private int playerPoint;
//	private int computerPoint;
	private boolean on;
	private Goalkeeper goalkeeper;
	
	public Cell(int x, int y, GoalSection section, JButton button, boolean defenseArea, boolean on, GameBoard game, Goalkeeper goalkeeper) {
		this.x = x;
		this.y = y;
		this.section = section;
		this.button = button;
		this.defenseArea = defenseArea;
		this.on = on;
		this.game = game;
		this.goalkeeper = goalkeeper;
		button.addActionListener(this);
		
	}

	//retorna o valor da coordenada X
	public int getX() {
		return x;
	}

	//define o valor da coordenada X
	public void setX(int x) {
		this.x = x;
	}

	//retorna o valor da coordenada Y
	public int getY() {
		return y;
	}

	//define o valor da coordenada Y
	public void setY(int y) {
		this.y = y;
	}
	
	//retorna um botao
	public JButton getButton() {
		return button;
	}

	//define o botao
	public void setButton(JButton button) {
		this.button = button;
	}

	//retorna se eh uma area de defesa
	public boolean getDefenseArea() {
		return defenseArea;
	}

	public void setDefenseArea(boolean defenseArea) {
		this.defenseArea = defenseArea;
	}

//	//retorna pontuacao do jogador
//	public int getPlayerPoint() {
//		return playerPoint;
//	}
//
//	//conta mais um ponto pro jogador
//	public void setPlayerPoint() {
//		playerPoint++;
//	}
//
//	//retorna pontuacao do computador
//	public int getComputerPoint() {
//		return computerPoint;
//	}
//
//	//conta mais um ponto para o computador
//	public void setComputerPoint() {
//		computerPoint++;
//	}
	
	//retorna o valor de on
	public boolean getOn() {
		return on;
	}

	//define o valor de on
	public void setOn(boolean on) {
		this.on = on;
	}

	public void actionPerformed(ActionEvent e) {
		
		if(getOn() == true) {
			this.button.setIcon(new ImageIcon(new ImageIcon("img/bola.png").getImage().getScaledInstance(50, 50, Image.SCALE_SMOOTH)));
			goalkeeper.actionArea(game);
			
			for (Cell c : game.getCells()) {
				if(c.getDefenseArea() == true)
					game.setComputerPoint();
				else
					game.setPlayerPoint();
			}
				
		}
	}
}
