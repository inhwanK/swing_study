package swing_study.component;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import java.awt.GridLayout;
import javax.swing.JCheckBox;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;
import java.awt.FlowLayout;
import javax.swing.BoxLayout;

public class JCheckBoxEx extends JFrame implements ItemListener {

	private JPanel contentPane;
	private JCheckBox checkBoxApple;
	private JLabel lblRes;
	private int sum;
	private String resStr = "현재 0원 입니다.";
	private JCheckBox checkBoxPear;
	private JCheckBox checkBoxCherry;

	public JCheckBoxEx() {
		initialize();
		checkBoxCherry.setSelected(true);
	}

	private void initialize() {
		setTitle("체크 박스 예제");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 329, 392);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new GridLayout(0, 1, 0, 0));

		JPanel pNorth = new JPanel();
		contentPane.add(pNorth);
		pNorth.setLayout(new BorderLayout(0, 0));

		JLabel lblNewLabel = new JLabel("사과 100원, 배 500원, 체리 2000원");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		pNorth.add(lblNewLabel, BorderLayout.NORTH);

		JPanel panel = new JPanel();
		pNorth.add(panel, BorderLayout.CENTER);

		checkBoxApple = new JCheckBox("사과");
		checkBoxApple.addItemListener(this);
		panel.add(checkBoxApple);

		checkBoxPear = new JCheckBox("배");
		checkBoxPear.addItemListener(this);
		panel.add(checkBoxPear);

		checkBoxCherry = new JCheckBox("체리");
		checkBoxCherry.addItemListener(this);
		panel.add(checkBoxCherry);

		lblRes = new JLabel("없음");
		lblRes.setHorizontalAlignment(SwingConstants.CENTER);
		pNorth.add(lblRes, BorderLayout.SOUTH);
	}

	public void itemStateChanged(ItemEvent e) {
		if (e.getSource() == checkBoxCherry) {
			itemStateChangedCheckBox_2(e);
		}
		if (e.getSource() == checkBoxPear) {
			itemStateChangedCheckBox_1(e);
		}
		if (e.getSource() == checkBoxApple) {
			itemStateChangedCheckBox(e);
		}

		resStr = String.format("현재  %d 원 입니다.", sum);
		lblRes.setText(resStr);
	}0

	protected void itemStateChangedCheckBox(ItemEvent e) {
		if (e.getStateChange() == ItemEvent.SELECTED) {
			sum += 100;
		} else {
			sum -= 100;
		}

	}

	protected void itemStateChangedCheckBox_1(ItemEvent e) {
		if (e.getStateChange() == ItemEvent.SELECTED) {
			sum += 500;
		} else {
			sum -= 500;
		}
	}

	protected void itemStateChangedCheckBox_2(ItemEvent e) {
		if (e.getStateChange() == ItemEvent.SELECTED) {
			sum += 1000;
		} else {
			sum -= 1000;
		}
	}
}
