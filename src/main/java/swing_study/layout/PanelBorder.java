package swing_study.layout;

import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import java.awt.Color;

public class PanelBorder extends JPanel {

	
	public PanelBorder() {

		initialize();
	}
	private void initialize() {
		setLayout(new BorderLayout(10, 10));
		
		JLabel lblNewLabel = new JLabel("West");
		lblNewLabel.setBackground(Color.BLUE);
		lblNewLabel.setOpaque(true);
		add(lblNewLabel, BorderLayout.WEST);
		
		JLabel lblNewLabel_1 = new JLabel("North");
		lblNewLabel_1.setBackground(Color.ORANGE);
		lblNewLabel_1.setOpaque(true);//label을 투명 -> 불투명
		add(lblNewLabel_1, BorderLayout.NORTH);
		
		JLabel lblNewLabel_2 = new JLabel("South");
		lblNewLabel_2.setOpaque(true);
		lblNewLabel_2.setBackground(Color.RED);
		add(lblNewLabel_2, BorderLayout.SOUTH);
		
		JLabel lblNewLabel_3 = new JLabel("East");
		lblNewLabel_3.setBackground(Color.PINK);
		lblNewLabel_3.setOpaque(true);
		add(lblNewLabel_3, BorderLayout.EAST);
		
		JLabel lblNewLabel_4 = new JLabel("Center");
		lblNewLabel_4.setBackground(Color.GREEN);
		lblNewLabel_4.setOpaque(true);
		add(lblNewLabel_4, BorderLayout.CENTER);
	}

}
