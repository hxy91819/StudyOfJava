package awt76;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Frame;

/**
 * �˽�BorderLayout
 * �϶���ʱ��ť��λ�ò���ı䣬���Ǵ�С����Ӧ�ı䡣
 * @author hxy
 *
 */
public class GUIBorderLayOut
{
	private Frame frame;
	
	private Button bn, bs, bw, be, bc;//�����ϱ������Button��
	
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