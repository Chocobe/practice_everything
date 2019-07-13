package swing;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

class MyFrame_2 extends JFrame {
	public MyFrame_2() {
		this.setTitle("Label test");
		this.setSize(700, 700);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(new FlowLayout());		
		
		JPanel panel = new JPanel();
		JLabel label = new JLabel("안녕하세요");
		JButton button = new JButton("버트은");
		
		panel.add(label);
		panel.add(button);
		this.add(panel);
		
		this.setVisible(true);
	}
}

public class Label_Tester {
	public static void main(String[] args) {
		MyFrame_2 frame = new MyFrame_2();
	}
}
