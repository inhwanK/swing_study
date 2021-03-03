package swing_study.component;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JCheckBox;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;

public class CheckBoxCustomEx extends JFrame implements ItemListener {

	private JPanel contentPane;
	private JCheckBox chckbxNewCheckBox;

	public CheckBoxCustomEx() {
		initialize();
	}

	private void initialize() {
		setTitle("");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JPanel pNorth = new JPanel();
		contentPane.add(pNorth, BorderLayout.NORTH);
		
		JLabel lblFruit = new JLabel();
		pNorth.add(lblFruit);
		
		JPanel pSouth = new JPanel();
		contentPane.add(pSouth, BorderLayout.SOUTH);
		
		JLabel lblNewLabel_1 = new JLabel("현재 %d원 입니다.");
		pSouth.add(lblNewLabel_1);
		
		JPanel pCenter = new JPanel();
		contentPane.add(pCenter, BorderLayout.CENTER);
		
		chckbxNewCheckBox = new JCheckBox("New check box");
		chckbxNewCheckBox.addItemListener(this);
		pCenter.add(chckbxNewCheckBox);
		
		JCheckBox chckbxNewCheckBox_1 = new JCheckBox("New check box");
		pCenter.add(chckbxNewCheckBox_1);
		
		JCheckBox chckbxNewCheckBox_2 = new JCheckBox("New check box");
		pCenter.add(chckbxNewCheckBox_2);
	}

	public void itemStateChanged(ItemEvent e) {
		if (e.getSource() == chckbxNewCheckBox) {
			itemStateChangedChckbxNewCheckBox(e);
		}
	}
	protected void itemStateChangedChckbxNewCheckBox(ItemEvent e) {
		
	}
}
