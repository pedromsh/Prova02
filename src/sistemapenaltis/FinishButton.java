package sistemapenaltis;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JOptionPane;

public class FinishButton extends JButton implements ActionListener{
	private GameBoard game;
	
	public JButton setFinishButton(String text, GameBoard game) {
		JButton finish = new JButton();
		finish.setText(text);
		this.game = game;
		finish.addActionListener(this);
		
		return finish;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		JOptionPane.showMessageDialog(null, "Pontuação do jogador: " + game.getPlayerPoint() + "\nPontuação do computador: "
				+ game.getComputerPoint(), "Resultado", JOptionPane.DEFAULT_OPTION);
	}
}
