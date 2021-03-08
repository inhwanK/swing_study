package swing_study.component;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridLayout;
import javax.swing.JSlider;
import javax.swing.JLabel;
import java.awt.Color;
import javax.swing.event.ChangeListener;
import javax.swing.event.ChangeEvent;

public class JSliderEx extends JFrame implements ChangeListener {

	private JPanel contentPane;
	private JSlider sliderRed;
	private JSlider sliderGreen;
	private JSlider sliderBlue;
	private JLabel lblColor;

	public JSliderEx() {
		initialize();
		sliderBlue.addChangeListener(this);
		sliderRed.addChangeListener(this);
		sliderGreen.addChangeListener(this);
	}

	private void initialize() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));

		JPanel pCenter = new JPanel();
		pCenter.setBorder(new EmptyBorder(0, 10, 0, 10));
		contentPane.add(pCenter);
		pCenter.setLayout(new GridLayout(0, 1, 0, 0));

		sliderRed = new JSlider();
		sliderRed.setForeground(Color.RED);
		sliderRed.setMaximum(255);
		sliderRed.setMajorTickSpacing(50);
		sliderRed.setMinorTickSpacing(10);
		sliderRed.setPaintLabels(true);
		sliderRed.setValue(128);
		pCenter.add(sliderRed);

		sliderGreen = new JSlider();
		sliderGreen.setMajorTickSpacing(50);
		sliderGreen.setMinorTickSpacing(10);
		sliderGreen.setPaintLabels(true);
		sliderGreen.setMaximum(255);
		sliderGreen.setForeground(Color.GREEN);
		pCenter.add(sliderGreen);
		sliderGreen.setValue(128);
		
		sliderBlue = new JSlider();
		sliderBlue.setForeground(Color.BLUE);
		sliderBlue.setPaintLabels(true);
		sliderBlue.setMinorTickSpacing(10);
		sliderBlue.setMajorTickSpacing(50);
		sliderBlue.setMaximum(255);
		sliderBlue.setValue(128);
		pCenter.add(sliderBlue);

		JPanel pSouth = new JPanel();
		contentPane.add(pSouth, BorderLayout.SOUTH);

		lblColor = new JLabel("New label");
		lblColor.setOpaque(true);
		pSouth.add(lblColor);
	}

	public void stateChanged(ChangeEvent e) {
		int red = 0;
		int green = 0;
		int blue = 0;

		blue = sliderBlue.getValue();
		green = sliderGreen.getValue();
		red = sliderRed.getValue();
		
		String messege = String.format("Red(%d) Green(%d) Blue(%d)", red, green, blue);
		lblColor.setText(messege);
		lblColor.setBackground(new Color(red, green, blue));

	}
}
