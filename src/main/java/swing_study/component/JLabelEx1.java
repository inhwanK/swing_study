package swing_study.component;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridLayout;
import java.awt.Image;
import java.io.File;

import javax.swing.JLabel;

public class JLabelEx1 extends JFrame {

	private JPanel contentPane;
	
	public JLabelEx1() {
		initialize();
	}
	private void initialize() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 500);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new GridLayout(0, 1, 0, 0));
		
		String imgPath = System.getProperty("user.dir") + File.separator + "Images"+File.separator;
		ImageIcon icon = new ImageIcon(imgPath + "flower.jpg");
		
		JLabel lblImg1 = new JLabel(icon);
		contentPane.add(lblImg1);
		
		Image img = icon.getImage();
		Image changeimg = img.getScaledInstance(500, 500, Image.SCALE_SMOOTH);
		ImageIcon changeicon = new ImageIcon(changeimg);
		JLabel lblImg2 = new JLabel(changeicon);
		contentPane.add(lblImg2);
	}

}
