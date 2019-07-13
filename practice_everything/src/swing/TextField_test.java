package swing;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

class MyFrame_4 extends JFrame {
	public MyFrame_4() {
		this.setTitle("TextField test");
		this.setSize(700, 700);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(new FlowLayout());
		
		JPanel panel = new JPanel();
		JButton button = new JButton("헬로");
		JTextField text_field_1 = new JTextField(10);
		JTextField text_field_2 = new JTextField(10);
		
		text_field_2.setEditable(false);
		text_field_2.setText("쓸수 없지롱");
		
		panel.add(text_field_1);
		panel.add(button);
		panel.add(text_field_2);
		
		this.add(panel);
		
		this.setVisible(true);
	}
}

public class TextField_test {
	public static void main(String[] args) {
		MyFrame_4 frame = new MyFrame_4();
	}
}
