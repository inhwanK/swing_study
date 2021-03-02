package swing_study.layout;

import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JLabel;

@SuppressWarnings("serial")
public class PanelAbsolute extends JPanel {
	private JTextField textField;
	private JTextField textField_1;

	public PanelAbsolute() {

		initialize();
	}
	private void initialize() {
		setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(24, 164, 116, 21);
		add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setBounds(195, 131, 57, 15);
		add(lblNewLabel);
		
		textField_1 = new JTextField();
		textField_1.setBounds(110, 39, 116, 21);
		add(textField_1);
		textField_1.setColumns(10);
	}
}
