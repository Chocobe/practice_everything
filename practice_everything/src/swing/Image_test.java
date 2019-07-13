package swing;

import java.awt.FlowLayout;
import java.awt.Image;
import java.awt.Toolkit;

import javax.swing.JButton;
import javax.swing.JFrame;

class MyFrame_1 extends JFrame {
	public MyFrame_1() {
		this.setTitle("Image Test");
		this.setSize(700, 700);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(new FlowLayout());
		
		Toolkit kit = Toolkit.getDefaultToolkit();
		Image img = kit.getImage("d:\\tux.jpg");
		this.setIconImage(img);
		
		JButton button = new JButton("버뜬");
		this.add(button);
		
		this.setResizable(false);
		
		this.setVisible(true);
	}
}

public class Image_test {
	public static void main(String[] args) {
		MyFrame_1 frame = new MyFrame_1();
	}
}
