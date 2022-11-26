package sistemapenaltis;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class Goalkeeper implements ActionListener{

	//Atributos
	private GameBoard game;
	private int gx;
	private int gy;
	
	//Metodo construtor
	public Goalkeeper(GameBoard game) {
		this.game = game;
		
		for (Cell c : game.getCells()) {
			c.getButton().addActionListener(this);
		}
		
		getDefenseArea(game);
	}
	
	//Metodos getters e setters
	public GameBoard getGame() {
		return game;
	}

	public void setGame(GameBoard game) {
		this.game = game;
	}
	
	public int getGx() {
		return gx;
	}

	public void setGx(int gx) {
		this.gx = gx;
	}

	public int getGy() {
		return gy;
	}

	public void setGy(int gy) {
		this.gy = gy;
	}

	//metodo para sortear posicoes
	public void draw() {
		Random generator = new Random();
		this.gx = generator.nextInt(17);
		this.gy = generator.nextInt(9);
	}

	//Metodo para gerar area de defesa do goleiro
	public void getDefenseArea(GameBoard gameBoard) {
		draw();
		
		int initialY = getGy();
		
		int w = 20;
		int cont = 0;

		do {
			for (Cell c : gameBoard.getCells()) {
				if(c.getX() == getGx() && c.getY() == getGy()) {
					c.setDefense(true);
				}
			}
			
			if(cont < 3 && getGy() > 0) {
				this.gy--;
				cont++;
			}
			else {
				this.gy = initialY;
				this.gx++;
				cont = 0;
			}
			
			w--;
			
			
		}while(w > 0);
		
	}
	
	//Metodo para destacar area de atuacao do goleiro
	public void actionArea(GameBoard game) {
		for (Cell c : game.getCells()) {
			if(c.getDefense() == true) {
				c.getButton().setBackground(Color.red);
			}
		}
	}
	
	//Metodo para apagar area de atuacao para poder iniciar nova tentativa
	public void reset() {
		for (Cell c : game.getCells()) {
			if(c.getDefense() == true) {
				c.getButton().setBackground(null);
			}
			
			c.getButton().setIcon(null);
		}
		
	}

	public void actionPerformed(ActionEvent e) {
		
	}
	
}
