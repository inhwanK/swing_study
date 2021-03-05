package swing_study.component;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.io.File;
import java.util.List;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridLayout;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.AbstractListModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class JListEx extends JFrame implements ActionListener {

	private JPanel contentPane;
	private String imgPath = System.getProperty("user.dir") + File.separator + "Images" + File.separator;
	private ImageIcon[] icons = { 
			new ImageIcon(imgPath + "icon1.png"),
			new ImageIcon(imgPath + "icon2.png"),
			new ImageIcon(imgPath + "icon3.png"),
			new ImageIcon(imgPath + "icon4.png") };
	private String[] fruits = new String[] {"apple", "banana", "kiwi", "mango", "pear", "peach", "berry", "strawberry", "blackberry"};
	private JList<String> strList;
	private JButton btnNewButton;
	public JListEx() {
		initialize();
	}
	private void initialize() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new GridLayout(0, 3, 10, 0));
		
		strList = new JList<>();
		strList.setListData(fruits);
		contentPane.add(strList);
		
		JList<ImageIcon> list = new JList<>();
		list.setListData(icons);
		contentPane.add(list);
		
		JPanel panel = new JPanel();
		contentPane.add(panel);
		
		btnNewButton = new JButton("New button");
		btnNewButton.addActionListener(this);
		panel.add(btnNewButton);
	}

	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnNewButton) {
			actionPerformedBtnNewButton(e);
		}
	}
	protected void actionPerformedBtnNewButton(ActionEvent e) {
	int idx = strList.getSelectedIndex();
	String selStr = strList.getSelectedValue();
	List<String> selectedList = strList.getSelectedValuesList();
	String msg = String.format("index: %d selectedValue %s selectedList %s",
			idx,selStr,selectedList);
	JOptionPane.showMessageDialog(null, msg);
	}
}
