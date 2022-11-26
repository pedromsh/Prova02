package sistemapenaltis;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JLabel;
import javax.swing.JPanel;

public class Pointing extends JPanel implements ActionListener{

	//Atributos
	private GameBoard game;
	private JLabel player;
	private JLabel computer;
	
	//Metodo cosntrutor
	public Pointing(GameBoard game) {
		this.game = game;
		organizeLayout();
		addActionListener(game);
	}
	
	//Metodos getters e setters
	public GameBoard getGame() {
		return game;
	}

	public void setGame(GameBoard game) {
		this.game = game;
	}

	public JLabel getPlayer() {
		return player;
	}

	public void setPlayer(JLabel player) {
		this.player = player;
	}

	public JLabel getComputer() {
		return computer;
	}

	public void setComputer(JLabel computer) {
		this.computer = computer;
	}

	//Metodo para criar e organizar layout das label
	public void organizeLayout() {
        setLayout(new FlowLayout());
		
		player = new JLabel("Jogador: " + game.getPlayerPoint());
		add(player);
		
		computer = new JLabel("Computador: " + game.getComputerPoint());
		add(computer);
	}
	
	//Metodo para adicionar ActionListener
	public void addActionListener(GameBoard game) {
		for (Cell c : game.getCells()) {
			c.getButton().addActionListener(this);
		}
	}

	//Metodo do evento
	public void actionPerformed(ActionEvent e) {
		computer.setText("Computador: " + game.getComputerPoint());
		player.setText("Jogador: " + game.getPlayerPoint());
	}
	
}
