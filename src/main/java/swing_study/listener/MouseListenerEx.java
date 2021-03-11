package swing_study.listener;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.EventQueue;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

@SuppressWarnings("serial")
public class MouseListenerEx extends JFrame {

	private JPanel contentPane;

	private JLabel la = new JLabel("여기");
	
	
	public MouseListenerEx() {
		setTitle("mouse 이벤트 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
//		Container c = getContentPane();
//		c.addMouseListener(new MyMouseListner());
//		c.setLayout(null);
		
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5,5,5,5));
		contentPane.addMouseListener(new MyMouseListner());
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		la.setSize(50, 20);
		la.setLocation(30, 30);
//		c.add(la);
		contentPane.add(la);
		
		setSize(250, 250);
		setVisible(true);
		
	}

	class MyMouseListner implements MouseListener {


		@Override
		public void mousePressed(MouseEvent e) {
			int x = e.getX();
			int y = e.getY();
			la.setLocation(y,x);
			
		}

		@Override
		public void mouseClicked(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void mouseReleased(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void mouseEntered(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void mouseExited(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}
		
		

	}
//	public static void main(String[] args) {
//		new MouseListenerEx();
//	}
}
