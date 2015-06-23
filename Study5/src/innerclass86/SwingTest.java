package innerclass86;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JButton;
import javax.swing.JFrame;

/**
 * 事件内部类
 * @author hxy
 *
 */
public class SwingTest {
	public static void main(String[] args) {
		JFrame frame =new JFrame("JFrame");
		
		JButton button = new JButton("Click me");
		
		button.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("Hello world Inner");
			}
		});
		
		frame.setSize(200, 200);
		
		frame.getContentPane().add(button);
		
		frame.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.out.println("Close!");
				System.exit(0);
			}
		});
		
		frame.setVisible(true);
	}
}