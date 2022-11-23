package sistemapenaltis;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

public class Button extends JButton implements ActionListener{

	private boolean on;
	
	public Button createButton(String text, boolean on) {
		Button b = new Button();
		b.setSize(100, 100);
		b.setText(text);
		this.on = on;
		
		return b;
	}

	public boolean getOn() {
		return on;
	}

	public void setOn(boolean on) {
		this.on = on;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}

}
