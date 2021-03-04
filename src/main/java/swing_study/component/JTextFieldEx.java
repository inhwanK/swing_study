package swing_study.component;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.text.TabableView;
import javax.swing.JTextField;
import java.awt.GridLayout;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JPasswordField;
import java.awt.Color;
import com.toedter.calendar.JDateChooser;
import javax.swing.JTextArea;
import java.awt.Dimension;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class JTextFieldEx extends JFrame implements ActionListener {

	private JPanel contentPane;
	private JTextField tfName;
	private JPasswordField pfPass1;
	private JPasswordField pfPass2;
	private JLabel lblConfirm;
	private JTextArea ta;

	public JTextFieldEx() {
		initialize();
	}

	private void initialize() {
		setPreferredSize(new Dimension(450, 500));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 565);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);

		JPanel pWest = new JPanel();
		contentPane.add(pWest, BorderLayout.WEST);

		JPanel pCenter = new JPanel();
		contentPane.add(pCenter, BorderLayout.CENTER);
		pCenter.setLayout(new BorderLayout(0, 0));

		ta = new JTextArea();
		ta.setEnabled(false);
		pCenter.add(ta, BorderLayout.CENTER);

		JPanel pNorth = new JPanel();
		pNorth.setPreferredSize(new Dimension(450, 250));
		pNorth.setBorder(new EmptyBorder(10, 20, 10, 20));
		contentPane.add(pNorth, BorderLayout.NORTH);
		pNorth.setLayout(new GridLayout(0, 2, 10, 10));

		JLabel lblName = new JLabel("성명");
		lblName.setHorizontalAlignment(SwingConstants.RIGHT);
		pNorth.add(lblName);

		tfName = new JTextField();
		tfName.addActionListener(this);
		pNorth.add(tfName);
		tfName.setColumns(10);

		JLabel lblPass1 = new JLabel("비밀번호");
		lblPass1.setHorizontalAlignment(SwingConstants.RIGHT);
		pNorth.add(lblPass1);

		pfPass1 = new JPasswordField();
		pNorth.add(pfPass1);

		JLabel lblPass2 = new JLabel("비밀번호 확인");
		lblPass2.setHorizontalAlignment(SwingConstants.RIGHT);
		pNorth.add(lblPass2);

		pfPass2 = new JPasswordField();
		pfPass2.getDocument().addDocumentListener(new DocumentListener() {

			@Override
			public void removeUpdate(DocumentEvent e) {
				getMessage();
			}

			private void getMessage() {
				String pw1 = new String(pfPass1.getPassword());
				String pw2 = String.valueOf(pfPass2.getPassword());
				if (pw1.equals(pw2)) {
					lblConfirm.setText("일치");
				} else {
					lblConfirm.setText("불일치");
				}
			}

			@Override
			public void insertUpdate(DocumentEvent e) {
				getMessage();
			}

			@Override
			public void changedUpdate(DocumentEvent e) {
				getMessage();
			}
		});
		pNorth.add(pfPass2);

		JPanel panel = new JPanel();
		pNorth.add(panel);

		lblConfirm = new JLabel("불일치");
		lblConfirm.setForeground(Color.RED);
		lblConfirm.setHorizontalAlignment(SwingConstants.CENTER);
		pNorth.add(lblConfirm);

		JLabel lblBirth = new JLabel("생년월일");
		lblBirth.setHorizontalAlignment(SwingConstants.RIGHT);
		pNorth.add(lblBirth);

		JDateChooser dateChooser = new JDateChooser();
		pNorth.add(dateChooser);
	}

	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == tfName) {
			actionPerformedTfName(e);
		}
	}

	protected void actionPerformedTfName(ActionEvent e) {
		if (tfName.getText().length() != 0) {
			ta.append(tfName.getText() + "\n");
			tfName.setText("");
		}
	}
}
