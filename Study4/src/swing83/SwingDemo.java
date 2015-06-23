package swing83;

import java.awt.BorderLayout;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 * Swing的Demo，与AWT非常相似。
 * @author hxy
 *
 */
public class SwingDemo {
	public static void main(String[] args) {
		JFrame frame = new JFrame("FrameDemo");
		
		JLabel label = new JLabel("Hello World");
		
		frame.addWindowListener(new MyHandler());
		
		frame.getContentPane().add(label, BorderLayout.CENTER);//获取容器，并添加
		
		frame.pack();
		
		frame.setVisible(true);
	}
}

class MyHandler extends WindowAdapter{
	@Override
	public void windowClosing(WindowEvent e) {
		System.exit(0);
//		super.windowClosing(e);
	}
}
