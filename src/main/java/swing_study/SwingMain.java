package swing_study;

import java.awt.EventQueue;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import swing_study.component.CheckBoxCustomEx;
import swing_study.component.FrameComponentEx;
import swing_study.component.Fruit;
import swing_study.component.JButtonEx;
import swing_study.component.JCheckBoxEx;
import swing_study.component.JComboBoxEx;
import swing_study.component.JComboBoxEx2;
import swing_study.component.JComboBoxEx3;
import swing_study.component.JListEx;
import swing_study.component.JListEx2;
import swing_study.component.JListex3;
import swing_study.component.JRadioBtnEx;
import swing_study.component.JTextFieldEx;
import swing_study.component.LabelEx;
import swing_study.frame.ContentPaneEx;
import swing_study.layout.FrameLayout;
import swing_study.layout.LayoutGuBun;

import java.awt.BorderLayout;
import javax.swing.BoxLayout;
import javax.swing.border.TitledBorder;
import javax.swing.UIManager;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JTextField;

@SuppressWarnings("serial")
public class SwingMain extends JFrame implements ActionListener {

	private JPanel contentPane;
	private JButton btn01;
	private JButton btn02;
	private JPanel pLayout;
	private JButton btnFlowLayout;
	private JButton btnBorderayout;
	private JButton btnGridLayout;
	private JButton btnAbsoluteLayout;
	private JButton btn03;
	private JPanel pComponent;
	private JButton btn04;
	private JButton btn05;
	private JPanel panel;
	private JButton button;
	private JButton btn06;
	private JButton btn07;
	private JPanel panel_1;
	private JButton btnNewButton;
	private JPanel pList;
	private JButton btn09;
	private JButton btn10;
	private JButton btn11;
	private JPanel pComboBox;
	private JButton btn12;
	private JButton btn13;
	private JButton btn14;
	

	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SwingMain frame = new SwingMain();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}


	public SwingMain() {
		initialize();
	}

	private void initialize() {
		setTitle("스윙스터디");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 672, 423);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new GridLayout(0, 5, 10, 10));

		btn01 = new JButton("Jframe \uC608");
		btn01.addActionListener(this);
		contentPane.add(btn01);

		btn02 = new JButton("JPanel \uC608");
		btn02.addActionListener(this);
		contentPane.add(btn02);

		pLayout = new JPanel();
		pLayout.setBorder(new TitledBorder(null, "\uB808\uC774\uC544\uC6C3", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		pLayout.setToolTipText("");
		contentPane.add(pLayout);
		pLayout.setLayout(new GridLayout(0, 1, 0, 5));

		btnFlowLayout = new JButton("FlowLayout");
		btnFlowLayout.addActionListener(this);
		// btnFlowLayout.addActionListener(e -> new FrameLayout(LayoutGuBun.FLOW));
		pLayout.add(btnFlowLayout);

		btnGridLayout = new JButton("GridLayout");
		btnGridLayout.addActionListener(this);

		pLayout.add(btnGridLayout);

		btnAbsoluteLayout = new JButton("AbsoluteLayout");
		btnAbsoluteLayout.addActionListener(this);

		btnBorderayout = new JButton("BorderLayout");
		pLayout.add(btnBorderayout);
		btnBorderayout.addActionListener(this);
		
		button = new JButton("New button");
		pLayout.add(button);

		pLayout.add(btnAbsoluteLayout);

		btn03 = new JButton("JButton 공통 속성");
		btn03.addActionListener(this);
		contentPane.add(btn03);
		
		pComponent = new JPanel();
		pComponent.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "JLabelJbuttonJtoggle", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		contentPane.add(pComponent);
		pComponent.setLayout(new GridLayout(0, 1, 0, 10));
		
		btn04 = new JButton("JLabel");
		btn04.addActionListener(this);
		pComponent.add(btn04);
		
		btn05 = new JButton("JButton & JToggle");
		btn05.addActionListener(this);
		pComponent.add(btn05);
		
		panel = new JPanel();
		panel.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "JCheckBox & JRadioButton", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		contentPane.add(panel);
		panel.setLayout(new GridLayout(0, 1, 0, 0));
		
		btn06 = new JButton("JCheckBox");
		btn06.addActionListener(this);
		panel.add(btn06);
		
		btn07 = new JButton("JRadioButton");
		btn07.addActionListener(this);
		panel.add(btn07);
		
		panel_1 = new JPanel();
		panel_1.setBorder(new TitledBorder(null, "textfield", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		contentPane.add(panel_1);
		
		btnNewButton = new JButton("textfield");
		btnNewButton.addActionListener(this);
		panel_1.add(btnNewButton);
		
		pList = new JPanel();
		pList.setBorder(new TitledBorder(null, "JList", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		contentPane.add(pList);
		pList.setLayout(new GridLayout(0, 1, 0, 0));
		
		btn09 = new JButton("JList1");
		btn09.addActionListener(this);
		pList.add(btn09);
		
		btn10 = new JButton("JList2");
		btn10.addActionListener(this);
		pList.add(btn10);
		
		btn11 = new JButton("JList3");
		btn11.addActionListener(this);
		pList.add(btn11);
		
		pComboBox = new JPanel();
		pComboBox.setBorder(new TitledBorder(null, "JComboBox", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		contentPane.add(pComboBox);
		pComboBox.setLayout(new GridLayout(0, 1, 0, 0));
		
		btn12 = new JButton("New button");
		btn12.addActionListener(this);
		pComboBox.add(btn12);
		
		btn13 = new JButton("New button");
		btn13.addActionListener(this);
		pComboBox.add(btn13);
		
		btn14 = new JButton("New button");
		btn14.addActionListener(this);
		pComboBox.add(btn14);
	}

	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btn14) {
			actionPerformedBtn14(e);
		}
		if (e.getSource() == btn13) {
			actionPerformedBtn13(e);
		}
		if (e.getSource() == btn12) {
			actionPerformedBtn12(e);
		}
		if (e.getSource() == btn11) {
			actionPerformedBtn11(e);
		}
		if (e.getSource() == btn10) {
			actionPerformedBtn10(e);
		}
		if (e.getSource() == btn09) {
			actionPerformedBtn09(e);
		}
		if (e.getSource() == btnNewButton) {
			actionPerformedBtnNewButton(e);
		}
		if (e.getSource() == btn07) {
			actionPerformedBtn07(e);
		}
		if (e.getSource() == btn06) {
			actionPerformedBtn06(e);
		}
		if (e.getSource() == btn05) {
			actionPerformedBtn05(e);
		}
		if (e.getSource() == btn04) {
			actionPerformedBtn04(e);
		}
		if (e.getSource() == btn03) {
			actionPerformedBtnNewButton(e);
		}
		if (e.getSource() == btnAbsoluteLayout) {
			actionPerformedBtnAbsoluteLayout(e);
		}
		if (e.getSource() == btnGridLayout) {
			actionPerformedBtnGridLayout(e);
		}
		if (e.getSource() == btnBorderayout) {
			actionPerformedBtnBorderayout(e);
		}
		if (e.getSource() == btnFlowLayout) {
			actionPerformedBtnFlowLayout(e);
		}
		if (e.getSource() == btn02) {
			btn02ActionPerformed(e);
		}
		if (e.getSource() == btn01) {
			btn01ActionPerformed(e);
		}
	}

	protected void btn01ActionPerformed(ActionEvent e) {
		ContentPaneEx frame = new ContentPaneEx();
		frame.setVisible(true);
	}

	protected void btn02ActionPerformed(ActionEvent e) {
		JPanelEx frame = new JPanelEx();
		frame.setVisible(true);
	}

	protected void actionPerformedBtnFlowLayout(ActionEvent e) {
		FrameLayout frame = new FrameLayout(LayoutGuBun.FLOW);
		frame.setVisible(true);
	}

	protected void actionPerformedBtnBorderayout(ActionEvent e) {
		FrameLayout frame = new FrameLayout(LayoutGuBun.BORDER);
		frame.setVisible(true);
	}

	protected void actionPerformedBtnGridLayout(ActionEvent e) {
		FrameLayout frame = new FrameLayout(LayoutGuBun.GRID);
		frame.setVisible(true);
	}

	protected void actionPerformedBtnAbsoluteLayout(ActionEvent e) {
		FrameLayout frame = new FrameLayout(LayoutGuBun.ABSOLUTE);
		frame.setVisible(true);
	}

	protected void actionPerformedBtnNewButton(ActionEvent e) {
		JTextFieldEx frame = new JTextFieldEx();
		frame.setVisible(true);
	}
	protected void actionPerformedBtn04(ActionEvent e) {
		LabelEx frame = new LabelEx();
		frame.setVisible(true);
	}
	protected void actionPerformedBtn05(ActionEvent e) {
		JButtonEx frame = new JButtonEx();
		frame.setVisible(true);
	}
	protected void actionPerformedBtn06(ActionEvent e) {
		JCheckBoxEx frame = new JCheckBoxEx();
		frame.setVisible(true);
		
		ArrayList<Fruit> list = new ArrayList<Fruit>();
		list.add(new Fruit("사과", 100));
		list.add(new Fruit("배", 500));
		list.add(new Fruit("체리", 1000));
		list.add(new Fruit("귤", 700));
		
		CheckBoxCustomEx frame1 = new CheckBoxCustomEx(list);
		frame1.setVisible(true);
	}
	protected void actionPerformedBtn07(ActionEvent e) {
		JRadioBtnEx frame = new JRadioBtnEx();
		frame.setVisible(true);
	}
	protected void actionPerformedBtn09(ActionEvent e) {
		JListEx frame = new JListEx();
		frame.setVisible(true);
	}
	protected void actionPerformedBtn10(ActionEvent e) {
		JListEx2 frame = new JListEx2();
		frame.setVisible(true);
	}
	protected void actionPerformedBtn11(ActionEvent e) {
		JListex3 frame = new JListex3();
		frame.setVisible(true);
	}
	protected void actionPerformedBtn12(ActionEvent e) {
		JComboBoxEx frame = new JComboBoxEx();
		frame.setVisible(true);
	}
	protected void actionPerformedBtn13(ActionEvent e) {
		JComboBoxEx2 frame = new JComboBoxEx2();
		frame.setVisible(true);
	}
	protected void actionPerformedBtn14(ActionEvent e) {
		JComboBoxEx3 frame = new JComboBoxEx3();
		frame.setVisible(true);
	}
}