package sistemapenaltis;

import java.util.Random;

public class Goalkeeper {

	private GameBoard gameBoard;
	
	public Goalkeeper(GameBoard gameBoard) {
		this.gameBoard = gameBoard;
		getDefenseArea(gameBoard);
	}
	
	//gerar area de defesa do goleiro
	public void getDefenseArea(GameBoard gameBoard) {
		Random generator = new Random();
		
		int x = generator.nextInt(17);
		int y = generator.nextInt(9);
		int initialY = y;
		
		int w = 28;
		int cont = 0;

		do {
			for (Cell c : gameBoard.getCells()) {
				if(c.getX() == x && c.getY() == y) {
					c.setDefenseArea(true);
				}
			}
			
			if(cont < 4 && y > 0) {
				y = y - 1;
				cont++;
			}
			else if(x < 17){
				y = initialY;
				x = x + 1;
				cont = 0;
			}
			
			w--;
			
			
		}while(w > 0 || x < 17);
		
	}
	
}
