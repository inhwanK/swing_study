package swing_study.component;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.io.File;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseEvent;

public class JComboBoxEx2 extends JFrame implements ActionListener {

	private JPanel contentPane;
	private JComboBox cmb;
	private JLabel lblImg;
	private String imgPath = System.getProperty("user.dir") + File.separator + "Images"+File.separator;
	private ImageIcon[] icons = { new ImageIcon(imgPath + "apple.jpg"),
			new ImageIcon(imgPath + "cherry.jpg"),
			new ImageIcon(imgPath + "pear.jpg") };
	private String[] fruits = { "apple", "pear", "cherry" };
	
	public JComboBoxEx2() {
		initialize();
	}
	private void initialize() {
		setTitle("JCombobox 응용 예제");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		cmb = new JComboBox(fruits);
		cmb.setSelectedIndex(-1);
		cmb.addActionListener(this);
		contentPane.add(cmb, BorderLayout.NORTH);
		
		lblImg = new JLabel("");
		contentPane.add(lblImg, BorderLayout.CENTER);
	}
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == cmb) {
			actionPerformedCmb(e);
		}
	}
	protected void actionPerformedCmb(ActionEvent e) {
		// 하는 중....
	}
}
