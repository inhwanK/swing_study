package swing_study.layout;

import javax.swing.JPanel;
import java.awt.GridLayout;
import javax.swing.border.TitledBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.BoxLayout;
import java.awt.FlowLayout;

@SuppressWarnings("serial")
public class PanelGrid extends JPanel {
	private JTextField textName;
	private JTextField textNo;
	private JTextField textMajor;
	private JTextField textField_3;

	public PanelGrid() {

		initialize();
	}
	private void initialize() {
		setLayout(new GridLayout(1, 0, 0, 0));
		
		JPanel panel = new JPanel();
		add(panel);
		panel.setLayout(new GridLayout(0, 2, 10, 10));
		
		JLabel lblN믇 = new JLabel("이름");
		lblN믇.setHorizontalAlignment(SwingConstants.TRAILING);
		panel.add(lblN믇);
		
		textName = new JTextField();
		panel.add(textName);
		textName.setColumns(10);
		
		JLabel lblNo = new JLabel("학번");
		lblNo.setHorizontalAlignment(SwingConstants.RIGHT);
		panel.add(lblNo);
		
		textNo = new JTextField();
		panel.add(textNo);
		textNo.setColumns(10);
		
		JLabel lblMajor = new JLabel("학과");
		lblMajor.setHorizontalAlignment(SwingConstants.RIGHT);
		panel.add(lblMajor);
		
		textMajor = new JTextField();
		panel.add(textMajor);
		textMajor.setColumns(10);
		
		JLabel lblField_3 = new JLabel("과목");
		lblField_3.setHorizontalAlignment(SwingConstants.RIGHT);
		panel.add(lblField_3);
		
		textField_3 = new JTextField();
		panel.add(textField_3);
		textField_3.setColumns(10);
	}

}
