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

import javax.swing.border.TitledBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.FlowLayout;
import javax.swing.SwingConstants;

@SuppressWarnings("serial")
public class JRadioBtnEx extends JFrame implements ItemListener {

	private JPanel contentPane;
	private String imgPath = System.getProperty("user.dir") + File.separator + "Images" + File.separator;
	private ImageIcon[] icons = { 
			new ImageIcon("C:\\Users\\202-12\\eclipse-workspace\\swing_study\\Images\\KakaoTalk_20210304_121819267.jpg"),
			new ImageIcon(imgPath+"\\KakaoTalk_20210304_121819354.jpg"),
			new ImageIcon(imgPath+"\\KakaoTalk_20210304_121819438.jpg") };
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
		pLeft.setBorder(new TitledBorder(null, "라디오 기본 예제", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		contentPane.add(pLeft);
		pLeft.setLayout(new BorderLayout(0, 0));

		CustomRadioButton panel = new CustomRadioButton();
		pLeft.add(panel);

		JPanel pRight = new JPanel();
		pRight.setBorder(new TitledBorder(null, "\uC751\uC6A9 \uC608\uC81C", TitledBorder.LEADING, TitledBorder.TOP,null, null));
		contentPane.add(pRight);
		pRight.setLayout(new BorderLayout(0, 0));

		JPanel panel_2 = new JPanel();
		pRight.add(panel_2, BorderLayout.CENTER);
		panel_2.setLayout(new BorderLayout(0, 0));
		
		lblImg = new JLabel();
		lblImg.setText("dfdf");
//		lblImg.setIcon(new ImageIcon("C:\\Users\\202-12\\eclipse-workspace\\swing_study\\Images\\KakaoTalk_20210304_121819267.jpg"));
//		lblImg.setIcon(new ImageIcon(imgPath+"KakaoTalk_20210304_121819354.jpg"));
		lblImg.setHorizontalAlignment(SwingConstants.CENTER);
		panel_2.add(lblImg);
		
		CustomRadioButton panel_1 = new CustomRadioButton();
		pRight.add(panel_1, BorderLayout.NORTH);

		for (JRadioButton r : panel.getRdBtns()) {
			r.addItemListener(this);
		}
		
	}

	@Override
	public void itemStateChanged(ItemEvent e) {
		JRadioButton rd = (JRadioButton) e.getSource();
		if (e.getStateChange() == ItemEvent.SELECTED) {
			JOptionPane.showMessageDialog(null, rd.getText());
			String text = rd.getText();
			System.out.println(text);
			switch (text) {
			case "사과":
				lblImg.setIcon(icons[0]);
				break;
			case "배":
				lblImg.setIcon(icons[1]);
				break;
			default:
				lblImg.setIcon(icons[2]);
			}
		}
	}

}
