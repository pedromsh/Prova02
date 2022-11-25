package sistemapenaltis;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

public class NextButton extends JButton implements ActionListener{

	private Goalkeeper goalkeeper;
	
	public JButton setNextButton(String text, Goalkeeper goalkeeper) {
		JButton next = new JButton();
		next.setText(text);
		next.addActionListener(this);
		this.goalkeeper = goalkeeper;
		
		return next;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		goalkeeper.reset();
		
	}
}
