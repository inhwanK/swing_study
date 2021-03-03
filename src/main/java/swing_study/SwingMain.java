package swing_study;

import java.awt.EventQueue;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import swing_study.component.FrameComponentEx;
import swing_study.component.LabelEx;
import swing_study.frame.ContentPaneEx;
import swing_study.layout.FrameLayout;
import swing_study.layout.LayoutGuBun;

import java.awt.BorderLayout;
import javax.swing.BoxLayout;
import javax.swing.border.TitledBorder;
import javax.swing.UIManager;
import java.awt.Color;

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
	private JButton btn06;

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

	/**
	 * Create the frame.
	 */
	public SwingMain() {
		initialize();
	}

	private void initialize() {
		setTitle("스윙스터디");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new GridLayout(0, 3, 10, 10));

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
		
		btn05 = new JButton("JButton");
		pComponent.add(btn05);
		
		btn06 = new JButton("JToggle");
		pComponent.add(btn06);
	}

	public void actionPerformed(ActionEvent e) {
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
		FrameComponentEx frame = new FrameComponentEx();
		frame.setVisible(true);
	}
	protected void actionPerformedBtn04(ActionEvent e) {
		LabelEx frame = new LabelEx();
		frame.setVisible(true);
	}
}