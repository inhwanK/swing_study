package swing_study;

import java.awt.EventQueue;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
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
import swing_study.component.JLabelEx1;
import swing_study.component.JListEx;
import swing_study.component.JListEx2;
import swing_study.component.JListex3;
import swing_study.component.JRadioBtnEx;
import swing_study.component.JSliderEx;
import swing_study.component.JSpinerEx;
import swing_study.component.JTabbedPaneEx;
import swing_study.component.JTextFieldEx;
import swing_study.component.LabelEx;
import swing_study.component.table.JTableEx;
import swing_study.dlg.JFileChooserEx;
import swing_study.dlg.JOptionPaneConfirmEx;
import swing_study.dlg.JOptionPaneInputEx;
import swing_study.dlg.JOptionPaneMessageEx;
import swing_study.frame.ContentPaneEx;
import swing_study.layout.FrameLayout;
import swing_study.layout.LayoutGuBun;
import swing_study.listener.AnonymousClassListener;
import swing_study.listener.IndepClassListener;
import swing_study.listener.InnerClassListener;
import swing_study.listener.MouseListenerEx;
import swing_study.menu.JMenuFrameEx;
import swing_study.menu.JPopupMenuEx;

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
	private JPanel panel_2;
	private JPanel pSlider;
	private JPanel pSpiner;
	private JButton btn15;
	private JButton btn16;
	private JPanel panel_3;
	private JButton btn17;
	private JButton btnLab;
	private JButton btn18;

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
		setBounds(100, 100, 1150, 724);
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
		pLayout.setBorder(
				new TitledBorder(null, "\uB808\uC774\uC544\uC6C3", TitledBorder.LEADING, TitledBorder.TOP, null, null));
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
		pComponent.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "JLabelJbuttonJtoggle",
				TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		contentPane.add(pComponent);
		pComponent.setLayout(new GridLayout(0, 1, 0, 10));

		btn04 = new JButton("JLabel");
		btn04.addActionListener(this);
		pComponent.add(btn04);

		btn05 = new JButton("JButton & JToggle");
		btn05.addActionListener(this);

		btnLab = new JButton("New button");
		btnLab.addActionListener(this);
		pComponent.add(btnLab);
		pComponent.add(btn05);

		panel = new JPanel();
		panel.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "JCheckBox & JRadioButton",
				TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
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
		btn13.addActionListener(e->{
			JComboBoxEx2 frame = new JComboBoxEx2();
			frame.setVisible(true);
		});
		pComboBox.add(btn13);
		
		btn14 = new JButton("New button");
//		btn14.addActionListener(this);
		btn14.addMouseListener(new MouseListener() {
			
			@Override
			public void mouseReleased(MouseEvent e) {
				System.out.println("mouseReleased()");
			}
			
			@Override
			public void mousePressed(MouseEvent e) {
				JComboBoxEx3 frame = new JComboBoxEx3();
				frame.setVisible(true);
			}
			
			@Override
			public void mouseExited(MouseEvent e) {
				System.out.println("mouseExited()");
			}
			
			@Override
			public void mouseEntered(MouseEvent e) {
				System.out.println("mouseEntered()");
			}
			
			@Override
			public void mouseClicked(MouseEvent e) {
				System.out.println("mouseClicked()");
			}
		});
		pComboBox.add(btn14);

		panel_2 = new JPanel();
		contentPane.add(panel_2);
		panel_2.setLayout(new GridLayout(0, 1, 0, 0));

		pSlider = new JPanel();
		pSlider.setBorder(new TitledBorder(null, "JSlider", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_2.add(pSlider);
		pSlider.setLayout(new BorderLayout(0, 0));

		btn15 = new JButton("JSlider");
		btn15.addActionListener(new MyactionListener());
		pSlider.add(btn15, BorderLayout.CENTER);

		pSpiner = new JPanel();
		pSpiner.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "JSpiner", TitledBorder.LEADING,
				TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel_2.add(pSpiner);
		pSpiner.setLayout(new BorderLayout(0, 0));

		btn16 = new JButton("JSpiner");
		btn16.addActionListener(listener);
		pSpiner.add(btn16, BorderLayout.CENTER);

		panel_3 = new JPanel();
		panel_3.setBorder(new TitledBorder(null, "JTabbedpane", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		contentPane.add(panel_3);
		panel_3.setLayout(new GridLayout(0, 1, 0, 0));

		btn17 = new JButton("New button");
		btn17.addActionListener(listener);
		panel_3.add(btn17);

		btn18 = new JButton("New button");
		btn18.addMouseListener(new MouseAdapter() {
			
		});
		btn18.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
//				System.out.println(e.getActionCommand());
				JTableEx frame = new JTableEx();
				frame.setVisible(true);

			}
		});
//		btn18.addActionListener(this);
		panel_3.add(btn18);
		
		panel_4 = new JPanel();
		panel_4.setBorder(new TitledBorder(null, "ActionListener", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		contentPane.add(panel_4);
		panel_4.setLayout(new GridLayout(0, 1, 0, 0));
		
		btn19 = new JButton("IndepClass");
		btn19.addActionListener(this);
		panel_4.add(btn19);
		
		btn20 = new JButton("InnerClass");
		btn20.addActionListener(this);
		panel_4.add(btn20);
		
		btn21 = new JButton("AnonymousClass");
		btn21.addActionListener(this);
		panel_4.add(btn21);
		
		btn24 = new JButton("New button");
		panel_4.add(btn24);
		
		btn25 = new JButton("New button");
		panel_4.add(btn25);
		
		panel_5 = new JPanel();
		contentPane.add(panel_5);
		panel_5.setLayout(new GridLayout(0, 1, 0, 0));
		
		btn22 = new JButton("New button");
		btn22.addActionListener(this);
		panel_5.add(btn22);
		
		btn23 = new JButton("New button");
		btn23.addActionListener(this);
		panel_5.add(btn23);
		
		panel_6 = new JPanel();
		panel_6.setBorder(new TitledBorder(null, "JOptionPane", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		contentPane.add(panel_6);
		panel_6.setLayout(new GridLayout(0, 1, 0, 0));
		
		btn26 = new JButton("InputDialog");
		btn26.addActionListener(this);
		panel_6.add(btn26);
		
		btn27 = new JButton("ConfirmDialog");
		btn27.addActionListener(this);
		panel_6.add(btn27);
		
		btn28 = new JButton("MessageDialog");
		btn28.addActionListener(this);
		panel_6.add(btn28);
		
		panel_7 = new JPanel();
		panel_7.setBorder(new TitledBorder(null, "JFileChooser", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		contentPane.add(panel_7);
		
		btn29 = new JButton("New button");
		btn29.addActionListener(this);
		panel_7.add(btn29);
	}

	class MyactionListener implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			JSliderEx frame = new JSliderEx();
			frame.setVisible(true);

		}
		
	}
	
	ActionListener listener = new ActionListener() {

		@Override
		public void actionPerformed(ActionEvent e) {
			if (e.getSource() == btn17) {
				JTabbedPaneEx frame = new JTabbedPaneEx();
				frame.setVisible(true);
			}
			if(e.getSource() ==btn16) {
				actionPerformedBtn16(e);
			}
		}
	};
	private JPanel panel_4;
	private JButton btn19;
	private JButton btn20;
	private JButton btn21;
	private JPanel panel_5;
	private JButton btn22;
	private JButton btn23;
	private JPanel panel_6;
	private JButton btn26;
	private JButton btn27;
	private JButton btn28;
	private JPanel panel_7;
	private JButton btn29;
	private JButton btn24;
	private JButton btn25;

	
	 

	
	protected void actionPerformedBtn16(ActionEvent e) {
		JSpinerEx frame = new JSpinerEx();
		frame.setVisible(true);
	}

	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btn29) {
			actionPerformedBtn29(e);
		}
		if (e.getSource() == btn28) {
			actionPerformedBtn28(e);
		}
		if (e.getSource() == btn27) {
			actionPerformedBtn27(e);
		}
		if (e.getSource() == btn26) {
			actionPerformedBtn26(e);
		}
		if (e.getSource() == btn23) {
			actionPerformedBtn23(e);
		}
		if (e.getSource() == btn22) {
			actionPerformedBtn22(e);
		}
		if (e.getSource() == btn21) {
			actionPerformedBtn21(e);
		}
		if (e.getSource() == btn20) {
			actionPerformedBtn20(e);
		}
		if (e.getSource() == btn19) {
			actionPerformedBtn19(e);
		}
		if (e.getSource() == btnLab) {
			actionPerformedBtnLab(e);
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
	

	protected void actionPerformedBtnLab(ActionEvent e) {
		JLabelEx1 frame = new JLabelEx1();
		frame.setVisible(true);
	}

	protected void actionPerformedBtn19(ActionEvent e) {
		IndepClassListener frame = new IndepClassListener();
		frame.setVisible(true);
	}
	protected void actionPerformedBtn20(ActionEvent e) {
		InnerClassListener frame = new InnerClassListener();
		frame.setVisible(true);
	}
	protected void actionPerformedBtn21(ActionEvent e) {
		AnonymousClassListener frame = new AnonymousClassListener();
		frame.setVisible(true);
	}
	protected void actionPerformedBtn22(ActionEvent e) {
		JMenuFrameEx frame = new JMenuFrameEx();
		frame.setVisible(true);
	}
	protected void actionPerformedBtn23(ActionEvent e) {
		JPopupMenuEx frame = new JPopupMenuEx();
		frame.setVisible(true);
	}
	protected void actionPerformedBtn26(ActionEvent e) {
		JOptionPaneInputEx frame = new JOptionPaneInputEx();
		frame.setVisible(true);
	}
	protected void actionPerformedBtn27(ActionEvent e) {
		JOptionPaneConfirmEx frame = new JOptionPaneConfirmEx();
		frame.setVisible(true);
	}
	protected void actionPerformedBtn28(ActionEvent e) {
		JOptionPaneMessageEx frame = new JOptionPaneMessageEx();
		frame.setVisible(true);
	}
	protected void actionPerformedBtn29(ActionEvent e) {
		JFileChooserEx frame = new JFileChooserEx();
		frame.setVisible(true);
	}
}