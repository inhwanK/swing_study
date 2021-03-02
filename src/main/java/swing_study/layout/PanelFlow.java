package swing_study.layout;

import javax.swing.JPanel;
import java.awt.GridLayout;
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import javax.swing.border.TitledBorder;
import javax.swing.JButton;
import javax.swing.UIManager;
import java.awt.Color;

@SuppressWarnings("serial")
public class PanelFlow extends JPanel {

	public PanelFlow() {

		initialize();
	}
	private void initialize() {
		setLayout(new GridLayout(0, 1, 0, 0));
		
		JPanel panel = new JPanel();
		panel.setBorder(new TitledBorder(null, "\uBB50\uC5EC", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		add(panel);
		panel.setLayout(new FlowLayout(FlowLayout.LEADING, 5, 5));
		
		JButton btnNewButton = new JButton("1");
		panel.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("2");
		panel.add(btnNewButton_1);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "\uBB50\uC5EC 2", TitledBorder.CENTER, TitledBorder.BOTTOM, null, new Color(0, 0, 0)));
		add(panel_1);
		
		JButton btnNewButton_2 = new JButton("1");
		panel_1.add(btnNewButton_2);
		
		JButton btnNewButton_5 = new JButton("2");
		panel_1.add(btnNewButton_5);
		
		JPanel panel_2 = new JPanel();
		FlowLayout flowLayout = (FlowLayout) panel_2.getLayout();
		flowLayout.setAlignment(FlowLayout.TRAILING);
		panel_2.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "alignTrailing", TitledBorder.TRAILING, TitledBorder.BOTTOM, null, new Color(0, 0, 0)));
		add(panel_2);
		
		JButton btnNewButton_3 = new JButton("1");
		panel_2.add(btnNewButton_3);
		
		JButton btnNewButton_4 = new JButton("2");
		panel_2.add(btnNewButton_4);
	}

}
