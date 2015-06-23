package awt76;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Frame;

/**
 * 了解BorderLayout
 * 拖动的时候按钮的位置不会改变，但是大小会相应改变。
 * @author hxy
 *
 */
public class GUIBorderLayOut
{
	private Frame frame;
	
	private Button bn, bs, bw, be, bc;//东西南北中五个Button。
	
	public void go()
	{
		frame = new Frame("Border Layout");
		
		bn = new Button("B1");
		bs = new Button("B2");
		bw = new Button("B3");
		be = new Button("B4");
		bc = new Button("B5");
		
		frame.add(bn, BorderLayout.NORTH);
		frame.add(bs, BorderLayout.SOUTH);
		frame.add(bw, BorderLayout.WEST);
		frame.add(be, BorderLayout.EAST);
		frame.add(bc, BorderLayout.CENTER);
		
		
		frame.setSize(200, 200);
		frame.setVisible(true);
	}
	
	
	public static void main(String[] args)
	{
		GUIBorderLayOut gui = new GUIBorderLayOut();
		
		gui.go();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}