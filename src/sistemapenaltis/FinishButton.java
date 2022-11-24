package sistemapenaltis;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JOptionPane;

public class FinishButton extends JButton implements ActionListener{
	private Cell cell;
	
	public JButton setFinishButton(String text) {
		JButton finish = new JButton();
		finish.setText(text);
		finish.addActionListener(this);
		
		return finish;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		JOptionPane.showMessageDialog(null, "Pontuação do jogador: " + cell.getPlayerPoint() + "\nPontuação do computador: "
				+ cell.getComputerPoint());
	}
}
