package sistemapenaltis;

import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JOptionPane;

public class Cell extends JButton implements ActionListener{

	//Atributos
	private int x;
	private int y;
	private GoalSection section;
	private JButton button;
	private boolean defense;
	private GameBoard game;
	private boolean on;
	private Goalkeeper goalkeeper;
	private ActionEvent event;
	
	//Metodo construtor
	public Cell(int x, int y, GoalSection section, JButton button, boolean on, GameBoard game, Goalkeeper goalkeeper) {
		this.x = x;
		this.y = y;
		this.section = section;
		this.button = button;
		this.defense = false;
		this.on = on;
		this.game = game;
		this.goalkeeper = goalkeeper;
		button.addActionListener(this);
		
	}

	//Metodos getters e setters
	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public JButton getButton() {
		return button;
	}

	public void setButton(JButton button) {
		this.button = button;
	}

	public boolean getDefense() {
		return defense;
	}

	public void setDefense(boolean defenseArea) {
		this.defense = defenseArea;
	}
	
	public boolean getOn() {
		return on;
	}

	public void setOn(boolean on) {
		this.on = on;
	}

	public ActionEvent getEvent() {
		return event;
	}

	public void setEvent(ActionEvent event) {
		this.event = event;
	}

	public GoalSection getSection() {
		return section;
	}

	public void setSection(GoalSection section) {
		this.section = section;
	}

	public GameBoard getGame() {
		return game;
	}

	public void setGame(GameBoard game) {
		this.game = game;
	}

	public Goalkeeper getGoalkeeper() {
		return goalkeeper;
	}

	public void setGoalkeeper(Goalkeeper goalkeeper) {
		this.goalkeeper = goalkeeper;
	}

	//Metodo do evento - captura o clique em um botao celula
	public void actionPerformed(ActionEvent e) {
		
		if(getOn() == true) {
			this.button.setIcon(new ImageIcon(new ImageIcon("img/bola.png").getImage().getScaledInstance(50, 50, Image.SCALE_SMOOTH)));
			
			goalkeeper.actionArea(game);
			
			event = e;
			
			for (Cell c : game.getCells()) {
				if(c.getEvent() == event) {
					if(c.getDefense() == false && (c.getSection() != GoalSection.OUT || c.getSection() != GoalSection.GOALPOST))
						game.setPlayerPoint();
					else
						game.setComputerPoint();
				}
			}
				
		}
	}
}
