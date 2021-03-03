package swing_study.component;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JCheckBox;
import java.awt.event.ItemListener;
import java.util.ArrayList;
import java.awt.event.ItemEvent;
import java.awt.GridLayout;

@SuppressWarnings("serial")
public class CheckBoxCustomEx extends JFrame implements ItemListener {

	private JPanel contentPane;
	private ArrayList<Fruit> list;
	private int sum;
	private String resStr;
	private JLabel lblRes;

	public CheckBoxCustomEx(ArrayList<Fruit> list) {
		this.list = list;
		initialize();
	}

	private void initialize() {
		setTitle("체크 박스 커스텀 예제");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 383, 156);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);

		JPanel pNorth = new JPanel();
		contentPane.add(pNorth, BorderLayout.NORTH);

		JLabel lblTitle = new JLabel("New Label");
		pNorth.add(lblTitle);

		JPanel pSouth = new JPanel();
		contentPane.add(pSouth, BorderLayout.SOUTH);

		lblRes = new JLabel("현재 0원 입니다.");
		pSouth.add(lblRes);

		JPanel pCenter = new JPanel();
		contentPane.add(pCenter, BorderLayout.CENTER);

		String title = "";
		for (Fruit f : list) {
			title += f.toString() + " ";
			JCheckBox ck = new JCheckBox(f.getName());
			pCenter.add(ck);
			ck.addItemListener(this);
		}
		lblTitle.setText(title);
	}

	public void itemStateChanged(ItemEvent e) {
		JCheckBox cb = (JCheckBox) e.getSource(); 
		Fruit selectFruit = list.get(list.indexOf(new Fruit(cb.getText())));
		if (e.getStateChange() == ItemEvent.SELECTED) {
			sum += selectFruit.getPrice();
		} else {
			sum -= selectFruit.getPrice();
		}
		resStr = String.format("현재 %d원 입니다", sum);
		lblRes.setText(resStr);
	}
}
