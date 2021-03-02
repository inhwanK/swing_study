package swing_study.component;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridLayout;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;

@SuppressWarnings("serial")
public class FrameComponentEx extends JFrame implements ActionListener {

	private JPanel contentPane;
	private JButton btn1_1;
	private JButton btn2;
	private JButton btn3;
	private JButton btn1;
	
	public FrameComponentEx() {
		initialize();
	}

	private void initialize() {
		setTitle("공통 속성");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 423, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new GridLayout(0, 1, 0, 0));


		btn1 =createBtn();
		contentPane.add(btn1);

		
		btn2 = new JButton("Disabled Button");
		btn2.addActionListener(this);
		btn2.setEnabled(false);
		contentPane.add(btn2);
		
		btn3 = new JButton("getX(), getY()");
		btn3.addActionListener(this);
		btn1_1.addActionListener(this);
		contentPane.add(btn3);
	}

	private JButton createBtn() {
		btn1_1 = new JButton("Magenta/Yellow Button");
		btn1_1.addActionListener(this);
		btn1_1.setFont(new Font("Arial", Font.ITALIC, 20));
		btn1_1.setForeground(Color.MAGENTA);
		btn1_1.setBackground(Color.YELLOW);
		return btn1_1;
	}

	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btn2) {
			actionPerformedBtn2(e);
		}
		if (e.getSource() == btn3) {
			actionPerformedBtn3(e);
		}
		if (e.getSource() == btn1_1) {
			actionPerformedBtn1(e);
		}
	}

	protected void actionPerformedBtn1(ActionEvent e) {
		if (btn3.isVisible()) {
			btn3.setVisible(false);
		}else {
			btn3.setVisible(true);
		}
	}

	protected void actionPerformedBtn3(ActionEvent e) {
		JButton btn = (JButton) e.getSource();
		FrameComponentEx parent = (FrameComponentEx) btn.getTopLevelAncestor();
		parent.setTitle(btn.getX()+","+btn.getY());
				
				if(btn2.isEnabled()) {
					btn2.setEnabled(false);
				}else {
					btn2.setEnabled(true);
				}
	}

	protected void actionPerformedBtn2(ActionEvent e) {
		if (btn1_1 != null) {
			contentPane.remove(btn1_1);
			btn1 = null;
			revalidate();
		} else {
			btn1 = createBtn();
			contentPane.remove(btn1);
			revalidate();
			if (btn1_1.isVisible()) {
				btn1_1.setVisible(false);
			} else {
				btn1_1.setVisible(true);
			}
		}
	}
}
