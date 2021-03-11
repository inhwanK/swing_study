package swing_study.dlg;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.event.ActionListener;
import java.io.File;
import java.awt.event.ActionEvent;
import javax.swing.BoxLayout;
import javax.swing.ImageIcon;

@SuppressWarnings("serial")
public class JOptionPaneInputEx extends JFrame implements ActionListener {

	private JPanel contentPane;
	private JPanel panel1;
	private JPanel panel2;
	private JLabel lbl1;
	private JPanel panel1_1;
	private JButton btn1;
	private JLabel lblRes1;
	private JLabel lbl2;
	private JPanel panel2_1;
	private JButton btn2;
	private JLabel lblRes2;
	private JPanel panel3;
	private JPanel panel4;
	private JLabel lbl3;
	private JLabel lbl4;
	private JPanel panel3_1;
	private JPanel panel4_1;
	private JButton btn3;
	private JLabel lblRes3;
	private JButton btn4;
	private JLabel lblRes4;

	public JOptionPaneInputEx() {
		initialize();
	}

	private void initialize() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 800, 424);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new GridLayout(0, 1, 0, 0));

		panel1 = new JPanel();
		contentPane.add(panel1);
		panel1.setLayout(new GridLayout(0, 2, 0, 0));

		lbl1 = new JLabel("JOptionPane.showInputDialog(Object message)");
		panel1.add(lbl1);

		panel1_1 = new JPanel();
		panel1.add(panel1_1);
		panel1_1.setLayout(new GridLayout(0, 2, 0, 0));

		btn1 = new JButton("InputBtn");
		panel1_1.add(btn1);

		lblRes1 = new JLabel("New label");
		panel1_1.add(lblRes1);

		panel2 = new JPanel();
		contentPane.add(panel2);
		panel2.setLayout(new GridLayout(0, 2, 0, 0));

		lbl2 = new JLabel("JOptionPane.showInputDialog(\"이름을 입력\", \"유한솔\");");
		panel2.add(lbl2);

		panel2_1 = new JPanel();
		panel2.add(panel2_1);
		panel2_1.setLayout(new GridLayout(0, 2, 0, 0));

		btn2 = new JButton("InputBtn");
		panel2_1.add(btn2);

		lblRes2 = new JLabel("New label");
		panel2_1.add(lblRes2);

		panel3 = new JPanel();
		contentPane.add(panel3);
		panel3.setLayout(new GridLayout(0, 2, 0, 0));

		lbl3 = new JLabel("JOptionPane.showInputDialog(null, \"이름을 입력\", \"제목\", JOptionPane.ERROR_MESSAGE);");
		panel3.add(lbl3);

		panel3_1 = new JPanel();
		panel3.add(panel3_1);
		panel3_1.setLayout(new GridLayout(0, 2, 0, 0));

		btn3 = new JButton("InputBtn");
		btn3.addActionListener(this);
		panel3_1.add(btn3);

		lblRes3 = new JLabel("New label");
		panel3_1.add(lblRes3);

		panel4 = new JPanel();
		contentPane.add(panel4);
		panel4.setLayout(new GridLayout(0, 2, 0, 0));

		lbl4 = new JLabel("New label");
		panel4.add(lbl4);

		panel4_1 = new JPanel();
		panel4.add(panel4_1);
		panel4_1.setLayout(new GridLayout(0, 2, 0, 0));

		btn4 = new JButton("New button");
		btn4.addActionListener(this);
		panel4_1.add(btn4);

		lblRes4 = new JLabel("New label");
		panel4_1.add(lblRes4);
	}

	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btn4) {
			actionPerformedBtn4(e);
		}
		if (e.getSource() == btn3) {
			actionPerformedBtn3(e);
		}
		try {
			if (e.getSource() == btn2) {
				actionPerformedBtn2(e);
			}
			if (e.getSource() == btn1) {
				actionPerformedBtn1(e);
			}
		} catch (NullPointerException ne) {
			System.out.println(ne.getMessage());
//			e.printStackTrace();
		}
	}

	protected void actionPerformedBtn1(ActionEvent e) {
		String res = JOptionPane.showInputDialog("이름 입력");
		System.out.println(res);
		if (res.length() == 0 && res == null) {
			lblRes1.setText("입력값은 없음");
		} else {
			lblRes1.setText("입력값은 " + res);
		}
	}

	protected void actionPerformedBtn2(ActionEvent e) {
		String res = JOptionPane.showInputDialog("이름을 입력", "유한솔");
		if (res.equals("null")) {
			System.out.println("aaa");
		}
		if (res != null) {
			lblRes2.setText("입력값은 " + res);
		}
	}

	protected void actionPerformedBtn3(ActionEvent e) {
		String res = JOptionPane.showInputDialog(null, "이름을 입력", "제목", JOptionPane.ERROR_MESSAGE);
		JOptionPane.showInputDialog(null, "이름을 입력", "제목", JOptionPane.INFORMATION_MESSAGE);
		JOptionPane.showInputDialog(null, "이름을 입력", "제목", JOptionPane.WARNING_MESSAGE);
		JOptionPane.showInputDialog(null, "이름을 입력", "제목", JOptionPane.QUESTION_MESSAGE);
		JOptionPane.showInputDialog(null, "이름을 입력", "제목", JOptionPane.PLAIN_MESSAGE);
		lblRes3.setText("입력값은 " + res);

//		ERROR_MESSAGE 
//		INFORMATION_MESSAGE 
//	 	WARNING_MESSAGE 
//		QUESTION_MESSAGE 
//		PLAIN_MESSAGE

	}
	protected void actionPerformedBtn4(ActionEvent e) {
		String imgPath = System.getProperty("user.dir") + File.separator + "Images"+File.separator;
		ImageIcon icon = new ImageIcon(imgPath + "icon1.png");
		String[] selectionValue = {"박유진","유한솔","이나연","송영흠","우정아"};
		String initialSelectionValue = "박유진";
		
		Object res = JOptionPane.showInputDialog(null, "이름을 선택하세요","이름 선택",JOptionPane.QUESTION_MESSAGE, icon,selectionValue,initialSelectionValue);
		lblRes4.setText("선택한 입력은 "+res);
	}
}
