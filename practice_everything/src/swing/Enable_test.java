package swing;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

class MyFrame_3 extends JFrame {
	public MyFrame_3() {
		this.setTitle("Enable Test");
		this.setSize(700, 700);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(new FlowLayout());
		
		JPanel panel = new JPanel();
		JButton button_1 = new JButton("버튼_1");
		JButton button_2 = new JButton("버튼_2");
		JButton button_3 = new JButton("버튼_3");
		
		panel.add(button_1);
		panel.add(button_2);
		panel.add(button_3);
		
		this.add(panel);
		
		button_3.setEnabled(false);
		
		this.setVisible(true);
	}
}

public class Enable_test {
	public static void main(String[] args) {
		MyFrame_3 frame = new MyFrame_3();
	}
}
