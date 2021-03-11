package swing_study.dlg;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.GridLayout;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.io.File;
import java.awt.event.ActionEvent;

public class JOptionPaneConfirmEx extends JFrame implements ActionListener {

	private JPanel contentPane;
	private JButton btnNewButton;
	private JLabel lblRes;

	public JOptionPaneConfirmEx() {
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
		
		lblRes = new JLabel("New label");
		panel.add(lblRes);
		
		JPanel panel_1 = new JPanel();
		panel.add(panel_1);
		panel_1.setLayout(new GridLayout(0, 2, 0, 0));
		
		btnNewButton = new JButton("New button");
		btnNewButton.addActionListener(this);
		panel_1.add(btnNewButton);
	}

	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnNewButton) {
			actionPerformedBtnNewButton(e);
		}
	}
	protected void actionPerformedBtnNewButton(ActionEvent e) {
		String imgPath = System.getProperty("user.dir") + File.separator + "Images"+File.separator;
		ImageIcon icon = new ImageIcon(imgPath + "icon2.png");
		
		int res = JOptionPane.showConfirmDialog(null, "계소무얼 ","Confirm",JOptionPane.YES_NO_CANCEL_OPTION,JOptionPane.WARNING_MESSAGE,icon);
		
		if(res == JOptionPane.YES_OPTION) {
			lblRes.setText("YES");
		}
		if(res == JOptionPane.NO_OPTION) {
			lblRes.setText("NO");
		}
		if(res == JOptionPane.CANCEL_OPTION) {
			lblRes.setText("CANCEL");
		}
		if(res == -1) {
			lblRes.setText("선택하지 않음.");
		}
		
	}
}
