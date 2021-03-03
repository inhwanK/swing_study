package swing_study.component;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.FlowLayout;
import java.io.File;

import javax.swing.ImageIcon;
import javax.swing.SwingConstants;
import java.awt.Color;
import java.awt.event.MouseListener;
import java.awt.event.MouseEvent;

public class LabelEx extends JFrame implements MouseListener {
	private String path = System.getProperty("user.dir") + File.separator + "Images"+File.separator;
	private JPanel contentPane;
	private JLabel lblSouth;
	private JLabel lblCenter;

	public LabelEx() {
		System.out.println(path);
		initialize();
	}

	private void initialize() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));

		JLabel lblNorth = new JLabel("사랑합니다.");
		lblNorth.setOpaque(true);
		lblNorth.setBackground(Color.PINK);
		contentPane.add(lblNorth, BorderLayout.NORTH);

		lblCenter = new JLabel("");
		lblCenter.setBackground(Color.WHITE);
		lblCenter.setIcon(new ImageIcon(path + "common.jfif"));
		contentPane.add(lblCenter);

		lblSouth = new JLabel("New label");
		lblSouth.addMouseListener(this);
		lblSouth.setOpaque(true);
		lblSouth.setBackground(Color.CYAN);
		lblSouth.setIcon(new ImageIcon(path + "common (1).jfif"));
		lblSouth.setHorizontalAlignment(SwingConstants.CENTER);
		contentPane.add(lblSouth, BorderLayout.SOUTH);
	}

	public void mouseClicked(MouseEvent e) {
		if (e.getSource() == lblSouth) {
			mouseClickedLblSouth(e);
		}
	}
	public void mouseEntered(MouseEvent e) {
	}
	public void mouseExited(MouseEvent e) {
	}
	public void mousePressed(MouseEvent e) {
	}
	public void mouseReleased(MouseEvent e) {
	}
	protected void mouseClickedLblSouth(MouseEvent e) {
		lblCenter.setIcon(new ImageIcon(path+"common (1).jfif"));
		lblSouth.setText("010-1234-1234");
		JOptionPane.showMessageDialog(null, "변경 완료");
	}
}
