package swing_study.component;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import swing_study.panel.DeptPanel;

public class DeptFrame extends JFrame {

	private DeptPanel contentPane;

	public DeptFrame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new DeptPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		DeptPanel panel = new DeptPanel();
		contentPane.add(panel, BorderLayout.CENTER);
	}

}
