package sistemapenaltis;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class Goalkeeper implements ActionListener{

	private GameBoard game;
	
	public Goalkeeper(GameBoard game) {
		this.game = game;
		getDefenseArea(game);
		
		for (Cell c : game.getCells()) {
			c.getButton().addActionListener(this);
		}
	}
	
	//gerar area de defesa do goleiro
	public void getDefenseArea(GameBoard gameBoard) {
		Random generator = new Random();
		
		int x = generator.nextInt(17);
		int y = generator.nextInt(9);
		int initialY = y;
		
		int w = 20;
		int cont = 0;

		do {
			for (Cell c : gameBoard.getCells()) {
				if((c.getX() == x) && (c.getY() == y)) {
					c.setDefenseArea(true);
				}
			}
			
			if(cont < 3 && y > 0) {
				y = y - 1;
				cont++;
			}
			else {
				y = initialY;
				x = x + 1;
				cont = 0;
			}
			
			w--;
			
			
		}while(w > 0);
		
	}
	
	//Metodo para destacar area de atuacao do goleiro
	public void actionArea(GameBoard game) {
		for (Cell c : game.getCells()) {
			if(c.getDefenseArea() == true) {
				c.getButton().setBackground(Color.red);
			}
		}
	}
	
	//Metodo para apagar area de atuacao para poder iniciar nova tentativa
	public void reset() {
		for (Cell c : game.getCells()) {
			if(c.getDefenseArea() == true) {
				c.getButton().setBackground(null);
			}
			
			c.getButton().setIcon(null);
		}
		
		getDefenseArea(game);
	}

	//Retorna o gameboard
	public GameBoard getGame() {
		return game;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
	}
	
}
