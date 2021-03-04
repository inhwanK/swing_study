package swing_study.component;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.border.EmptyBorder;
import java.awt.GridLayout;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.io.File;
import java.util.ArrayList;

import javax.swing.border.TitledBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.FlowLayout;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import javax.swing.BoxLayout;
import javax.swing.ButtonGroup;

@SuppressWarnings("serial")
public class JRadioBtnEx extends JFrame implements ItemListener {

	private ArrayList<JRadioButton> list;
	private JPanel contentPane;
	private String imgPath = System.getProperty("user.dir") + File.separator + "Images" + File.separator;
	private ImageIcon[] icons = { new ImageIcon(imgPath + "KakaoTalk_20210304_121819267.jpg"),
			new ImageIcon(imgPath + "KakaoTalk_20210304_121819438.jpg"),
			new ImageIcon(imgPath + "KakaoTalk_20210304_121819354.jpg") };
	private JRadioButton rdbtnPear;
	private JRadioButton rdbtnCherry;
	private JRadioButton rdbtnApple;
	private CustomRadioButton panel_1;
	private JLabel lblImg;

	public JRadioBtnEx() {

		initialize();
	}

	private void initialize() {
		setTitle("라디오 버튼 예제");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 543, 383);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new GridLayout(1, 0, 10, 0));

		JPanel pLeft = new JPanel();
		pLeft.setBorder(new TitledBorder(null, "라디오 간단 예제", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		contentPane.add(pLeft);
		pLeft.setLayout(new BorderLayout(0, 0));

		JPanel panel = new JPanel();
		pLeft.add(panel, BorderLayout.NORTH);
		panel.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));

		rdbtnApple = new JRadioButton("사과");
//		rdbtnApple.addItemListener(this);
		rdbtnApple.setHorizontalAlignment(SwingConstants.CENTER);
		panel.add(rdbtnApple);

		rdbtnPear = new JRadioButton("배");
//		rdbtnPear.addItemListener(this);
		rdbtnPear.setHorizontalAlignment(SwingConstants.CENTER);
		panel.add(rdbtnPear);

		rdbtnCherry = new JRadioButton("체리");
//		rdbtnCherry.addItemListener(this);
		rdbtnCherry.setHorizontalAlignment(SwingConstants.CENTER);
		panel.add(rdbtnCherry);

		JPanel pRight = new JPanel();
		pRight.setBorder(new TitledBorder(null, "응용 예제", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		contentPane.add(pRight);
		pRight.setLayout(new BorderLayout(0, 0));

		panel_1 = new CustomRadioButton();
		panel_1.getRdbtnApple().addItemListener(this);
		pRight.add(panel_1, BorderLayout.NORTH);

		lblImg = new JLabel("New label");
		lblImg.setHorizontalAlignment(SwingConstants.CENTER);
		pRight.add(lblImg, BorderLayout.CENTER);

		for (JRadioButton r : panel_1.getRdBtns()) {
			r.addItemListener(this);
		}

	}
	@Override
	public void itemStateChanged(ItemEvent e) {
		JRadioButton rd = (JRadioButton) e.getSource();
		if (e.getStateChange() == ItemEvent.SELECTED) {
//			JOptionPane.showMessageDialog(null, rd.getText());
			String text = rd.getText();
			switch (text) {
			case "사과":
				lblImg.setIcon(icons[0]);
				lblImg.setText(text);
				break;
			case "배":
				lblImg.setIcon(icons[1]);
				lblImg.setText(text);
				break;
			default:
				lblImg.setIcon(icons[2]);
				lblImg.setText(text);
			}
		}
	}
}
//	@Override
//	public void itemStateChanged(ItemEvent e) {
//		if (e.getSource() == rdbtnCherry) {
//			itemStateChangedRdbtnCherry(e);
//		}
//		if (e.getSource() == rdbtnPear) {
//			itemStateChangedRdbtnPear(e);
//		}
//		if (e.getSource() == rdbtnApple) {
//			itemStateChangedRdbtnApple(e);
//		}
//	}
//
//	protected void itemStateChangedRdbtnApple(ItemEvent e) {
//		if (e.getStateChange() == ItemEvent.SELECTED) {
//			JOptionPane.showMessageDialog(null, "사과");
//		}
//	}
//
//	protected void itemStateChangedRdbtnPear(ItemEvent e) {
//		if (e.getStateChange() == ItemEvent.SELECTED) {
//			JOptionPane.showMessageDialog(null, "배");
//		}
//	}
//
//	protected void itemStateChangedRdbtnCherry(ItemEvent e) {
//		if (e.getStateChange() == ItemEvent.SELECTED) {
//			JOptionPane.showMessageDialog(null, "체리");
//		}
//	}
