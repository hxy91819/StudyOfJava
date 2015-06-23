package swing83;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenuBar;

public class MenuDemo1
{
	public static void main(String[] args)
	{
		JFrame frame = new JFrame("TopLevelDemo");
		
		frame.addWindowListener(new MyHandler());//添加frame的监听：完成window的常规操作。
		
		JLabel label = new JLabel("hello");
		
		label.setBackground(Color.YELLOW);
		label.setPreferredSize(new Dimension(200, 180));
		
		JMenuBar menuBar = new JMenuBar();
		
		menuBar.setBackground(Color.cyan);
		menuBar.setPreferredSize(new Dimension(200,20));
		
		frame.setJMenuBar(menuBar);//添加menuBar的方法
		frame.getContentPane().add(label, BorderLayout.CENTER);//添加组件的方法
		
		frame.pack();
		frame.setVisible(true);
	}
}


