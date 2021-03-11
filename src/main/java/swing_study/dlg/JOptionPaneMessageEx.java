package swing_study.dlg;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridLayout;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.io.File;
import java.awt.event.ActionEvent;

public class JOptionPaneMessageEx extends JFrame implements ActionListener {

	private JPanel contentPane;
	private JButton btnRes;

	
	public JOptionPaneMessageEx() {
		initialize();
	}
	private void initialize() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new GridLayout(0, 1, 0, 0));
		
		JPanel panel = new JPanel();
		contentPane.add(panel);
		panel.setLayout(new GridLayout(0, 2, 0, 0));
		
		JLabel lblNewLabel = new JLabel("New label");
		panel.add(lblNewLabel);
		
		btnRes = new JButton("New button");
		btnRes.addActionListener(this);
		panel.add(btnRes);
	}

	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnRes) {
			actionPerformedBtnRes(e);
		}
	}
	protected void actionPerformedBtnRes(ActionEvent e) {
		String imgPath = System.getProperty("user.dir") + File.separator + "Images"+File.separator;
		ImageIcon icon = new ImageIcon(imgPath + "icon3.png");
		
		JOptionPane.showConfirmDialog(null, "조심 ","조심",JOptionPane.YES_NO_CANCEL_OPTION,JOptionPane.WARNING_MESSAGE,icon);
	}
}
