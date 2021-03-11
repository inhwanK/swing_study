package swing_study.dlg;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.filechooser.FileNameExtensionFilter;

import java.awt.GridLayout;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFileChooser;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

@SuppressWarnings("serial")
public class JFileChooserEx extends JFrame implements ActionListener {

	private JPanel contentPane;
	private JButton btnOpen;
	private JLabel lblImg;
	private JFileChooser chooser = new JFileChooser();

	
	public JFileChooserEx() {
		initialize();
	}
	private void initialize() {
		setTitle("JFilechooser");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new GridLayout(0, 1, 0, 0));
		
		JPanel panel = new JPanel();
		contentPane.add(panel);
		panel.setLayout(new GridLayout(0, 2, 0, 0));
		
		lblImg = new JLabel("New label");
		panel.add(lblImg);
		
		btnOpen = new JButton("불러오기");
		btnOpen.addActionListener(this);
		panel.add(btnOpen);
	}

	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnOpen) {
			actionPerformedBtnOpen(e);
		}
	}
	protected void actionPerformedBtnOpen(ActionEvent e) {
		FileNameExtensionFilter filter = new FileNameExtensionFilter(
				"JPG & PNG images",
				"jpg","png","gif");
		
		chooser.setFileFilter(filter);
		int res = chooser.showOpenDialog(null);
				
		if(res != JFileChooser.APPROVE_OPTION) {
			JOptionPane.showMessageDialog(null, "파일을 선택하지않았습니다.", "경고", JOptionPane.WARNING_MESSAGE);
			return ;
		}
		String choosefilePath = chooser.getSelectedFile().getPath();
		String choosefileName = chooser.getSelectedFile().getName();
		lblImg.setIcon(new ImageIcon(choosefilePath));
		
		if (btnOpen.getText().equals("불러오기")) {
			btnOpen.setText("저장하기");
			
			
		}
	}
}
